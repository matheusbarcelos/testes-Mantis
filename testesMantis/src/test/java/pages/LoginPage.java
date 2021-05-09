package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver navegador) {
        super(navegador);
    }

    public LoginPage typeLogin(String login){
        navegador.findElement(By.name("username")).sendKeys(login);
        return this;
    }
    public LoginPage typePassword(String password){
        navegador.findElement(By.name("password")).sendKeys(password);
        return this;
    }
    public MenuPage clickLogin(){
        navegador.findElement(By.className("button")).click();
        return new MenuPage(navegador);
    }

    public MenuPage fazerLogin(String login, String password){
        typeLogin(login);
        typePassword(password);
        clickLogin();
        return new MenuPage(navegador);
    }
}
