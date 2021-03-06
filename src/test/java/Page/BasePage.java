package Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

//constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

//Wait method
    public void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

//Click method
    public void click (By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

//Is element displayed
    public void isElementDisplayed (By elementBy) {
        waitVisibility(elementBy);
        assert(driver.findElement(elementBy).isDisplayed());
    }


    public void doPause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step("Select tab menu")
    public void selectMenuTab (String nametab){
        driver.findElement(By.xpath("//span[text()='"+ nametab+"']")).click();
    }

}

