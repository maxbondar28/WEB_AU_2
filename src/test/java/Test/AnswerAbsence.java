package Test;


import org.testng.annotations.Test;

public class AnswerAbsence extends TestBase{


    @Test (retryAnalyzer = Retry.class)
    public void answerAbsence(){
        main
                .gotoSite()
                .checkLogoOnMainPage();

        loginpage
                .checkPageisCorrect()
                .writeLogin("e.bondarenko")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("Absence");

        answerabsencepage
                .selectAbsenceMessage();

        answermessagepage
                .writeMessage("Answer absence")
                .sendAnswer();
    }
}
