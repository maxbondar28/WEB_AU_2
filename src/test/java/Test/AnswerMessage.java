package Test;

import org.junit.jupiter.api.Test;

public class AnswerMessage extends TestBase{

    @Test
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
