package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReportProjectPage extends BasePage{
    public ReportProjectPage(WebDriver navegador) {
        super(navegador);
    }

    public MenuPage preencherProjeto(){
        WebElement detalhes = navegador.findElement(By.name("report_bug_form"));

        WebElement category = detalhes.findElement(By.name("category_id"));
        new Select(category).selectByValue("43");

        WebElement reproducibility = detalhes.findElement(By.name("reproducibility"));
        new Select(reproducibility).selectByValue("10");

        WebElement severity = detalhes.findElement(By.name("severity"));
        new Select(severity).selectByValue("60");

        WebElement priority = detalhes.findElement(By.name("priority"));
        new Select(priority).selectByValue("40");

        WebElement profile = detalhes.findElement(By.name("profile_id"));
        new Select(profile).selectByValue("74");

        detalhes.findElement(By.name("summary")).sendKeys("Mensagem de erro ao cadastrar cliente");
        detalhes.findElement(By.name("description")).sendKeys("Ao efetuar o cadastro de um " +
                "cliente, ocorre a seguinte mensagem de erro: ......");
        detalhes.findElement(By.name("steps_to_reproduce")).sendKeys("1-Informar nome,...");
        detalhes.findElement(By.name("additional_info")).sendKeys("Informações adicionais:");
        detalhes.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[13]/td[2]/label[2]/input")).click();
        detalhes.findElement(By.className("button")).click();

        return new MenuPage(navegador);
    }

}
