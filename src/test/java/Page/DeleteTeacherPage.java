package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteTeacherPage extends BasePage {
    public DeleteTeacherPage(WebDriver driver) {
        super(driver);
    }

    public DeleteTeacherPage deleteTeacher(){
        driver.findElement(By.xpath("//div[text()='Auto']")).click();
        driver.findElement(By.xpath("//input[@id='chkActivateDeleteButton']")).click();
        driver.findElement(By.xpath("//button[@ng-click='deleteTeacher()']")).click();
        return this;
    }
}
