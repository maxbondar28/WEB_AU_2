package Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAbsencePage extends BasePage{
    public CreateAbsencePage(WebDriver driver) {
        super(driver);
    }

    @Step("Create absence")
    public CreateAbsencePage createAbsenceButton(){
        driver.findElement(By.xpath("//button[@ng-click='createAbsence()']")).click();
        return this;
    }

    @Step("Select start date")
    public CreateAbsencePage selectStartDate(){
        driver.findElement(By.xpath("//input[@name='von']")).click();
        driver.findElement(By.xpath("//a[contains(@class, 'ui-state-active')]")).click();
        return this;
    }

    @Step("Select end date")
    public CreateAbsencePage selectEndDate(){
        driver.findElement(By.xpath("//input[@name='bis']")).clear();
        driver.findElement(By.xpath("//input[@name='bis']")).sendKeys("28/03/2022");
        driver.findElement(By.xpath("(//label)[5]")).click();
        return this;
    }

    @Step("Select reason of absence")
    public CreateAbsencePage selectReason(String text){
        driver.findElement(By.xpath("//select[@id='grund']")).click();
        driver.findElement(By.xpath("//option[@value='" + text + "']")).click();
        return this;
    }

    @Step("Write details of absence")
    public CreateAbsencePage writeDetails(String text){
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//p")).sendKeys(text);
        driver.switchTo().defaultContent();
        return this;
    }

    @Step("Send absence")
    public CreateAbsencePage sendAbsence(){
        driver.findElement(By.xpath("//button[@ng-click='submitSickleave()']")).click();
        return this;
    }

    @Step("Check success message")
    public CreateAbsencePage checkSuccessSend(){
        isElementDisplayed(By.xpath("//*/text()[normalize-space(.)='Absence message successfully sent!']/parent::*"));
        return this;
    }
}
