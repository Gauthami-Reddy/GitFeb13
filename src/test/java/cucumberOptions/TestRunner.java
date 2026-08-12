package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

features="src/test/resources/features",

glue={"stepDefinations","hooks"},

plugin= {

"pretty",

"html:target/cucumber.html",

"json:target/cucumber.json",

"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"

}

)

public class TestRunner extends AbstractTestNGCucumberTests {

}