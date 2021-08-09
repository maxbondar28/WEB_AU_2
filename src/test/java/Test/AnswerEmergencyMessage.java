package Test;

import org.junit.jupiter.api.Test;

public class AnswerEmergencyMessage extends TestBase{

    @Test
    public void answerEmergencyMessage(){

        main
                .gotoSite()
                .checkLogoOnMainPage();

        loginpage
                .checkPageisCorrect()
                .writeLogin("e.bondarenko")
                .writePassword("1asdfasdf")
                .pressLogin();

        answeremergencymessagepage
                .selectEmergencyMessage();
        answermessagepage
                .writeMessage("Answer emergency")
                .sendAnswer();
    }
}
