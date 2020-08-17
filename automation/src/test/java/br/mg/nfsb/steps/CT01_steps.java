package br.mg.nfsb.steps;

import static org.junit.Assert.*;
import org.openqa.selenium.By;
import br.mg.nfsb.metodos.metodos;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class CT01_steps extends metodos{
         
	@Dado("^que eu acesse o sistema$")
	public void que_eu_acesse_o_sistema() throws Throwable {
		chamandoChromeDriver();
	}

	@Quando("^informo o usuario valido \"([^\"]*)\"$")
	public void informo_o_usuario_valido(String arg1) throws Throwable {
			driver.findElement(By.name("username")).sendKeys(arg1);
	}

	@Quando("^a senha valida \"([^\"]*)\"$")
	public void a_senha_valida(String arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(arg1);
	
	}

	@Quando("^clico em entrar$")
	public void clico_em_entrar() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[6]/td/input")).click();
	}

	@Entao("^visualizo a pagina inicial$")
	public void visualizo_a_pagina_inicial() throws Throwable {
		String texto = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/a[7]")).getText();
		assertEquals("Logout", texto);
	}
		
//	@After
//	public void fecharBrowser() {
//		driver.quit();
//	}

}
