package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import zipkin2.Call;

public class Main extends BasePage {

    String SITE_URL = "https://schoolupdate-bitmedia.test.s.bitmedia.at/schulupdate-efb759645a77b127496a497bdfe88f363d8cd24c/";

    public Main(WebDriver driver) {
        super(driver);
    }

    public Main gotoSite(){
        driver.get(SITE_URL);
        return this;
    }

    public Main checkLogo (){
        waitVisibility(By.xpath("//img"));
        return this;
    }




}