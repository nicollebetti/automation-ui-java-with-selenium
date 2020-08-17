package br.mg.nfsb.execucao;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\nfurlanb\\eclipse-workspace\\automation\\src\\main\\resources\\cenarios",
		glue = "br.mg.nfsb.steps",
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
        dryRun = false,
        strict = true
		)
public class Runner {
	

}
