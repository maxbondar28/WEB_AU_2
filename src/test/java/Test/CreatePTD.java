package Test;


import org.testng.annotations.Test;

public class CreatePTD extends TestBase{

    @Test (retryAnalyzer = Retry.class)
    public void createPTD(){
        main
                .gotoSite();

        loginpage
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("Parent-Teacher-Day");

        createptdpage
                .newPTD()
                .selectDate()
                .selectDuration()
                .createPTD();

        main
                .doPause(2500);

        createptdpage
                .publishPTD();

        main
                .okWindow()
                .doPause(3000);

        createptdpage
                .finishpublishPTD();

        main
                .doPause(4500);
    }
}
