package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CloseAbsencePage extends BasePage{
    public CloseAbsencePage(WebDriver driver) {
        super(driver);
    }


    public CloseAbsencePage closeAbsencebutton() {
        driver.findElement(By.xpath("//button[@ng-click='showCloseAbsence(message.von)']")).click();
        return this;
    }

    public CloseAbsencePage selectOkonwindow() {
        driver.findElement(By.xpath("//button[@ng-click='ok()']")).click();
        return this;
    }
}
