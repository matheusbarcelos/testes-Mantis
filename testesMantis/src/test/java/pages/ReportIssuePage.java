package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReportIssuePage extends BasePage{
    public ReportIssuePage(WebDriver navegador) {
        super(navegador);
    }

    public ReportProjectPage selecionarProjeto(){
        WebElement selecao = navegador.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[2]/td[2]/select"));
        Select comboBox = new Select(selecao);
        comboBox.selectByValue("25");
        navegador.findElement(By.className("button")).click();
        return new ReportProjectPage(navegador);
    }
}
