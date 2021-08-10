package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAbsencePage extends BasePage{
    public CreateAbsencePage(WebDriver driver) {
        super(driver);
    }

    public CreateAbsencePage createAbsenceButton(){
        driver.findElement(By.xpath("//button[@ng-click='createAbsence()']")).click();
        return this;
    }

    public CreateAbsencePage selectStartDate(){
        driver.findElement(By.xpath("//input[@name='von']")).click();
        driver.findElement(By.xpath("//a[contains(@class, 'ui-state-active')]")).click();
        return this;
    }

    public CreateAbsencePage selectEndDate(){
        driver.findElement(By.xpath("//input[@name='bis']")).clear();
        driver.findElement(By.xpath("//input[@name='bis']")).sendKeys("28/03/2022");
        driver.findElement(By.xpath("(//label)[5]")).click();
        return this;

    }

    public CreateAbsencePage selectReason(String text){
        driver.findElement(By.xpath("//select[@id='grund']")).click();
        driver.findElement(By.xpath("//option[@value='" + text + "']")).click();
        return this;
    }

    public CreateAbsencePage writeDetails(String text){
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//p")).sendKeys(text);
        driver.switchTo().defaultContent();
        return this;
    }

    public CreateAbsencePage sendAbsence(){
        driver.findElement(By.xpath("//button[@ng-click='submitSickleave()']")).click();
        return this;
    }

    public CreateAbsencePage checkSuccesSend(){
        isElementDisplayed(By.xpath("//*/text()[normalize-space(.)='Absence message successfully sent!']/parent::*"));
        return this;
    }
}
