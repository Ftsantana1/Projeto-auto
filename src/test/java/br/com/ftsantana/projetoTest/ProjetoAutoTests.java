package br.com.ftsantana.projetoTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


@DisplayName("Projeto para Testes Automatizados")
public class ProjetoAutoTests {
    @Test
    @DisplayName("Fazendo Login na Tela")
    public void testLoginNaTelaUsuarioValido(){
        //Abrir Chrome
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver navegador = new ChromeDriver(options);

        //Abrir o site
        navegador.get("http://localhost:4200/");
        //Vou fazer o preenchimento da variavel login com usuario valido
        navegador.findElement(By.id("username")).sendKeys("usuario1");
        //Vou fazer o preenchimento da variavel senha com senha valida
        navegador.findElement(By.id("password")).sendKeys("1234");
        //Vou clicar em confirmar
        navegador.findElement(By.id("botaoDeLogin")).click();
    }

    @Test
    @DisplayName("Fazendo Login na Tela")
    public void testLoginNaTelaUsuarioInvalido(){
        //Abrir Chrome
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver navegador = new ChromeDriver(options);

        //Abrir o site
        navegador.get("http://localhost:4200/");
        //Vou fazer o preenchimento da variavel login com usuario invalido
        navegador.findElement(By.id("username")).sendKeys("usuario4");
        //Vou fazer o preenchimento da variavel senha com senha invalida
        navegador.findElement(By.id("password")).sendKeys("12345");
        //Vou clicar em confirmar
        navegador.findElement(By.id("botaoDeLogin")).click();
    }

    @Test
    @DisplayName("Fazendo Login na Tela")
    public void testLoginNaTelaUsuarioInvalidoDepoisValido(){
        //Abrir Chrome
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver navegador = new ChromeDriver(options);

        //Abrir o site
        navegador.get("http://localhost:4200/");
        //Vou fazer o preenchimento da variavel login com usuario invalido
        navegador.findElement(By.id("username")).sendKeys("usuario4");
        //Vou fazer o preenchimento da variavel senha com senha invalida
        navegador.findElement(By.id("password")).sendKeys("12345");
        //Vou clicar em confirmar
        navegador.findElement(By.id("botaoDeLogin")).click();

        WebDriverWait wait = new WebDriverWait(navegador, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = navegador.switchTo().alert();
        alert.accept();

        //Vou fazer o preenchimento da variavel login com usuario valido
        navegador.findElement(By.id("username")).sendKeys("usuario1");
        //Vou fazer o preenchimento da variavel senha com senha valida
        navegador.findElement(By.id("password")).sendKeys("1234");
        //Vou clicar em confirmar
        navegador.findElement(By.id("botaoDeLogin")).click();

    }

}
