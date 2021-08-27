package Test;

import org.testng.annotations.Test;

public class DeleteRecommendations extends TestBase{

    @Test (retryAnalyzer = Retry.class)
    public void deleteRecommendations(){
        main
                .gotoSite();

        loginpage
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("Recommendations");

        main
                .doPause(2000);

        deleterecommendationspage
                .deleteRecommendations();

        main
                .okWindow()
                .doPause(2500);
    }
}
