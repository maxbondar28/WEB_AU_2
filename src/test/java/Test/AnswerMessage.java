package Test;

import org.testng.annotations.Test;

public class AnswerMessage extends TestBase{

    @Test (retryAnalyzer = Retry.class)
    public void AnswerMessage(){

        main
                .gotoSite()
                .checkLogoOnMainPage();

        loginpage
                .checkPageisCorrect()
                .writeLogin("e.pavlov")
                .writePassword("1asdfasdf")
                .pressLogin();

        answermessagepage
                .selectNormalMessage()
                .writeMessage("check text")
                .confirmation()
                .sendAnswer();
    }
}
