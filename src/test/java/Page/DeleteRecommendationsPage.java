package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class DeleteRecommendationsPage extends BasePage{
    public DeleteRecommendationsPage(WebDriver driver) {
        super(driver);
    }

    public DeleteRecommendationsPage deleteRecommendations(){
        driver.findElement(By.xpath("(//*[text()='Autotest']/../descendant::button)[2]")).click();

        try {
            driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
        }
        driver.switchTo().defaultContent();

        //driver.findElement(By.xpath("//button[@class='md-primary md-confirm-button md-button md-ink-ripple md-default-theme']")).click();
        return this;
    }
}
