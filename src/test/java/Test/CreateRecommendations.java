package Test;

import org.testng.annotations.Test;

public class CreateRecommendations extends TestBase{

    @Test (retryAnalyzer = Retry.class)
    public void createRecommendations(){
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
