package Test;

import org.junit.jupiter.api.Test;

public class DeleteRecommendations extends TestBase{

    @Test
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
