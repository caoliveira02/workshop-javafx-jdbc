package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import model.services.UsuarioServices;



public class MainViewController implements Initializable {
	
	/******************************************************************/
	/*   Cadastros 													  */
	/******************************************************************/
	
	@FXML
	private MenuItem menuItemCadastroUsuarios; 

	@FXML
	private MenuItem menuItemCadastroSistemas;
	
	@FXML
	private MenuItem menuItemCadastroChamados;
	
	@FXML
	public void onMenuItemCadastroUsuariosAction() {
		loadView("/gui/UsuariosList.fxml", (UsuarioListController controller) -> {
			controller.setUsuarioServices(new UsuarioServices());
			controller.updateTableView();
		});
	}
	
	@FXML
	public void onMenuItemCadastroSistemasAction() {
		System.out.println("onMenuItemCadastroSistemasAction");
	}
	
	@FXML
	public void onMenuItemCadastroChamadosAction() {
		System.out.println("onMenuItemCadastroChamadosAction");
	}
	
	
	/******************************************************************/
	/*   Consultas 													  */
	/******************************************************************/
	
	@FXML
	private MenuItem menuItemConsutaUsuarios; 

	@FXML
	private MenuItem menuItemConsultaSistemas;
	
	@FXML
	private MenuItem menuItemConsultaChamados;
	
	@FXML
	public void onMenuItemConsultaUsuariosAction() {
		System.out.println("onMenuItemConsultaUsuariosAction");
	}
	
	@FXML
	public void onMenuItemConsultaSistemasAction() {
		System.out.println("onMenuItemConsultaSistemasAction");
	}
	
	@FXML
	public void onMenuItemConsultaChamadosAction() {
		System.out.println("onMenuItemConsultaChamadosAction");
	}	
	
	
	/******************************************************************/
	/*   Relatorios													  */
	/******************************************************************/
	
	@FXML
	private MenuItem menuItemRelatorioUsuarios; 

	@FXML
	private MenuItem menuItemRelatorioSistemas;
	
	@FXML
	private MenuItem menuItemRelatorioChamados;
	
	@FXML
	public void onMenuItemRelatorioUsuariosAction() {
		System.out.println("onMenuItemRelatorioUsuariosAction");
	}
	
	@FXML
	public void onMenuItemRelatorioSistemasAction() {
		System.out.println("onMenuItemRelatorioSistemasAction");
	}
	
	@FXML
	public void onMenuItemRelatorioChamadosAction() {
		System.out.println("onMenuItemRelatorioChamadosAction");
	}	
	
	/******************************************************************/
	/*   About														  */
	/******************************************************************/
	
	@FXML
	private MenuItem menuItemAbout; 

	@FXML
	public void onMenuItemAboutAction() {
		loadView("/gui/About.fxml", x -> {});
	}

	/******************************************************************/
	/*   Sair														  */
	/******************************************************************/
	
	@FXML
	private MenuItem menuItemSair; 

	@FXML
	public void onMenuItemSairAction() {
		System.out.println("onMenuItemSairAction");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}
	
	private synchronized <T> void loadView(String absoluteName, Consumer<T> initializinAction) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			
			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());
			
			T controller = loader.getController();
			initializinAction.accept(controller);
			
		}
		catch (IOException e) {
			Alerts.showAlert("IO Exception", "Erro loading View", e.getMessage(), AlertType.ERROR);
		}
	}
}
