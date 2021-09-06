package Test;


import org.testng.annotations.Test;

public class CreateStudent extends TestBase{


    @Test (retryAnalyzer = Retry.class)
    public void createStudent(){

        main
                .gotoSite();

        loginpage
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("Settings");

        registrationstudentpage
                .selectStudentsTab()
                .assignNewStudent()
                .writeClass()
                .writeFirstnameLastname("Autotest", "Person")
                .selectBirthday()
                .selectGender();
        main
                .doPause(5000);

        registrationstudentpage
                .registerStudent();

        main
                .doPause(4500);


    }
}