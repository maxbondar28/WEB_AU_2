package Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateEmergencyMessagePage extends BasePage{
    public CreateEmergencyMessagePage(WebDriver driver) {
        super(driver);
    }

    @Step("Select emergency type of message")
    public CreateEmergencyMessagePage selectEmergencyMessageType(){
        driver.findElement(By.xpath("//button[@class='message-button-emergency-management']")).click();
        return this;
    }

    @Step("Select student")
    public CreateEmergencyMessagePage selectChildEmergency() {
        driver.findElement(By.xpath("//span[text()='Start typing for search…']")).click();
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Max Bondarenko");
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Max Bondarenko']/parent::*")).click();
        return this;
    }

    @Step("Send emergency message")
    public CreateEmergencyMessagePage sendEmergencyMessage(){
        driver.findElement(By.xpath("//button[@id='emergencySubmitButton']")).click();
        return this;
    }

    @Step("Check success send message")
    public CreateEmergencyMessagePage checkSuccessSendMessage(){
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Emergency message successfully sent!']/parent::*")).isDisplayed();
        return this;
    }

}
