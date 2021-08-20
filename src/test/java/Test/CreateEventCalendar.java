package Test;

import org.testng.annotations.Test;

public class CreateEventCalendar extends TestBase{

    @Test
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
                .selectTimeFromEnd()
                .saveEvent();
        main .doPause(2000);
    }
}
