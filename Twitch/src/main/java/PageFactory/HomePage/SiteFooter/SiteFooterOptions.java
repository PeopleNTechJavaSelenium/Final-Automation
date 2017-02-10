package PageFactory.HomePage.SiteFooter;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileNotFoundException;
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

    public void clickJobs() {
        JobsBtn.click();
    }

    public void clickTwitchGlassDoorProfileBtn() {
        TwitchGlassDoorProfileBtn.click();
    }

    public void getOverview() throws FileNotFoundException {
//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        WebElement element = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='EmpBasicInfo'][class='module empBasicInfo']")));

        List<WebElement> list = getListOfWebElementsByCss("div[id='EmpBasicInfo'] div");
        for (WebElement w : list) {
            System.out.println(w.getText());
//            PrintStream out = new PrintStream(new FileOutputStream("/Users/abra/maven-projects/FinalAutomation/Twitch/Reports/Twitch Overview.txt"));
//            System.setOut(out);
        }
    }



    }



