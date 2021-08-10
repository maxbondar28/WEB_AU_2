package Test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class CreateAbsence extends TestBase{

    @Test
    public void createAbsence() {
        main
                .gotoSite();

        loginpage
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("Absence");

        createabsencepage
                .createAbsenceButton();

        createemergencymessagepage
                .selectChildEmergency();

        createabsencepage
                .selectStartDate()
                .selectEndDate()
                .selectReason("consultation")
                .writeDetails("Try it")
                .sendAbsence()
                .checkSuccesSend();

    }
}
