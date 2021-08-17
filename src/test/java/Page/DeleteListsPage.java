package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteListsPage extends BasePage{
    public DeleteListsPage(WebDriver driver) {
        super(driver);
    }

    public  DeleteListsPage deleteList(){
        driver.findElement(By.xpath("//button[@ng-click='deleteList(row.lists, list.id)']")).click();
        driver.findElement(By.xpath("//button[@class='md-primary md-confirm-button md-button md-ink-ripple md-default-theme']")).click();
        return this;
    }
}
