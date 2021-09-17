package Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteStudentPage extends BasePage{
    public DeleteStudentPage(WebDriver driver) {
        super(driver);
    }

    @Step("Delete student")
    public DeleteStudentPage deleteStudent(String text){
        driver.findElement(By.xpath("(//input[@ng-model='colFilter.term'])[1]")).sendKeys(""+ text +"");
        driver.findElement(By.xpath("(//div[@class='ui-grid-cell-contents'])[2]")).click();
        driver.findElement(By.xpath("//input[@ng-model='activateDeleteButton']")).click();
        driver.findElement(By.xpath("//button[@ng-click='deleteStudent()']")).click();
        return this;
    }
}
