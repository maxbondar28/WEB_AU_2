package Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CloseAbsencePage extends BasePage{
    public CloseAbsencePage(WebDriver driver) {
        super(driver);
    }

    @Step("Close absence message")
    public CloseAbsencePage closeAbsencebutton() {
        driver.findElement(By.xpath("//button[@ng-click='showCloseAbsence(message.von)']")).click();
        return this;
    }

    @Step("Press Ok on window")
    public CloseAbsencePage selectOkonwindow() {
        driver.findElement(By.xpath("//button[@ng-click='ok()']")).click();
        return this;
    }
}
