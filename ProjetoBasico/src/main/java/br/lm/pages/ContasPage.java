package br.lm.pages;

import org.openqa.selenium.By;

import br.lm.core.BasePage;

public class ContasPage extends BasePage {

	public void SetNome(String nome ) {
		escrever("nome", nome);
		
	}
	
	public void salvar() {
		clicarBotaoPorTexto("Salvar");
	}
	
	public String ObterMensagemSucesso()  {
		return obterTexto(By.xpath("//div[@class= 'alert alert-success']"));
	
	}

	public String ObterMensagemErro()  {
		return obterTexto(By.xpath("//div[@class= 'alert alert-danger']"));
	
	}
	public void clicarAlterarConta(String string) {
			obterCelula("Conta", string, "Ações", "tabelaContas")
			.findElement(By.xpath(".//span[@class='glyphicon glyphicon-edit']")).click();
			
			
	}
	
	
	public void clicarExcluirConta(String string) {
		obterCelula("Conta", string, "Ações", "tabelaContas")
		.findElement(By.xpath(".//span[@class='glyphicon glyphicon-remove-circle']")).click();
		
		
}
	 // sugestao para tabela //
	public void alterarclick() {
		clicarBotao(By.xpath("//*[@id='tabelaContas']//tr[3]//span[@class='glyphicon glyphicon-edit']"));
	}
	
}
