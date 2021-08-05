package Test;

import Page.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

    public class TestBase {

    public WebDriver driver;
    public Main main;
    public LoginPage loginpage;
    public CreateIndividualMessagePage createmessagepage;
    public CreateEmergencyMessagePage createemergencymessagepage;
    public CreateClassMessagePage createclassmessagepage;



    @BeforeEach
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        main = PageFactory.initElements(driver, Main.class);
        loginpage = PageFactory.initElements(driver, LoginPage.class);
        createmessagepage = PageFactory.initElements(driver, CreateIndividualMessagePage.class);
        createemergencymessagepage = PageFactory.initElements(driver, CreateEmergencyMessagePage.class);
        createclassmessagepage = PageFactory.initElements(driver, CreateClassMessagePage.class);

        System.out.println("Before - успешно. Начинаем тестирование...");
    }

    @AfterEach
    public void finish() {
        System.out.println("Тестирование завершено!");
        driver.quit();
    }
}
