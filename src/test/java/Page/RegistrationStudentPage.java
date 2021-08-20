package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationStudentPage extends BasePage {
    public RegistrationStudentPage(WebDriver driver) {
        super(driver);
    }


    public RegistrationStudentPage selectStudentsTab() {
        driver.findElement(By.xpath("//p[text()='Students, teachers and classes administration']")).click();
        return this;
    }

    public RegistrationStudentPage assignNewStudent() {
        driver.findElement(By.xpath("//button[@ui-sref='.newstudent']")).click();
        return this;
    }

    public RegistrationStudentPage writeClass() {
        driver.findElement(By.xpath("//select[@name='class']")).click();
        driver.findElement(By.xpath("//option[@label='Autotest Class']")).click();
        return this;
    }

    public RegistrationStudentPage writeFirstnameLastname(String firstname, String lastname) {
        driver.findElement(By.xpath("//input[@id='studentFirstName']")).sendKeys("" + firstname + "");
        driver.findElement(By.xpath("//input[@id='studentLastName']")).sendKeys("" + lastname + "");
        return this;
    }

    public RegistrationStudentPage selectBirthday() {
        driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
        driver.findElement(By.xpath("//td[contains(@class, 'ui-datepicker-today')]/a")).click();
        return this;
    }

    public RegistrationStudentPage selectGender() {
        driver.findElement(By.xpath("//a[@placeholder='Please make a selection.']")).click();
        driver.findElement(By.xpath("//div[text()='Divers']")).click();
        return this;
    }


    public RegistrationStudentPage registerStudent() {
        driver.findElement(By.xpath("//button[@ng-click='submitAddStudent()']")).click();
        return this;
    }

    public RegistrationStudentPage searchFilter(String name) {
        driver.findElement(By.xpath("(//input[@ng-model='colFilter.term'])[1]")).sendKeys("" + name + "");
        return this;
    }

    public RegistrationStudentPage registrationRelative() {
        String regCode = driver.findElement(By.xpath("(//div[@role=\"gridcell\"])[6]//span")).getText();
        driver.findElement(By.xpath("//button[@ng-click='logout()']")).click();
        driver.findElement(By.xpath("(//button[@class='btn btn-small btn-primary btn-block'])[2]")).click();
        driver.findElement(By.xpath("//input")).sendKeys(""+regCode+"");
        driver.findElement(By.xpath("//button[@ng-click='submitRegistrationKey(registrationKey)']")).click();
        driver.findElement(By.xpath("//button[@ng-click='submitActionType()']")).click();
        return this;
    }

    public RegistrationStudentPage inputRelativeInformationAndPassword(){
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Father");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Auto");
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

    public RegistrationStudentPage checkSuccessRegistration(){
        isElementDisplayed(By.xpath("(//span[contains(., 'f.auto')])[1]"));
        return this;
    }
}
