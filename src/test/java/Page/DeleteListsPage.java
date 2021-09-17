package Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteListsPage extends BasePage{
    public DeleteListsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Delete list")
    public  DeleteListsPage deleteList(){
        driver.findElement(By.xpath("//button[@ng-click='deleteList(row.lists, list.id)']")).click();
        return this;
    }
}
