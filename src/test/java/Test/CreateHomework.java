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
                .select_class()
                .new_Homework()
                .select_due()
                .confirmation_requsted()
                .write_text_homework("Testing homework")
                .save_homework();

        main.doPause(2000);
    }
}
