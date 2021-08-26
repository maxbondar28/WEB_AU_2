package Test;

import org.testng.annotations.Test;

public class SendIndividualMessage extends TestBase{


    @Test (retryAnalyzer = Retry.class)
    public void sendMessage(){

    main
            .gotoSite();

    loginpage
            .writeLogin("t.admin3")
            .writePassword("1asdfasdf")
            .pressLogin();

    main
            .selectMenuTab("New message");

    createindividualmessagepage
            .selectIndividualMessageType()
            .selectTypeOfReceiver(1)
            .selectChild()
            .writeSubject("AUT 2")
            .writeMessage("Testing fine!")
            .requestConfirmation()
            .allowFeedback("Freetext");

    main
            .doPause(3500);

    createindividualmessagepage
            .sendMessage()
            .checkSuccesSendMessage();
    }

}
