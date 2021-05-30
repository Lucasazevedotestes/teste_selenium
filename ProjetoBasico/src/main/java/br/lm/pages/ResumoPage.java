package br.lm.pages;

import org.openqa.selenium.By;

import br.lm.core.BasePage;

public class ResumoPage extends BasePage {

	public void excluirMovimentacao() {
		clicarBotao(By.xpath("//span[@class='glyphicon glyphicon-remove-circle']"));
	}

	public String ObterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class= 'alert alert-success']"));

	}
}