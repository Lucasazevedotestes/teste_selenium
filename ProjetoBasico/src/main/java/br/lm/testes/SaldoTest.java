package br.lm.testes;

import org.junit.Assert;
import org.junit.Test;

import br.lm.core.BaseTest;
import br.lm.core.Propriedades;
import br.lm.pages.HomePage;
import br.lm.pages.MenuPage;

public class SaldoTest extends BaseTest {
	HomePage page = new HomePage();
	MenuPage menu = new MenuPage();
	@Test
	public void testSaldoConta() {
			menu.acessarTelaPrincipal();
			Assert.assertEquals("500.00", page.obterSaldoConta(Propriedades.NOME_CONTA_ALTERADA));
			
	}
		
		
	}
	

