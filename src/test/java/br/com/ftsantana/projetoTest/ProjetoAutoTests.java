package br.com.ftsantana.projetoTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


@DisplayName("Projeto para Testes Automatizados")
public class ProjetoAutoTests {
    @Test
    @DisplayName("Fazendo Login na Tela")
    public void testFazendoLoginNaTela(){
        //Abrir Chrome
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver navegador = new ChromeDriver(options);

        //Abrir o site
        navegador.get("http://localhost:4200/");
        //Vou fazer o preenchimento da variavel login
        navegador.findElement(By.id("username")).sendKeys("usuario1");
        //Vou fazer o preenchimento da variavel senha
        navegador.findElement(By.id("password")).sendKeys("1234");
        //Vou clicar em confirmar
        navegador.findElement(By.id("botaoDeLogin")).click();
    }

    @Test
    @DisplayName("Fazendo Login na Tela")
    public void testLoginNaTelaComErro(){
        //Abrir Chrome
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver navegador = new ChromeDriver(options);

        //Abrir o site
        navegador.get("http://localhost:4200/");
        //Vou fazer o preenchimento da variavel login
        navegador.findElement(By.id("username")).sendKeys("usuario4");
        //Vou fazer o preenchimento da variavel senha
        navegador.findElement(By.id("password")).sendKeys("12345");
        //Vou clicar em confirmar
        navegador.findElement(By.id("botaoDeLogin")).click();
    }

}
