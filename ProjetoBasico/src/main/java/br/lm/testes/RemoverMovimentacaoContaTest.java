package br.lm.testes;

import org.junit.Assert;
import org.junit.Test;

import br.lm.core.BaseTest;
import br.lm.core.Propriedades;
import br.lm.pages.ContasPage;
import br.lm.pages.MenuPage;

public class RemoverMovimentacaoContaTest extends BaseTest {

	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	
	@Test
	public void test1ExcluirContaComMovimentacao() {
	menuPage.acessarTelaListarConta();
	contasPage.clicarExcluirConta(Propriedades.NOME_CONTA_ALTERADA);
	
	Assert.assertEquals("Conta em uso na movimentações",
			contasPage.ObterMensagemErro());

	
	}	
}
	
	
	
	

