package Test;

import org.testng.annotations.Test;

public class DeleteLists extends TestBase{


    @Test (retryAnalyzer = Retry.class)
    public void deleteList(){
        main
                .gotoSite();

        loginpage
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("Lists");

        createlistpage
                .selectClass();

        main
                .doPause(2000);

        deletelistspage
                .deleteList();

        main
                .doPause(2500);
    }
}
