package Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage checkPageisCorrect(){
        isElementDisplayed(By.xpath("//h2[text()='Login']"));
        return this;
    }

    @Step("Input login")
    public LoginPage writeLogin(String text) {
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(text);
        return this;
    }

    @Step("Input password")
    public LoginPage writePassword(String text) {
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(text);
        return this;
    }

    @Step ("Press login button")
    public LoginPage pressLogin(){
        driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
        return this;
    }

    @Step ("Check login succesfuly")
    public LoginPage checkSuccessLogin(){
        isElementDisplayed(By.xpath("(//span[contains(., 't.admin3')])[1]"));
        return this;
    }
}
