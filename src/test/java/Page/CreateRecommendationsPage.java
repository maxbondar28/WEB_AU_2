package Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateRecommendationsPage extends BasePage{
    public CreateRecommendationsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Create new recommendations")
    public CreateRecommendationsPage newRecommendations(){
        driver.findElement(By.xpath("//button[@ng-click='newLinkList()']")).click();
        return this;
    }

    @Step("Write name of recommendations")
    public CreateRecommendationsPage writeName(){
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Autotest");
        return this;
    }

    @Step("Select class of recommendations")
    public CreateRecommendationsPage selectClass(){
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Autotest");
        driver.findElement(By.xpath("//div[@class='select2-result-label ui-select-choices-row-inner']")).click();
        return this;
    }

    @Step("Save recommendations")
    public CreateRecommendationsPage saveRecommendations(){
        driver.findElement(By.xpath("//button[@ng-click='saveLinkList()']")).click();
        return this;
    }

    @Step("Edit recommendations")
    public CreateRecommendationsPage editRecommendations(){
        driver.findElement(By.xpath("//*[text()='Autotest']/../child::td/button[1]")).click();
        driver.findElement(By.xpath("//input[@ng-model='newLinkFormData.name']")).sendKeys("Checking");
        driver.findElement(By.xpath("//input[@name='url']")).sendKeys("www.instagram.com/bondarenko__28");
        driver.findElement(By.xpath("//textarea")).sendKeys("Autotest by MB28");
        driver.findElement(By.xpath("//select")).click();
        driver.findElement(By.xpath("//option[@value='web']")).click();
        return this;
    }

    @Step("Save recommendations after editing")
    public CreateRecommendationsPage saveAfterEditRecommendations(){
        driver.findElement(By.xpath("(//button[@class='primary-button-management'])[3]")).click();
        return this;
    }

}
