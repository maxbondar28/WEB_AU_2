package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class DeleteHomeworkPage extends BasePage{
    public DeleteHomeworkPage(WebDriver driver) {
        super(driver);
    }

    public DeleteHomeworkPage deleteHomework(){
        driver.findElement(By.xpath("//button[@ng-click='deleteHomework(row.homework, hw.id)']")).click();
        return this;
    }

    public DeleteHomeworkPage okWindow(){
        driver.findElement(By.xpath("//button[@class='md-primary md-confirm-button md-button md-ink-ripple md-default-theme']")).click();
        return this;
    }

    public  DeleteHomeworkPage okAlert(){
        try {
            driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
        }
        driver.switchTo().defaultContent();

        return this;
    }
}
