package Test;

import org.testng.annotations.Test;

public class CreateTeacher extends TestBase {

    @Test (retryAnalyzer = Retry.class)
    public void createTeacher() {

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
                .doPause(3500);

        createteacherpage
                .createNewTeacher()
                .inputTeacherInfo();

        main
                .doPause(3000);

        createteacherpage
                .submitAddTeacher();

        main
                .doPause(5000);

        main
                .logout();

        main
                .doPause(3500);


        loginpage
                .writeLogin("a.teacher")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .doPause(2500);

        registrationstudentpage
                .checkSuccessRegistration();
    }

}
