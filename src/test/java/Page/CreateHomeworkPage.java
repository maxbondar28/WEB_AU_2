package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateHomeworkPage extends BasePage{
    public CreateHomeworkPage(WebDriver driver) {
        super(driver);
    }

    public CreateHomeworkPage selectClass(){
        driver.findElement(By.xpath("//h2[contains(text(), 'Autotest Class')]")).click();
        return this;
    }

    public CreateHomeworkPage newHomework(){
        driver.findElement(By.xpath("(//button[@ng-click='newHomework(row)'])[2]")).click();
        return this;
    }

    public CreateHomeworkPage selectDue(){
        driver.findElement(By.xpath("//input[@name='due']")).click();
        driver.findElement(By.xpath("//a[contains(@class,'highlight')]")).click();
        return this;
    }

    public CreateHomeworkPage confirmationRequsted(){
        driver.findElement(By.xpath("//input[@name='responseRequested']")).click();
        return this;
    }

    public CreateHomeworkPage writeTextHomework(String text){
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//p")).sendKeys(text);
        driver.switchTo().defaultContent();
        return this;
    }

    public CreateHomeworkPage saveHomework(){
        driver.findElement(By.xpath("//button[@ng-click='saveNewHomework(row)']")).click();
        return this;
    }

}
