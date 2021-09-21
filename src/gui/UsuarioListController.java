package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Usuario;

public class UsuarioListController implements Initializable {

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
	
	
	@FXML
	public void onBtNewAction() {
		System.out.println("onBtNewAction");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tableColumnEMail.setCellValueFactory(new PropertyValueFactory<>("eMail"));
		tableColumnSenha.setCellValueFactory(new PropertyValueFactory<>("senha"));
		
		/*Faz a tableview ficar do tamanho da tela*/
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewUsuario.prefHeightProperty().bind(stage.heightProperty());
	}

}
