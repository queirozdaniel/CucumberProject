package com.danielqueiroz.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "summary", "html:target/report.html"}, 
		features = {"src/test/resources/features/inserir_conta.feature"},
		glue = {"com.danielqueiroz.steps", "com.danielqueiroz.converters"},
		tags = "not @ignore")
public class RunnerTest {

}
