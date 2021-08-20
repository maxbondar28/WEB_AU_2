package Test;

import org.testng.annotations.Test;

public class DeleteStudent extends TestBase{


    @Test
    public void delete_student(){

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
                .deleteStudent();

        main
                .doPause(2500);

    }
}
