package PageFactory.HomePage.FeaturedGames;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.How.CSS;

/**
 * Created by abra on 1/31/17.
 */
public class Dota2FeaturedGame extends CommonAPI{



    @FindBy(how=CSS, using="a[title='Dota 2'][data-tt_content='featured_games'")
    public WebElement dota2;

    @FindBy(how =CSS, using =".title")
    public WebElement Dota2Title;


    public void clickDota2(){
        dota2.click();
    }







}
