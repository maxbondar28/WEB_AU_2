package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteHomeworkPage extends BasePage{
    public DeleteHomeworkPage(WebDriver driver) {
        super(driver);
    }

    public DeleteHomeworkPage deleteHomework(){
        driver.findElement(By.xpath("//button[@ng-click='deleteHomework(row.homework, hw.id)']")).click();
        return this;
    }
}
