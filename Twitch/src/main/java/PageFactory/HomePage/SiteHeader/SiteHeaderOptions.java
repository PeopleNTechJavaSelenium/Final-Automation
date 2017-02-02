package PageFactory.HomePage.SiteHeader;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by abra on 2/1/17.
 */
public class SiteHeaderOptions extends CommonMethods {



    @FindBy(how= How.CSS, using = "#header_browse")
    public WebElement browseBtn;

    @FindBy(how= How.CSS, using = "#header_browse")
    public WebElement tryTwitchPrimeBtn;

    @FindBy(how= How.CSS, using = "#header_login")
    public WebElement logInBtn;

    @FindBy(how= How.CSS, using = "#header_signup")
    public WebElement signUpBtn;

    @FindBy(how= How.CSS, using = "input.class='https://twitch.amazon.com/prime?ref_=sm_w_thp_tn_t_all']")
    public WebElement searchField;


    public void clickBrowseBtn(){
        browseBtn.click();
    }

    public void clickTryTwitchBtn(){
        tryTwitchPrimeBtn.click();
    }

    public void clicLogInBtn(){
        logInBtn.click();
    }

    public void clickSignUpBtn(){
        signUpBtn.click();
    }

    public void clickSearchField(){
        searchField.click();
    }


}
