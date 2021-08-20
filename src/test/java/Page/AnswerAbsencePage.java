package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AnswerAbsencePage extends BasePage{
    public AnswerAbsencePage(WebDriver driver) {
        super(driver);
    }

    public AnswerAbsencePage selectAbsenceMessage(){
        driver.findElement(By.xpath("(//li/a/span[text()='Absence message'])[1]")).click();
        return this;
    }
}
