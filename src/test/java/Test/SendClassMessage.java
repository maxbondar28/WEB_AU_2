package Test;


import org.testng.annotations.Test;

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

        createindividualmessagepage
                .writeSubject("AUT 2")
                .writeMessage("Testing fine!")
                .requestConfirmation()
                .allowFeedback("Freetext")
                .sendMessage()
                .checkSuccesSendMessage();
    }
}
