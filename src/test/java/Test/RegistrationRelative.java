package Test;


import org.testng.annotations.Test;

public class RegistrationRelative extends TestBase{


    @Test (retryAnalyzer = Retry.class)
    public void registrationRelative(){

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

        registrationstudentpage
                .searchFilter("Autotest")
                .registrationRelative()
                .inputRelativeInformationAndPassword();
        main
                .doPause(5000);

        registrationstudentpage
                .checkSuccessRegistration();

    }
}
