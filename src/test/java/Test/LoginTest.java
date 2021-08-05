package Test;

import org.junit.jupiter.api.Test;

public class LoginTest extends TestBase {


    @Test
    public void Login(){

        main
               .gotoSite()
               .checkLogoOnMainPage();

        loginPage .checkPageisCorrect()
                  .writeLogin("t.admin3")
                  .writePassword("1asdfasdf")
                  .pressLogin();
        main .doPause();
        }
    }
