package Test;


import org.testng.annotations.Test;

public class Registration extends TestBase{


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
                .assignNewStudent()
                .writeClass()
                .writeFirstnameLastname("firstname", "lastname")
                .selectBirthday()
                .selectGender();
        main
                .doPause(5000);

        registrationstudentpage
                .registerStudent()
                .searchFilter("firstname")
                .registrationRelative()
                .inputRelativeInformationAndPassword();
        main
                .doPause(5000);

        registrationstudentpage
                .checkSuccessRegistration();

    }
}
