package Page;

import Test.CreateLists;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateListsPage extends BasePage{
    public CreateListsPage(WebDriver driver) {
        super(driver);
    }

    public CreateListsPage selectClass(){
        driver.findElement(By.xpath("//h2[contains(text(), 'Autotest Class')]")).click();
        return this;
    }


    public CreateListsPage newList(){
        driver.findElement(By.xpath("(//button[@ng-click='newList(row)'])[1]")).click();
        return this;
    }


    public CreateListsPage selectstudentPerson(){
        driver.findElement(By.xpath("//input[@value='student']")).click();
        return this;
    }


    public CreateListsPage writeName(){
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Autotest lists");
        return this;
    }


    public CreateListsPage writeDescription(){
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//p")).sendKeys("Auto test from MB28.");
        driver.switchTo().defaultContent();
        return this;
    }

    public CreateListsPage selectDue(){
        driver.findElement(By.xpath("//input[@name='deadline']")).sendKeys("28/03/2028");
        return this;
    }

    public CreateListsPage makeTable(){
        driver.findElement(By.xpath("//button[@ng-click='newOption(row.form.options)']")).click();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("28");
        driver.findElement(By.xpath("//input[@ng-model='o.name']")).sendKeys("Autotest option tested");
        driver.findElement(By.xpath("//textarea[@ng-model='o.description']")).sendKeys("Description autotest");
        return this;
    }

    public CreateListsPage saveList(){
        driver.findElement(By.xpath("//button[@ng-click='saveNewList(row)']")).click();
        return this;
    }


}
