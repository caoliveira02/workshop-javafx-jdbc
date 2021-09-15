package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

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
		System.out.println("onMenuItemCadastroUsuariosAction");
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
		System.out.println("onMenuItemAboutAction");
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
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
