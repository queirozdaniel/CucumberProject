package com.danielqueiroz.runners;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "summary", "html:target/report.html"}, 
		features = {"src/test/resources/features/inserir_conta.feature"},
		glue = {"com.danielqueiroz.steps", "com.danielqueiroz.converters"},
		tags = "not @ignore",
		dryRun = false)
public class RunnerTest {

	@BeforeClass
	public static void reset() {
		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com");
		driver.findElement(By.id("email")).sendKeys("daniel@as");
		driver.findElement(By.name("senha")).sendKeys("abc");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("reset")).click();
		driver.quit();
	}
	
	
}
