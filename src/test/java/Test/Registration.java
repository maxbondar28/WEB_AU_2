package Test;

import org.junit.jupiter.api.Test;

public class Registration extends TestBase{


    @Test
    public void registration(){

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
                .selectGender()
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
