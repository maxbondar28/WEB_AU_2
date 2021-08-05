package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateMessagePage extends BasePage {
    public CreateMessagePage(WebDriver driver) {
        super(driver);
    }

    public CreateMessagePage selectIndividualMessageType(){
        driver.findElement(By.xpath("(//button[@class='message-button-regular'])[1]")).click();
        return this;
    }

    public CreateMessagePage selectTypeOfReceiver(int num) {
        driver.findElement(By.xpath("(//input[@type='radio'])[" + num + "]")).click();
        return this;
    }

    public CreateMessagePage selectChild() {
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Max Bondarenko");
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Max Bondarenko']/parent::*")).click();
        return this;
    }

    public CreateMessagePage writeSubject(String text) {
        driver.findElement(By.xpath("//input[@name='subject']")).sendKeys(text);
        return this;
    }

    public CreateMessagePage writeMessage(String text) {
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//p")).sendKeys(text);
        driver.switchTo().defaultContent();
        return this;
    }

    public CreateMessagePage requestConfirmation() {
        driver.findElement(By.xpath("//input[@name='acknowledgementRequested']")).click();
        return this;

    }

    public CreateMessagePage allowFeedback(String text) {
        driver.findElement(By.xpath("//select")).click();
        driver.findElement(By.xpath("//option[@label='" + text + "']")).click();
        return this;
    }

    public CreateMessagePage sendMessage(){
        driver.findElement(By.xpath("//button[@id='submitButton']")).click();
        return this;
    }

    public CreateMessagePage checkSuccesSendMessage(){
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Message successfully sent!']/parent::*")).isDisplayed();
        return this;
    }
}
