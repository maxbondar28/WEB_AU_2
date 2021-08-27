package Test;

import org.testng.annotations.Test;

public class DeletePTD extends TestBase{

    @Test (retryAnalyzer = Retry.class)
    public void deletePTD(){
        main
                .gotoSite();

        loginpage
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("Parent-Teacher-Day");

        deleteptdpage
                .deletePtd();

        main
                .okWindow()
                .doPause(3000);
    }
}
