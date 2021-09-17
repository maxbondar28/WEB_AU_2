package Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeletePTDPage extends BasePage{
    public DeletePTDPage(WebDriver driver) {
        super(driver);
    }

    @Step("Delete PTD")
    public DeletePTDPage deletePtd(){

        driver.findElement
                (By.xpath("//h3[contains(text(),'03/28/2028')]/../descendant::button[@ng-click='deletePTD(ptd.id)']")).click();

        driver.findElement(By.xpath("//button[@class='md-primary md-confirm-button md-button md-ink-ripple md-default-theme']")).click();
        return this;
    }
}
