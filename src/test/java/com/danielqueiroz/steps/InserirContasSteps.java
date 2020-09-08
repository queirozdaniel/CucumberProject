package com.danielqueiroz.steps;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class InserirContasSteps {

	private WebDriver driver;
	
	@Dado("que estou acessando a aplicação")
	public void que_estou_acessando_a_aplicação() {
		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com");
	}

	@Quando("informo o usuário {string}")
	public void informo_o_usuário(String string) {
		driver.findElement(By.id("email")).sendKeys(string);
	}

	@Quando("a senha {string}")
	public void a_senha(String string) {
		driver.findElement(By.name("senha")).sendKeys(string);
	}

	@Quando("seleciono entrar")
	public void seleciono_entrar() {
		driver.findElement(By.tagName("button")).click();
	}

	@Entao("visualizo a página inicial")
	public void visualizo_a_página_inicial() {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assertions.assertEquals("Bem vindo, Daniel Queiroz!", texto);
	}

	@Quando("seleciono Contas")
	public void seleciono_contas() {
		driver.findElement(By.linkText("Contas")).click();
	}

	@Quando("seleciono Adicionar")
	public void seleciono_adicionar() {
		driver.findElement(By.linkText("Adicionar")).click();
	}

	@Quando("informo a conta {string}")
	public void informo_a_conta(String string) {
		driver.findElement(By.id("nome")).sendKeys(string);
	}

	@Quando("seleciono Salvar")
	public void seleciono_salvar() {
		driver.findElement(By.tagName("button")).click();
	}

	@Entao("a conta é inserida com sucesso")
	public void a_conta_é_inserida_com_sucesso() {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assertions.assertEquals("Conta adicionada com sucesso!", texto);
	}
	
}
