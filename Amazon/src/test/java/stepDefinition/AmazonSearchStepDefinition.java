package stepDefinition;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.AmazonPage;
import utils.BasePage;
import utils.DriverFactory;


public class AmazonSearchStepDefinition {

	AmazonPage page;
	WebDriver driver;
	@Test
	@Given("que eu estou na pagina inicial da Amazon")
	public void que_eu_estou_na_pagina_inicial_da_amazon() {
		DriverFactory.getDriver().get("https://www.amazon.com.br/");
	}

	@When("eu digito {string} na caixa de pesquisa")
	public void eu_digito_na_caixa_de_pesquisa(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("eu clico no botao de pesquisa")
	public void eu_clico_no_botao_de_pesquisa() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("eu vejo resultados relacionados a {string}")
	public void eu_vejo_resultados_relacionados_a(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
