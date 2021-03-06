package Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteRecommendationsPage extends BasePage{
    public DeleteRecommendationsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Delete recommendations")
    public DeleteRecommendationsPage deleteRecommendations(){
        driver.findElement(By.xpath("(//*[text()='Autotest']/../descendant::button)[2]")).click();
        return this;
    }
}
