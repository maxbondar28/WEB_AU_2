package Test;

import org.junit.jupiter.api.Test;

public class DeleteHomework extends TestBase {

    @Test
    public void delete_homework(){
        main
                .gotoSite();

        loginpage
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("Homework");

        createhomeworkpage
                .select_class();

        deletehomeworkpage
                .delete_Homework()
                .ok_window();
        main.doPause(2000);
    }
}
