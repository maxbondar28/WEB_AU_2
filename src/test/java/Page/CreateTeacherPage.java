package Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateTeacherPage extends BasePage {
    public CreateTeacherPage(WebDriver driver) {
        super(driver);
    }

    @Step("Select teacher tab on settings menu")
    public CreateTeacherPage selectTeacherTab() {
        driver.findElement(By.xpath("//span[contains(text(), 'Teachers')]/parent::button")).click();
        return this;
    }

    @Step("Create new teacher")
    public CreateTeacherPage createNewTeacher() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        return this;
    }

    @Step("Input teacher information")
    public CreateTeacherPage inputTeacherInfo() {

        driver.findElement(By.xpath("//input[@id='teacherFirstName']")).sendKeys("Auto");
        driver.findElement(By.xpath("//input[@id='teacherLastName']")).sendKeys("Teacher");
        driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("1asdfasdf");
        driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("1asdfasdf");

        driver.findElement(By.xpath("//div[@id='teacherSex']")).click();
        driver.findElement(By.xpath("//div[text()='Female']")).click();

        driver.findElement(By.xpath("//input[@placeholder=\"Choose a supported language…\"]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'English')]")).click();
        driver.findElement(By.xpath("//h1")).click();

        driver.findElement(By.xpath("(//input[@placeholder='Start typing for search…'])[2]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Autotest')]")).click();
        driver.findElement(By.xpath("//h1")).click();

        try {
            Thread.sleep(7500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("(//input[@placeholder='Start typing for search…'])[1]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Autotest')]")).click();
        driver.findElement(By.xpath("//h1")).click();

        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("380990597784");

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("teachertest@mail.com");

        return this;
    }

    @Step("Save teacher")
    public CreateTeacherPage submitAddTeacher() {
        driver.findElement(By.xpath("//button[@ng-click='submitNewTeacher()']")).click();
        return this;
    }

}
