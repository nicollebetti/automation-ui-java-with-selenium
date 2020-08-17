package br.mg.nfsb.metodos;

import java.util.concurrent.TimeUnit;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

public class metodos {
	
	public WebDriver driver;
	
	public void chamandoChromeDriver()
	
	{   
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("https://mantis-prova.base2.com.br/login_page.php");
    	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	}
	
	public void LoginUsuarioValido()
	
	{   
		driver.findElement(By.name("username")).sendKeys("nicolle.furlan");
    	driver.findElement(By.name("password")).sendKeys("ponei");
    	driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[6]/td/input")).click();
    	
	}
	
	
	public String geradorDescricao() {
		Faker faker = new Faker();
		String name = faker.name().fullName();
		System.out.println("name");
		return name;
		
		
	}
	
	public static void main(String[] args) {
		 
		metodos m = new metodos();
		m.chamandoChromeDriver();
		
		
		
	}

}
