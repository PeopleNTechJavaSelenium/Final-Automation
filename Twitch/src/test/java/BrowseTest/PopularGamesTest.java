package BrowseTest;

import Base.CommonAPI;
import PageFactory.BrowsePage.PopularGames;
import PageFactory.HomePage.SiteHeader.SiteHeaderOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by abra on 2/1/17.
 */
public class PopularGamesTest extends CommonAPI {

        public PopularGames popularGamesTwitch(){
        PopularGames popularGames = PageFactory.initElements(driver, PopularGames.class);
        SiteHeaderOptions siteHeaderOptions = PageFactory.initElements(driver, SiteHeaderOptions.class);
        siteHeaderOptions.clickBrowseBtn();
        return PageFactory.initElements(driver, PopularGames.class);
    }


        @Test
        public void firstPopularGameTest() throws Exception {
            popularGamesTwitch().findFirstPopularGame();

    }

        @Test
        public void secondPopularGameTest() throws Exception {
            popularGamesTwitch().findSecondPopularGame();
        }


        @Test
        public void thirdPopularGameTest() throws Exception {
        popularGamesTwitch().findThirdPopularGame();
    }
}
