package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage extends BasePage {

    public MenuPage(WebDriver navegador) {
        super(navegador);
    }

    public ReportIssuePage clicarReport(){
        navegador.findElement(By.linkText("Report Issue")).click();
        return new ReportIssuePage(navegador);
    }
}
