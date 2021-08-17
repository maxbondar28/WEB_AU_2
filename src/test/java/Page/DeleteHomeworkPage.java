package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteHomeworkPage extends BasePage{
    public DeleteHomeworkPage(WebDriver driver) {
        super(driver);
    }

    public DeleteHomeworkPage delete_Homework(){
        driver.findElement(By.xpath("//button[@ng-click='deleteHomework(row.homework, hw.id)']")).click();
        return this;
    }

    public DeleteHomeworkPage ok_window(){
        driver.findElement(By.xpath("//button[@class='md-primary md-confirm-button md-button md-ink-ripple md-default-theme']")).click();
        return this;
    }
}
