package HomePageTest.FeaturedGamesTest;

import Base.CommonAPI;
import PageFactory.HomePage.FeaturedGames.Dota2FeaturedGame;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by abra on 1/31/17.
 */
public class FeaturedGames extends CommonAPI{


    @Test
    public void clickDota2Test() throws Exception {
        Dota2FeaturedGame dota2FeaturedGame = PageFactory.initElements(driver, Dota2FeaturedGame.class);
        dota2FeaturedGame.clickDota2();
        try{
            Assert.assertTrue(dota2FeaturedGame.Dota2Title.isDisplayed());
            System.out.println("Dota 2 is currently in the 'Featured Games' list");
        } catch (Exception e) {
            System.out.println("Dota 2 is currently not in the 'Featured Games' list");
        }
    }

}
