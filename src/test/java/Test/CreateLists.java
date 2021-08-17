package Test;

import org.junit.jupiter.api.Test;

public class CreateLists extends TestBase{

    @Test
    public void createList(){

     main
             .gotoSite();

        loginpage
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("Lists");

        createlistpage
                .selectClass()
                .newList()
                .selectstudentPerson()
                .writeName()
                .writeDescription()
                .selectDue()
                .makeTable()
                .saveList();

        main    .doPause(2500);
    }
}
