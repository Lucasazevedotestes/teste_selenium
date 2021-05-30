package br.lm.testes;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.lm.core.BaseTest;
import br.lm.core.Propriedades;
import br.lm.pages.ContasPage;
import br.lm.pages.MenuPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContaTest extends BaseTest {

	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();

	@Test
	public void test1InserirConta() {
		menuPage.acessarTelaInserirConta();
		contasPage.SetNome("Conta do Teste");
		contasPage.salvar();

		Assert.assertEquals("Conta adicionada com sucesso!", contasPage.ObterMensagemSucesso());
	}

	@Test
	public void test2AlterarConta() {
		
		menuPage.acessarTelaListarConta();

		contasPage.clicarAlterarConta("Conta do Teste");

		// contasPage.alterarclick();
		contasPage.SetNome(Propriedades.NOME_CONTA_ALTERADA);

		contasPage.salvar();

		Assert.assertEquals("Conta alterada com sucesso!", contasPage.ObterMensagemSucesso());

	}

	@Test
	public void test3InserirContaMesmoNome() {
	
		menuPage.acessarTelaInserirConta();
		contasPage.SetNome(Propriedades.NOME_CONTA_ALTERADA);
		contasPage.salvar();

		Assert.assertEquals("Já existe uma conta com esse nome!", contasPage.ObterMensagemErro());

	}

	
	}

