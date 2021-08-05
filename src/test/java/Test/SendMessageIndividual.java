package Test;

import org.junit.Test;

public class SendMessageIndividual extends TestBase{


    @Test
    public void sendMessage(){

    main
            .gotoSite();

    loginpage
            .writeLogin("t.admin3")
            .writePassword("1asdfasdf")
            .pressLogin();

    main
            .selectMenuTab("New message");

    createmessagepage
            .selectIndividualMessageType()
            .selectTypeOfReceiver(1)
            .selectChild()
            .writeSubject("AUT 2")
            .writeMessage("Testing fine!")
            .requestConfirmation()
            .allowFeedback("Freetext")
            .sendMessage()
            .checkSuccesSendMessage();
    }

}
