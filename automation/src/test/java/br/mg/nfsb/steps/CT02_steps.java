package br.mg.nfsb.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import br.mg.nfsb.metodos.metodos;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CT02_steps extends metodos {
	
	@Dado("^que eu acesse o sistema com meu usuario$")
	public void que_eu_acesse_o_sistema_com_meu_usuario() throws Throwable {
	    chamandoChromeDriver();
	    LoginUsuarioValido();
	    
	}

	@Quando("^clico em report issue$")
	public void clico_em_report_issue() throws Throwable {
		driver.findElement(By.linkText("Report Issue")).click();
	    driver.findElement(By.cssSelector("td > select")).click();
	}

	@Quando("^seleciono o projeto$")
	public void seleciono_o_projeto() throws Throwable {
		WebElement dropdown = driver.findElement(By.cssSelector("td > select"));
	    dropdown.findElement(By.xpath("//option[. = 'Nicolle Furlan´s Project']")).click();
	}

	@Quando("^clico no botao criar$")
	public void clico_no_botao_criar() throws Throwable {
		driver.findElement(By.cssSelector(".button")).click();   
	}

	@Quando("^preencha os detalhes de report$")
	public void preencha_os_detalhes_de_report() throws Throwable {
	    driver.findElement(By.name("category_id")).click();
	    WebElement dropdown1 = driver.findElement(By.name("category_id"));
	    dropdown1.findElement(By.xpath("//option[. = '[All Projects] asasasasa']")).click();
	    driver.findElement(By.name("summary")).click();
	    driver.findElement(By.name("summary")).sendKeys("hi2");
	    driver.findElement(By.name("description")).click();
	    driver.findElement(By.name("description")).sendKeys("Teste2");
	    driver.findElement(By.name("steps_to_reproduce")).click();
	    driver.findElement(By.name("steps_to_reproduce")).sendKeys("Step 1 ...");
	}

	@Quando("^clico em submeter$")
	public void clico_em_submeter() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[15]/td[2]/input")).click();
	}

	@Entao("^visualizo a tabela Viewing Issues$")
	public void visualizo_a_tabela_Viewing_Issues() throws Throwable {
		
	//	driver.findElement(By.xpath("//*[@id=\"buglist\"]/tbody/tr[4]/td[1]"));
	}
	
	@After
	public void fecharBrowser() {
		driver.quit();
	}

}
