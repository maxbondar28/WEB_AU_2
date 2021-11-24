package Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateIndividualMessagePage extends BasePage {
    public CreateIndividualMessagePage(WebDriver driver) {
        super(driver);
    }

    @Step("Select individual message type")
    public CreateIndividualMessagePage selectIndividualMessageType(){
        driver.findElement(By.xpath("(//button[@class='message-button-regular'])[1]")).click();
        return this;
    }

    @Step("Select group of receiver")
    public CreateIndividualMessagePage selectTypeOfReceiver(int num) {
        driver.findElement(By.xpath("(//input[@type='radio'])[" + num + "]")).click();
        return this;
    }

    @Step("Select student")
    public CreateIndividualMessagePage selectChild() {
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Maksym Bondar");
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Maksym Bondar']/parent::*")).click();
        return this;
    }

    @Step("Write subject message")
    public CreateIndividualMessagePage writeSubject(String text) {
        driver.findElement(By.xpath("//input[@name='subject']")).sendKeys(text);
        return this;
    }

    @Step("Write message text")
    public CreateIndividualMessagePage writeMessage(String text) {
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//p")).sendKeys(text);
        driver.switchTo().defaultContent();
        return this;
    }

    @Step("Select request information")
    public CreateIndividualMessagePage requestConfirmation() {
        driver.findElement(By.xpath("//input[@name='acknowledgementRequested']")).click();
        return this;
    }

    @Step("Select allow feedback")
    public CreateIndividualMessagePage allowFeedback(String text) {
        driver.findElement(By.xpath("//select")).click();
        driver.findElement(By.xpath("//option[@label='" + text + "']")).click();
        return this;
    }

    @Step("Send message")
    public CreateIndividualMessagePage sendMessage(){
        driver.findElement(By.xpath("//button[@id='submitButton']")).click();
        return this;
    }

    @Step("Check success send message")
    public CreateIndividualMessagePage checkSuccessSendMessage(){
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Message successfully sent!']/parent::*")).isDisplayed();
        return this;
    }
}
