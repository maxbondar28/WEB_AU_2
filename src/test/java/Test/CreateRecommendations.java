package Test;

import org.junit.jupiter.api.Test;

public class CreateRecommendations extends TestBase{

    @Test
    public void create_recommendations(){
        main
                .gotoSite();

        loginpage
                .writeLogin("t.admin3")
                .writePassword("1asdfasdf")
                .pressLogin();

        main
                .selectMenuTab("Recommendations");

        createrecommendationspage
                .newRecommendations()
                .writeName()
                .selectClass()
                .saveRecommendations()
                .editRecommendations()
                .saveAfterEditRecommendations();

        main.doPause(3500);
    }
}
