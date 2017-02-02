package PageFactory.BrowsePage;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by abra on 2/1/17.
 */
public class PopularGames extends CommonMethods{


    @FindBy(how= How.CSS, using = "a[data-tt_content_index='1'][data-tt_content='popular_games']")
    public WebElement firstPopularGame;

    @FindBy(how= How.CSS, using = "a[data-tt_content_index='2'][data-tt_content='popular_games']")
    public WebElement secondPopularGame;

    @FindBy(how= How.CSS, using = "a[data-tt_content_index='3'][data-tt_content='popular_games']")
    public WebElement thirdPopularGame;




    public void findFirstPopularGame() throws InterruptedException {
        firstPopularGame.click();
        sleepFor(2);

    }

    public void findSecondPopularGame() throws InterruptedException {
        secondPopularGame.click();
        sleepFor(2);
    }

    public void findThridPopularGame() throws InterruptedException {
        thirdPopularGame.click();
        sleepFor(2);
    }





//    @FindBy(how = How.XPATH, using = ("HomePageUI[@data-tt_content='popular_games' and @data-tt_content_index='1']"))
//    List<WebElement> elements = new ArrayList<>();
//
//    //HomePageUI[@data-tt_content='popular_games' and @data-tt_content_index='1']
//    //HomePageUI[data-tt_content_index='1'][data-tt_content='popular_games']
//    //HomePageUI[data-tt_content_index='"+number+"'][data-tt_content='popular_games']
//
//    public FirstPopularGame getFirstPopularGame(){
//        elements.get(1).click();
//        driver.getCurrentUrl();
//        return new FirstPopularGame();
//    }
//
//    public FirstPopularGame getsecondPopularGame(){
//        elements.get(2).click();
//        driver.getCurrentUrl();
//        return new FirstPopularGame();
//    }
//
//    public FirstPopularGame getThirdPopularGame(){
//        elements.get(3).click();
//        driver.getCurrentUrl();
//        return new FirstPopularGame();
//    }
}
