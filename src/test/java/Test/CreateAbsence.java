package Test;

import org.testng.annotations.Test;

public class CreateAbsence extends TestBase{

    @Test (retryAnalyzer = Retry.class)
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
