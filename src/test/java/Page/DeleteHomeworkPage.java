package Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteHomeworkPage extends BasePage{
    public DeleteHomeworkPage(WebDriver driver) {
        super(driver);
    }

    @Step("Delete homework")
    public DeleteHomeworkPage deleteHomework(){
        driver.findElement(By.xpath("//button[@ng-click='deleteHomework(row.homework, hw.id)']")).click();
        return this;
    }
}
