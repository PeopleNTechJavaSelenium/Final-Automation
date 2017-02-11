package PageFactory.BrowsePage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by abra on 2/1/17.
 */
public class PopularGames extends CommonAPI{


    @FindBy(how= How.CSS, using = "a[data-tt_content_index='1'][data-tt_content='popular_games']")
    public WebElement firstPopularGame;

    @FindBy(how= How.CSS, using = "a[data-tt_content_index='2'][data-tt_content='popular_games']")
    public WebElement secondPopularGame;

    @FindBy(how= How.CSS, using = "a[data-tt_content_index='3'][data-tt_content='popular_games']")
    public WebElement thirdPopularGame;




    public void findFirstPopularGame() throws Exception {
        System.out.println("1st Popular Twitch Game");
        System.out.println("<<<<<<<<<<< >>>>>>>>>>>");
        firstPopularGame.click();
        sleepFor(2);
        System.out.println(driver.getTitle() + " : " + driver.getCurrentUrl());

//        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
//        Date date = new Date();
//        df.format(date);
//        PrintStream out = new PrintStream(new FileOutputStream("../Twitch/Reports/First Popular Game Link "+df.format(date)+".txt"));
//        System.setOut(out);
    }

    public void findSecondPopularGame() throws Exception {
        System.out.println("2nd Popular Twitch Game");
        System.out.println("<<<<<<<<<<< >>>>>>>>>>>");
        secondPopularGame.click();
        sleepFor(2);
        System.out.println(driver.getTitle() + " : " + driver.getCurrentUrl());

//        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
//        Date date = new Date();
//        df.format(date);
//        PrintStream out = new PrintStream(new FileOutputStream("../Twitch/Reports/Second Popular Game "+df.format(date)+".txt"));
//        System.setOut(out);
    }

    public void findThirdPopularGame() throws Exception {
        System.out.println("3rd Popular Twitch Game");
        System.out.println("<<<<<<<<<<< >>>>>>>>>>>");
        thirdPopularGame.click();
        sleepFor(2);
        System.out.println(driver.getTitle()+" : "+driver.getCurrentUrl());

//        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
//        Date date = new Date();
//        df.format(date);
//        PrintStream out = new PrintStream(new FileOutputStream("../Twitch/Reports/Third Popular Game "+df.format(date)+".txt"));
//        System.setOut(out);
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
