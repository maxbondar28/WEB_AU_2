package Page;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class DeletePTDPage extends BasePage{
    public DeletePTDPage(WebDriver driver) {
        super(driver);
    }

    public DeletePTDPage deletePtd(){

        driver.findElement
                (By.xpath("//h3[contains(text(),'03/28/2028')]/../descendant::button[@ng-click='deletePTD(ptd.id)']")).click();

        try {
            driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
        }
        driver.switchTo().defaultContent();

        return this;
    }
}
