package Test;


import org.testng.annotations.Test;

public class RegistrationStudent extends TestBase{


    @Test (retryAnalyzer = Retry.class)
    public void registrationStudent(){
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
                .turnStudentTableInfo()
                .searchFilter("Autotest")
                .registrationStudent()
                .inputStudentInformationAndPassword();

        main
                .doPause(5000);

        registrationstudentpage
                .checkSuccessRegistration();

    }
}