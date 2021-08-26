package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class Main extends BasePage {

    String SITE_URL = "https://schoolupdate-bitmedia.test.s.bitmedia.at/schulupdate-efb759645a77b127496a497bdfe88f363d8cd24c/";

    public Main(WebDriver driver) {
        super(driver);
    }

    public Main gotoSite(){
        driver.get(SITE_URL);
        return this;
    }

    public Main checkLogoOnMainPage(){
        waitVisibility(By.xpath("//img"));
        return this;
    }

    public Main logout(){
        driver.findElement(By.xpath("//button[@ng-click='logout()']")).click();
        return this;
    }

    public Main okWindow(){
        driver.findElement(By.xpath("//button[@class='md-primary md-confirm-button md-button md-ink-ripple md-default-theme']")).click();
        return this;
    }

    public Main okAlert(){
        try {
            driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
        }
        driver.switchTo().defaultContent();
        return this;
    }




}