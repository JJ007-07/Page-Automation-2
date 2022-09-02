package com.co.sofiaplus.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/sofiaplus.feature",
snippets = SnippetType.CAMELCASE,
glue = "com.co.sofiaplus.stepsdefinitions")

public class Runner {
}