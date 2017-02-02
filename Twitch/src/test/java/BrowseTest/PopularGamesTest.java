package BrowseTest;

import PageFactory.BrowsePage.PopularGames;
import PageFactory.HomePage.SiteHeader.SiteHeaderOptions;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by abra on 2/1/17.
 */
public class PopularGamesTest extends CommonMethods {

        public PopularGames popularGamesTwitch(){
        PopularGames popularGames = PageFactory.initElements(driver, PopularGames.class);
        SiteHeaderOptions siteHeaderOptions = PageFactory.initElements(driver, SiteHeaderOptions.class);
        siteHeaderOptions.clickBrowseBtn();
        return PageFactory.initElements(driver, PopularGames.class);
    }



        @Test
        public void firstPopularGameTest() throws Exception {
        System.out.println("1st Popular Twitch Game");
        System.out.println("<<<<<<<<<<< >>>>>>>>>>>");
        popularGamesTwitch().findFirstPopularGame();
        System.out.println(driver.getTitle() + " : " + driver.getCurrentUrl());

    }

        @Test
        public void secondPopularGameTest() throws InterruptedException {
            System.out.println("2nd Popular Twitch Game");
            System.out.println("<<<<<<<<<<< >>>>>>>>>>>");
            popularGamesTwitch().findSecondPopularGame();
            System.out.println(driver.getTitle() + " : " + driver.getCurrentUrl());
        }


        @Test
        public void thirdPopularGameTest() throws InterruptedException {
        System.out.println("3rd Popular Twitch Game");
        System.out.println("<<<<<<<<<<< >>>>>>>>>>>");
        popularGamesTwitch().findThridPopularGame();
        System.out.println(driver.getTitle()+" : "+driver.getCurrentUrl());
    }
}
