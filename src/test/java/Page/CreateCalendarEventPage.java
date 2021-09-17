package Page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.text.SimpleDateFormat;
import java.util.Date;


public class CreateCalendarEventPage extends BasePage{

    public CreateCalendarEventPage(WebDriver driver) {
        super(driver);
    }

    @Step("Select current day on calendar")
    public CreateCalendarEventPage selectToday(){
        driver.findElement(By.xpath("(//td[contains(@class,'fc-today')])[2]")).click();
        return this;
    }

    @Step("Write event name")
    public CreateCalendarEventPage writeName (String text){
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(text);
        return this;
    }

    @Step("Select all day type event")
    public CreateCalendarEventPage allDay(){
        driver.findElement(By.xpath("//input[@name='allDay']")).click();
        return this;
    }

    @Step("Select time event")
    public CreateCalendarEventPage selectTimeFromEnd(){
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("HH");
        int hours = Integer.parseInt(formatForDateNow.format(dateNow));
        int hours_from = hours + 1;
        int hours_to = hours_from + 1;

        if (hours == 22) {
            hours_from = 21;
            hours_to = 22;
        }

        if (hours == (23)) {
            hours_from = 22;
            hours_to = 23;
        }

        driver.findElement(By.xpath("//date-time-picker[@name = 'from']")).click();
        driver.findElement(By.xpath("//div[@data-hour = "+ hours_from +"]")).click();

        driver.findElement(By.xpath("//date-time-picker[@name = 'to']")).click();
        driver.findElement(By.xpath("(//div[@data-hour = "+ hours_to +"])[2]")).click();
        return this;
    }

    @Step("Save event")
    public CreateCalendarEventPage saveEvent (){
        driver.findElement(By.xpath("//button[@ng-click='ok()']")).click();
        return this;
    }
}
