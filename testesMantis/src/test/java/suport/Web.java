package suport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
    public static WebDriver createBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\projetos\\selenium\\driver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get("http://mantis-prova.base2.com.br");
        return navegador;
    }
}
