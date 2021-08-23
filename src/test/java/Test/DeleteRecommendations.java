package Test;

import org.testng.annotations.Test;

public class DeleteRecommendations extends TestBase{

    @Test (retryAnalyzer = Retry.class)
    public void delete_recommendations(){
        main
                .gotoSite();

        loginpage
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("Recommendations");

        deleterecommendationspage
                .deleteRecommendations();

        main.doPause(2500);
    }
}
