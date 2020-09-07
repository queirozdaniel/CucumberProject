package com.danielqueiroz.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","summary"}, 
		features = {"src/test/resources/features/aprender_cucumber.feature"},
		glue = {"com.danielqueiroz.steps", "com.danielqueiroz.converters"})
public class Runner {

}
