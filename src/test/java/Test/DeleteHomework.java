package Test;


import org.testng.annotations.Test;

public class DeleteHomework extends TestBase {

    @Test (retryAnalyzer = Retry.class)
    public void deleteHomework(){
        main
                .gotoSite();

        loginpage
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("Homework");

        main.
                doPause(2000);

        createhomeworkpage
                .selectClass();

        deletehomeworkpage
                .deleteHomework()
                .okAlert();

        main
                .doPause(2000);
    }
}
