package Test;


import org.testng.annotations.Test;

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
                .selectClass();

        deletehomeworkpage
                .deleteHomework()
                .okWindow();
        main.doPause(2000);
    }
}
