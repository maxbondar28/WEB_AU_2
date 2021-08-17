package Test;

import org.junit.jupiter.api.Test;

public class DeleteLists extends TestBase{


    @Test
    public void delete_List(){
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

        deletelistspage
                .deleteList();

        main
                .doPause(2500);
    }
}