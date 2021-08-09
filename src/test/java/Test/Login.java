package Test;

import org.junit.jupiter.api.Test;

public class Login extends TestBase {


    @Test
    public void Login(){

        main
               .gotoSite()
               .checkLogoOnMainPage();

        loginpage.checkPageisCorrect()
                  .writeLogin("t.admin3")
                  .writePassword("1asdfasdf")
                  .pressLogin();
        main .doPause();
        }
    }
