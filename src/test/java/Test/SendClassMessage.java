package Test;

import org.junit.jupiter.api.Test;

public class SendClassMessage extends TestBase{

    @Test
    public void sendClassMessage(){
        main
                .gotoSite();

        loginpage
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("New message");

        createclassmessagepage
                .selectClassMessageType()
                .selectClass();

        createmessagepage
                .writeSubject("AUT 2")
                .writeMessage("Testing fine!")
                .requestConfirmation()
                .allowFeedback("Freetext")
                .sendMessage()
                .checkSuccesSendMessage();
    }
}
