package Test;

import org.testng.annotations.Test;

public class CreateEventCalendar extends TestBase{

    @Test (retryAnalyzer = Retry.class)
    public void createEvent(){

        main
                .gotoSite();

        loginpage
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("Calendar");

        createcalendareventpage
                .selectToday()
                .writeName("AutoTestEvent")
                .allDay()
                .selectTimeFromEnd();

        main
                .doPause(3500);

        createcalendareventpage
                .saveEvent();

        main
                .doPause(2000);
    }
}
