package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
import suport.Web;

public class MantisTest {
    private  WebDriver navegador;
    @Before
    public void setup(){
        navegador = Web.createBrowser();
    }
    @Test
    public void testaCadastroBug(){
        new LoginPage(navegador)
                .fazerLogin("matheus.barcelos","Gicah2oasus")
                .clicarReport()
                .selecionarProjeto()
                .preencherProjeto();
    }
    @After
        public void close(){
        navegador.quit();
     }
}
