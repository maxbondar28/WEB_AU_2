package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.text.SimpleDateFormat;
import java.util.Date;


public class CreateCalendarEventPage extends BasePage{

    public CreateCalendarEventPage(WebDriver driver) {
        super(driver);
    }


    public CreateCalendarEventPage selectToday(){
        driver.findElement(By.xpath("(//td[contains(@class,'fc-today')])[2]")).click();
        return this;
    }

    public CreateCalendarEventPage writeName (String text){
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(text);
        return this;
    }

    public CreateCalendarEventPage allDay(){
        driver.findElement(By.xpath("//input[@name='allDay']")).click();
        return this;
    }

    // decide time select problem
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

    public CreateCalendarEventPage saveEvent (){
        driver.findElement(By.xpath("//button[@ng-click='ok()']")).click();
        return this;
    }
}
