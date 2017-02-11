package PageFactory.HomePage.SiteFooter;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by abra on 2/9/17.
 */
public class SiteFooterOptions extends CommonAPI {


    @FindBy(css = "a[href='/p/jobs'")
    public WebElement JobsBtn;

    @FindBy(css = "a[href='http://www.glassdoor.com/Overview/Working-at-Twitch-EI_IE639426.11,17.htm'")
    public WebElement TwitchGlassDoorProfileBtn;

    @FindBy(css = ".svg-logo_twitch")
    public WebElement TwitchLogo;

    @FindBy(css = "#ExpandDesc")
    public WebElement GlassdoorTwitchReadMoreBtn;

    @FindBy(css = "#ExpandMission")
    public WebElement GlassdoorMissionReadMoreBtn;



    public void clickJobs() {
        JobsBtn.click();
    }

    public void clickTwitchGlassDoorProfileBtn() {
        TwitchGlassDoorProfileBtn.click();
    }

    public void clickGlassdoorTwitchReadMoreBtn(){
        GlassdoorTwitchReadMoreBtn.click();
    }

    public void clickGlassdoorMissionReadMoreBtn(){
        GlassdoorMissionReadMoreBtn.click();
    }

    public void getOverview() throws FileNotFoundException {
        List<WebElement> list = getListOfWebElementsByCss("div[id='EmpBasicInfo'] div");
        for (WebElement w : list) {
            System.out.println(w.getText());

            DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
            Date date = new Date();
            df.format(date);
            PrintStream out = new PrintStream(new FileOutputStream("../Twitch/Reports/Twitch Overview "+df.format(date)+".txt",true));
            System.setOut(out);
        }
    }
}



