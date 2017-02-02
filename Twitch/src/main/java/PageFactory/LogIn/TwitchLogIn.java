package PageFactory.LogIn;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.How.CSS;

/**
 * Created by abra on 1/31/17.
 */
public class TwitchLogIn extends CommonAPI {

    @FindBy(how = CSS, using = "#header_login")
    public WebElement LogInBtn;


    public void LogInWindow() {
        LogInBtn.click();
    }

}

