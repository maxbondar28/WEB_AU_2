import Page.LoginPage;
import Page.Main;
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
    public LoginPage loginPage;



    @BeforeEach
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        main = PageFactory.initElements(driver, Main.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        System.out.println("Before - успешно. Начинаем тестирование...");
    }

    @AfterEach
    public void finish() {
        System.out.println("Тестирование завершено!");
        driver.quit();
    }
}
