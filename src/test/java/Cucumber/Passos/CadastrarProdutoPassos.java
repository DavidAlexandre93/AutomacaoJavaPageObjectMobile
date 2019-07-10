package Cucumber.Passos;

import Funcoes.Utils;
import Constante.SetCapabilities;
import Cucumber.Steps.CadastrarProdutoSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CadastrarProdutoPassos {

	CadastrarProdutoSteps run = new CadastrarProdutoSteps();
	CadastrarProdutoSteps cadastro = new CadastrarProdutoSteps();
		
	@Given("^que acessou a tela principal$")
	public void acessarTelaPrincipal()throws Throwable {
		SetCapabilities.SetUpCapabilities();
		Utils.WaitElement();
	}

	@When("^preenche o campo nome$")
	public void preencherNome()throws Throwable {
		CadastrarProdutoSteps.DigitarNome();
	}

	@When("^acessa o confirmar$") 
	public void confirmarNome()throws Throwable {
		CadastrarProdutoSteps.ClicarConfirmar();
	}

	@When("^acessa novo produto$")
    public void clicarNovoProduto()throws Throwable {
		CadastrarProdutoSteps.NovoProduto();
	}

	@When("^preenche o campo produto$") 
	public void preencherProduto()throws Throwable {
		CadastrarProdutoSteps.NomeProduto();
	}

	@When("^preenche o campo valor$") 
	public void preencherValor()throws Throwable {
		CadastrarProdutoSteps.PrecoProduto();
	}
	
	@When("^acessa o campo data$") 
	public void clicarNoCampoData()throws Throwable{
		CadastrarProdutoSteps.ClicarCampoCalendar();
	}

	@When("^seleciona uma data$")
	public void selecionarData()throws Throwable{
		CadastrarProdutoSteps.SelecionarDate();
	}

	@When("^acessa salvar$")
	public void acessaSalvar()throws Throwable{
		CadastrarProdutoSteps.ClicarSalvar();
	}

	@Then("^realiza o cadastro de produto com sucesso$") 
	public void realizarCadastroSucesso()throws Throwable {
		Utils.WaitElement();
		CadastrarProdutoSteps.ClicarOK();
        Utils.WaitElement();
		CadastrarProdutoSteps.ValidarProdutoCadastrado();
		CadastrarProdutoSteps.Evidencias();
	}

}
