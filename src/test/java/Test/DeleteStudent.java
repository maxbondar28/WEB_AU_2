package Test;

import org.testng.annotations.Test;

public class DeleteStudent extends TestBase{


    @Test (retryAnalyzer = Retry.class)
    public void deleteStudent(){

        main
                .gotoSite();

        loginpage
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("Settings");

        registrationstudentpage
                .selectStudentsTab();

        deletestudentpage
                .deleteStudent("Autotest");

        main
                .doPause(2500);

    }
}
