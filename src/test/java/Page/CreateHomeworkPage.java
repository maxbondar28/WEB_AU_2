package Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateHomeworkPage extends BasePage{
    public CreateHomeworkPage(WebDriver driver) {
        super(driver);
    }

    @Step("Select class for homework")
    public CreateHomeworkPage selectClass(){
        driver.findElement(By.xpath("//h2[contains(text(), 'Autotest Class')]")).click();
        return this;
    }

    @Step("Create new homework")
    public CreateHomeworkPage newHomework(){
        driver.findElement(By.xpath("(//button[@ng-click='newHomework(row)'])[2]")).click();
        return this;
    }

    @Step("Select due date")
    public CreateHomeworkPage selectDue(){
        driver.findElement(By.xpath("//input[@name='due']")).click();
        driver.findElement(By.xpath("//a[contains(@class,'highlight')]")).click();
        return this;
    }

    @Step("Select confirmation requested")
    public CreateHomeworkPage confirmationRequsted(){
        driver.findElement(By.xpath("//input[@name='responseRequested']")).click();
        return this;
    }

    @Step("Write text information")
    public CreateHomeworkPage writeTextHomework(String text){
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//p")).sendKeys(text);
        driver.switchTo().defaultContent();
        return this;
    }

    @Step("Save homework")
    public CreateHomeworkPage saveHomework(){
        driver.findElement(By.xpath("//button[@ng-click='saveNewHomework(row)']")).click();
        return this;
    }

}
