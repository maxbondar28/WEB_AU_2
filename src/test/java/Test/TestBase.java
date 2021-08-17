package Test;

import Page.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

    public class TestBase {

    public WebDriver driver;
    public Main main;
    public LoginPage loginpage;
    public CreateIndividualMessagePage createindividualmessagepage;
    public CreateEmergencyMessagePage createemergencymessagepage;
    public CreateClassMessagePage createclassmessagepage;
    public AnswerMessagePage answermessagepage;
    public AnswerEmergencyMessagePage answeremergencymessagepage;
    public CreateAbsencePage createabsencepage;
    public AnswerAbsencePage answerabsencepage;
    public CloseAbsencePage closeabsencepage;
    public CreateCalendarEventPage createcalendareventpage;
    public CreateHomeworkPage createhomeworkpage;
    public DeleteHomeworkPage deletehomeworkpage;
    public CreateRecommendationsPage createrecommendationspage;
    public DeleteRecommendationsPage deleterecommendationspage;
    public CreateListsPage createlistpage;
    public DeleteListsPage deletelistspage;



    @BeforeEach
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        main = PageFactory.initElements(driver, Main.class);
        loginpage = PageFactory.initElements(driver, LoginPage.class);
        createindividualmessagepage = PageFactory.initElements(driver, CreateIndividualMessagePage.class);
        createemergencymessagepage = PageFactory.initElements(driver, CreateEmergencyMessagePage.class);
        createclassmessagepage = PageFactory.initElements(driver, CreateClassMessagePage.class);
        answermessagepage = PageFactory.initElements(driver, AnswerMessagePage.class);
        answeremergencymessagepage = PageFactory.initElements(driver, AnswerEmergencyMessagePage.class);
        createabsencepage = PageFactory.initElements(driver, CreateAbsencePage.class);
        answerabsencepage = PageFactory.initElements(driver, AnswerAbsencePage.class);
        closeabsencepage = PageFactory.initElements(driver, CloseAbsencePage.class);
        createcalendareventpage = PageFactory.initElements(driver, CreateCalendarEventPage.class);
        createhomeworkpage = PageFactory.initElements(driver, CreateHomeworkPage.class);
        deletehomeworkpage = PageFactory.initElements(driver, DeleteHomeworkPage.class);
        createrecommendationspage = PageFactory.initElements(driver, CreateRecommendationsPage.class);
        deleterecommendationspage = PageFactory.initElements(driver, DeleteRecommendationsPage.class);
        createlistpage = PageFactory.initElements(driver, CreateListsPage.class);
        deletelistspage = PageFactory.initElements(driver, DeleteListsPage.class);

        System.out.println("Before - успешно. Начинаем тестирование...");
        }



    @AfterEach
    public void finish() {
        System.out.println("Тестирование завершено!");
        driver.quit();
    }
}
