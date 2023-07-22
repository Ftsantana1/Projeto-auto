package br.com.ftsantana.projetoTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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

        //Vou fazer o preenchimento da variavel senha

        //Vou clicar em confirmar
    }
}
