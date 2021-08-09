package Page;

import Test.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AnswerMessagePage extends BasePage {
    public AnswerMessagePage(WebDriver driver) {
        super(driver);
    }

    public AnswerMessagePage selectNormalMessage(){
        driver.findElement(By.xpath("(//li/a/span[text()='AUT 2'])[1]")).click();
        return this;
    }

    public AnswerMessagePage writeMessage(String text){
        driver.findElement(By.xpath("//textarea")).sendKeys(text);
        return this;
    }

    public AnswerMessagePage confirmation(){
        driver.findElement(By.xpath("//i[@class='fa fa-eye']")).click();
        return this;

    }

    public AnswerMessagePage sendAnswer(){
        driver.findElement(By.xpath("(//button[@ng-click='sendFeedback()'])[2]")).click();
        return this;
    }

}



