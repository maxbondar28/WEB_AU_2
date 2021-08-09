package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AnswerEmergencyMessagePage extends BasePage{
    public AnswerEmergencyMessagePage(WebDriver driver) {
        super(driver);
    }

    public AnswerEmergencyMessagePage selectEmergencyMessage(){
        driver.findElement(By.xpath("(//li/a/span[text()='Emergency message'])[1]")).click();
        return this;
    }
}
