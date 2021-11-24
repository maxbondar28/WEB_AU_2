package Test;

import org.testng.annotations.Test;

public class CloseAbsence extends TestBase{

    @Test (retryAnalyzer = Retry.class)
    public void closeAbsence(){

        main
                .gotoSite()
                .checkLogoOnMainPage();

        loginpage
                .checkPageisCorrect()
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("Absence");

        answerabsencepage
                .selectAbsenceMessage();

        closeabsencepage
                .closeAbsencebutton()
                .selectOkonwindow();

        main .doPause(3000);

    }
}
