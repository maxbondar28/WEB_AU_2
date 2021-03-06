package Test;

import org.testng.annotations.Test;

public class SendEmergencyMessage extends TestBase{

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

        createemergencymessagepage
                .selectEmergencyMessageType()
                .selectChildEmergency();

        createindividualmessagepage
                .writeMessage("Testing fine!");

        createemergencymessagepage
                .sendEmergencyMessage()
                .checkSuccessSendMessage();
    }
}
