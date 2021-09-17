package Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AnswerMessagePage extends BasePage {
    public AnswerMessagePage(WebDriver driver) {
        super(driver);
    }

    @Step("Select normal message")
    public AnswerMessagePage selectNormalMessage(){
        driver.findElement(By.xpath("(//li/a/span[text()='AUT 2'])[1]")).click();
        return this;
    }

    @Step("Write text of message")
    public AnswerMessagePage writeMessage(String text){
        driver.findElement(By.xpath("//textarea")).sendKeys(text);
        return this;
    }

    @Step("Select confirmation")
    public AnswerMessagePage confirmation(){
        driver.findElement(By.xpath("//i[@class='fa fa-eye']")).click();
        return this;
    }

    @Step("Press 'send message' button")
    public AnswerMessagePage sendAnswer(){
        driver.findElement(By.xpath("(//button[@ng-click='sendFeedback()'])[2]")).click();
        return this;
    }

}



