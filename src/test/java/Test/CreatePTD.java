package Test;

import org.junit.jupiter.api.Test;

public class CreatePTD extends TestBase{

    @Test
    public void create_PTD(){
        main
                .gotoSite();

        loginpage
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("Parent-Teacher-Day");

        createptdpage
                .newPTD()
                .selectDate()
                .selectDuration()
                .createPTD();

        main
                .doPause(2500);

        createptdpage
                .publishPTD();

        main.
                doPause(2500);

        createptdpage
                .finishpublishPTD();

        main
                .doPause(2500);
    }
}
