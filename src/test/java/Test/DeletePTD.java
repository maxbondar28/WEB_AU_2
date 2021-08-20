package Test;

import org.testng.annotations.Test;

public class DeletePTD extends TestBase{

    @Test
    public void delete_PTD(){
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
                .doPause(3000);
    }
}
