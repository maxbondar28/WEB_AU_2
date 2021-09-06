package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }


    public RegistrationPage selectStudentsTab() {
        driver.findElement(By.xpath("//p[text()='Students, teachers and classes administration']")).click();
        return this;
    }

    public RegistrationPage assignNewStudent() {
        driver.findElement(By.xpath("//button[@ui-sref='.newstudent']")).click();
        return this;
    }

    public RegistrationPage writeClass() {
        driver.findElement(By.xpath("//select[@name='class']")).click();
        driver.findElement(By.xpath("//option[@label='Autotest Class']")).click();
        return this;
    }

    public RegistrationPage writeFirstnameLastname(String firstname, String lastname) {
        driver.findElement(By.xpath("//input[@id='studentFirstName']")).sendKeys("" + firstname + "");
        driver.findElement(By.xpath("//input[@id='studentLastName']")).sendKeys("" + lastname + "");
        return this;
    }

    public RegistrationPage selectBirthday() {
        driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
        driver.findElement(By.xpath("//td[contains(@class, 'ui-datepicker-today')]/a")).click();
        return this;
    }

    public RegistrationPage selectGender() {
        driver.findElement(By.xpath("//a[@placeholder='Please make a selection.']")).click();
        driver.findElement(By.xpath("//div[text()='Male']")).click();
        return this;
    }


    public RegistrationPage registerStudent() {
        driver.findElement(By.xpath("//button[@ng-click='submitAddStudent()']")).click();
        return this;
    }

    public RegistrationPage searchFilter(String name) {
        driver.findElement(By.xpath("(//input[@ng-model='colFilter.term'])[1]")).sendKeys("" + name + "");
        return this;
    }

    public RegistrationPage turnStudentTableInfo(){
        driver.findElement(By.xpath("//md-select")).click();
        driver.findElement(By.xpath("//md-option[@id='select_option_2']")).click();
        driver.findElement(By.xpath("//h1")).click();
        return this;
    }

    public RegistrationPage registrationRelative() {
        String regCode = driver.findElement(By.xpath("(//div[@role=\"gridcell\"])[6]//span")).getText();
        driver.findElement(By.xpath("//button[@ng-click='logout()']")).click();
        driver.findElement(By.xpath("(//button[@class='btn btn-small btn-primary btn-block'])[2]")).click();
        driver.findElement(By.xpath("//input")).sendKeys(""+regCode+"");
        driver.findElement(By.xpath("//button[@ng-click='submitRegistrationKey(registrationKey)']")).click();
        driver.findElement(By.xpath("//button[@ng-click='submitActionType()']")).click();
        return this;
    }

    public RegistrationPage registrationStudent() {
        String regCode = driver.findElement(By.xpath("(//div[@role=\"gridcell\"])[6]//span")).getText();
        driver.findElement(By.xpath("//button[@ng-click='logout()']")).click();
        driver.findElement(By.xpath("(//button[@class='btn btn-small btn-primary btn-block'])[2]")).click();
        driver.findElement(By.xpath("//input")).sendKeys("" + regCode + "");
        driver.findElement(By.xpath("//button[@ng-click='submitRegistrationKey(registrationKey)']")).click();
        return this;
    }

    public RegistrationPage inputRelativeInformationAndPassword(){
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Father");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Person");
        driver.findElement(By.xpath("//select")).click();
        driver.findElement(By.xpath("//option[@value='M']")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("auto28@gmail.com");
        driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
        driver.findElement(By.xpath("//button[@ng-click='checkIfRegistrationCodeExist()']")).click();
        driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys("1asdfasdf");
        driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("1asdfasdf");
        driver.findElement(By.xpath("//button[@ng-click='submitRegistrationForm()']")).click();
        return this;
    }

    public RegistrationPage inputStudentInformationAndPassword(){

        long time = System.currentTimeMillis();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("student" + time + "@gmail.com");
        driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
        driver.findElement(By.xpath("//button[@ng-click='checkIfRegistrationCodeExist()']")).click();
        driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys("1asdfasdf");
        driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("1asdfasdf");
        driver.findElement(By.xpath("//button[@ng-click='submitRegistrationForm()']")).click();
        return this;
    }

    public RegistrationPage checkSuccessRegistration(){
        isElementDisplayed(By.xpath("//div[@class='hello-msg']"));
        return this;
    }
}
