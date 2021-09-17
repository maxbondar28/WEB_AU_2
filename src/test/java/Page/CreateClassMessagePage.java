package Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateClassMessagePage extends BasePage{
    public CreateClassMessagePage(WebDriver driver) {
        super(driver);
    }

    @Step("Select class message type")
    public CreateClassMessagePage selectClassMessageType(){
        driver.findElement(By.xpath("(//button[@class='message-button-regular'])[2]")).click();
        return this;
    }

    @Step("Select class")
    public CreateClassMessagePage selectClass(){
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Autotest class");
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Autotest Class']/parent::*")).click();
        return this;
    }
}
