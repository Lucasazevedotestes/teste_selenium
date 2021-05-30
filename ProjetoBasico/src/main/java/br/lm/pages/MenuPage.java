package br.lm.pages;

import br.lm.core.BasePage;

public class MenuPage extends BasePage {

	public void acessarTelaInserirConta() {
		clicarLink("Contas");
		clicarLink("Adicionar");
	}

	
	public void acessarTelaListarConta() {
		clicarLink("Contas");
		clicarLink("Listar");

	}
	
	public void acessarTelaPrincipal() {
		clicarLink("Home");
	}
	public void acessarTelaInserirMovimentacao() {
		clicarLink("Criar Movimentação");
		
	
	}
	public void acessarTelaResumo() {
		clicarLink("Resumo Mensal");
		
	
	}
	
}
