import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest extends TestBase{


    @Test
    public void Login(){

        main .gotoSite()
             .checkLogo();

        loginPage .checkPageisCorrect()
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();


        }
    }
