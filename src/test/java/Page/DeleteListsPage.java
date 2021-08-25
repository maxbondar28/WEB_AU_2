package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class DeleteListsPage extends BasePage{
    public DeleteListsPage(WebDriver driver) {
        super(driver);
    }

    public  DeleteListsPage deleteList(){
        driver.findElement(By.xpath("//button[@ng-click='deleteList(row.lists, list.id)']")).click();

        try {
            driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
        }
        driver.switchTo().defaultContent();

        //driver.findElement(By.xpath("//button[@class='md-primary md-confirm-button md-button md-ink-ripple md-default-theme']")).click();
        return this;
    }
}
