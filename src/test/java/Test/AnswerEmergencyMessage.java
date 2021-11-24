package Test;

import org.testng.annotations.Test;

public class AnswerEmergencyMessage extends TestBase{

    @Test (retryAnalyzer = Retry.class)
    public void answerEmergencyMessage(){

        main
                .gotoSite()
                .checkLogoOnMainPage();

        loginpage
                .checkPageisCorrect()
                .writeLogin("e.bondar1")
                .writePassword("1asdfasdf")
                .pressLogin();

        answeremergencymessagepage
                .selectEmergencyMessage();
        answermessagepage
                .writeMessage("Answer emergency")
                .sendAnswer();
    }
}
