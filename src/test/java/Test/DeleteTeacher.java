package Test;

import org.testng.annotations.Test;

public class DeleteTeacher extends TestBase{

    @Test
    public void deleteTeacher() {

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

        main
                .doPause(3000);

        createteacherpage
                .selectTeacherTab();

        main
                .doPause(5500);

        deleteteacherpage
                .deleteTeacher();

        main
                .doPause(4500);
    }
}
