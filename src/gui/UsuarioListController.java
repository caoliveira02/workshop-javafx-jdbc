package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Usuario;
import model.services.UsuarioServices;

public class UsuarioListController implements Initializable {

	private UsuarioServices service;
	
	@FXML
	private TableView<Usuario> tableViewUsuario;
	
	@FXML
	private TableColumn<Usuario, Integer> tableColumnId;
	
	@FXML
	private TableColumn<Usuario, String> tableColumnNome;
	
	@FXML
	private TableColumn<Usuario, String> tableColumnEMail;	
	
	@FXML
	private TableColumn<Usuario, String> tableColumnSenha;
	
	@FXML
	private Button btNew;
	
	private ObservableList<Usuario> obsList;
	
	@FXML
	public void onBtNewAction() {
		System.out.println("onBtNewAction");
	}
	
	public void setUsuarioServices(UsuarioServices service ) {
		this.service = service;
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("name"));
		tableColumnEMail.setCellValueFactory(new PropertyValueFactory<>("email"));
		tableColumnSenha.setCellValueFactory(new PropertyValueFactory<>("senha"));
		
		/*Faz a tableview ficar do tamanho da tela*/
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewUsuario.prefHeightProperty().bind(stage.heightProperty());
	}
	
	public void updateTableView() {
		if (service == null) {
			throw new IllegalStateException("O service esta nulo.");
		}
		List<Usuario> list = service.findAll();
		obsList = FXCollections.observableArrayList(list);
		tableViewUsuario.setItems(obsList);
	}

}
