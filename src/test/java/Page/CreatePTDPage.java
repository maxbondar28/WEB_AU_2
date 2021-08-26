package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CreatePTDPage extends BasePage{
    public CreatePTDPage(WebDriver driver) {
        super(driver);
    }


    public CreatePTDPage newPTD(){
        driver.findElement(By.xpath("//button[@ng-click='onCreateNewPTD()']")).click();
        return this;
    }

    public CreatePTDPage selectDate(){
        driver.findElement(By.xpath("//input[@name='day']")).sendKeys("28/03/2028");
        driver.findElement(By.xpath("//label[text()='Date:']")).click();
        return this;
    }

    public CreatePTDPage selectDuration(){

            Date dateNow = new Date();
            SimpleDateFormat formatForDateNow = new SimpleDateFormat("HH");
            int hours = Integer.parseInt(formatForDateNow.format(dateNow));
            int hours_from = hours + 1;
            int hours_to = hours_from + 1;

            if (hours == 22) {
                hours_from = 21;
                hours_to = 22;
            }

            if (hours == (23)) {
                hours_from = 22;
                hours_to = 23;
            }

        driver.findElement(By.xpath("//date-time-picker[@name = 'from']")).click();
        driver.findElement(By.xpath("//div[@data-hour = "+ hours_from +"]")).click();

        driver.findElement(By.xpath("//date-time-picker[@name = 'to']")).click();
        driver.findElement(By.xpath("(//div[@data-hour = "+ hours_to +"])[2]")).click();

        return this;
    }


    public CreatePTDPage createPTD(){
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        return this;
    }

    public CreatePTDPage publishPTD(){
        driver.findElement
                (By.xpath("(//h3[contains(text(),'03/28/2028')]/../descendant::button[@ng-disabled=\"changingPublishStatus[ptd.id]\"])[2]")).click();

        driver.findElement(By.xpath("//button[@class='md-primary md-confirm-button md-button md-ink-ripple md-default-theme']")).click();

//        try {
//            driver.switchTo().alert().accept();
//        } catch (NoAlertPresentException e) {
//        }
//        driver.switchTo().defaultContent();

        return this;
    }

    public CreatePTDPage finishpublishPTD(){
        driver.findElement
                (By.xpath("(//h3[contains(text(),'03/28/2028')]/../descendant::button[@type='submit'])[4]")).click();

        driver.findElement(By.xpath("//button[@class='md-primary md-confirm-button md-button md-ink-ripple md-default-theme']")).click();

//        try {
//            driver.switchTo().alert().accept();
//        } catch (NoAlertPresentException e) {
//        }
//        driver.switchTo().defaultContent();

        return this;
    }
}
