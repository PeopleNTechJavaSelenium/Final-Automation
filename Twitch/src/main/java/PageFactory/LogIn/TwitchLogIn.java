package PageFactory.LogIn;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.How.CSS;

/**
 * Created by abra on 1/31/17.
 */
public class TwitchLogIn extends CommonAPI {

    @FindBy(how = CSS, using = "#username")
    public WebElement LogInField;


    public void LogInTwitch() {
        driver.navigate().to("https://www.twitch.tv/login");
        System.out.println("Navigated to Sign In page");
    }

}

