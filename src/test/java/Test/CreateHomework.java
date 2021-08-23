package Test;

import org.testng.annotations.Test;

public class CreateHomework extends TestBase{

    @Test (retryAnalyzer = Retry.class)
    public void create_homework(){
        main
                .gotoSite();

        loginpage
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("Homework");

        createhomeworkpage
                .selectClass()
                .newHomework()
                .selectDue()
                .confirmationRequsted()
                .writeTextHomework("Testing")
                .saveHomework();

        main.doPause(2000);
    }
}
