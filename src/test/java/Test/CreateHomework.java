package Test;

import org.junit.jupiter.api.Test;

public class CreateHomework extends TestBase{

    @Test
    public void create_homework(){
        main
                .gotoSite();

        loginpage
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("Homework");

        createhomeworkpage
                .selectClass()
                .newHomework()
                .selectDue()
                .confirmationRequsted()
                .writeTextHomework("Testing")
                .saveHomework();

        main.doPause(2000);
    }
}
