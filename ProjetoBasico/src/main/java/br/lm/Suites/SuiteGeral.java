package br.lm.Suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.lm.core.DriverFactory;
import br.lm.pages.LoginPage;
import br.lm.testes.ContaTest;
import br.lm.testes.MovimentacaoTest;
import br.lm.testes.RemoverMovimentacaoContaTest;
import br.lm.testes.ResumoTest;
import br.lm.testes.SaldoTest;


	
	@RunWith(Suite.class)
	@SuiteClasses({ 
		ContaTest.class,
		MovimentacaoTest.class,
		RemoverMovimentacaoContaTest.class, 
		SaldoTest.class,
		ResumoTest.class,
		
		
	})

	public class SuiteGeral {
		private static LoginPage page = new LoginPage();
		
		@BeforeClass	
		public static void inicializa() {
			page.acessarTelaInicial();
			page.setEmail("lucas@gmail");
			page.SetSenha("flamengo88");
			page.entrar();

		
		}

		@AfterClass
		public static void finaliza() {
			DriverFactory.killDriver();
		}
		
}