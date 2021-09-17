package Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AnswerEmergencyMessagePage extends BasePage{
    public AnswerEmergencyMessagePage(WebDriver driver) {
        super(driver);
    }

    @Step("Select emergency message")
    public AnswerEmergencyMessagePage selectEmergencyMessage(){
        driver.findElement(By.xpath("(//li/a/span[text()='Emergency message'])[1]")).click();
        return this;
    }
}
