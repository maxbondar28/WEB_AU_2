package Test;

import org.testng.annotations.Test;

public class CreateHomework extends TestBase{

    @Test (retryAnalyzer = Retry.class)
    public void createHomework(){
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
                .writeTextHomework("Testing");

        main
                .doPause(4000);

        createhomeworkpage
                .saveHomework();

        main
                .doPause(2000);
    }
}
