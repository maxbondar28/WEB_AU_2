package Test;

import org.testng.annotations.Test;

public class CreateLists extends TestBase{

    @Test (retryAnalyzer = Retry.class)
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
                .makeTable();

        main
                .doPause(2000);

        createlistpage
                .saveList();

        main
                .doPause(2500);
    }
}
