package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateHomeworkPage extends BasePage{
    public CreateHomeworkPage(WebDriver driver) {
        super(driver);
    }

    public CreateHomeworkPage select_class(){
        driver.findElement(By.xpath("//h2[contains(text(), 'Autotest Class')]")).click();
        return this;
    }

    public CreateHomeworkPage new_Homework(){
        driver.findElement(By.xpath("(//button[@ng-click='newHomework(row)'])[2]")).click();
        return this;
    }

    public CreateHomeworkPage select_due(){
        driver.findElement(By.xpath("//input[@name='due']")).click();
        driver.findElement(By.xpath("//a[contains(@class,'highlight')]")).click();
        return this;
    }

    public CreateHomeworkPage confirmation_requsted(){
        driver.findElement(By.xpath("//input[@name='responseRequested']")).click();
        return this;
    }

    public CreateHomeworkPage write_text_homework(String text){
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//p")).sendKeys(text);
        driver.switchTo().defaultContent();
        return this;
    }

    public CreateHomeworkPage save_homework(){
        driver.findElement(By.xpath("//button[@ng-click='saveNewHomework(row)']")).click();
        return this;
    }

}
