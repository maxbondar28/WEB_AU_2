package Test;

import org.junit.jupiter.api.Test;

public class SendEmergencyMessage extends TestBase{

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

        createemergencymessagepage
                .selectEmergencyMessageType()
                .selectChildEmergency();

        createindividualmessagepage
                .writeMessage("Testing fine!");

        createemergencymessagepage
                .sendEmergencyMessage()
                .checkSuccesSendMessage();
    }
}
