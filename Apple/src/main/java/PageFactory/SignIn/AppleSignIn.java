package PageFactory.SignIn;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.ExtentReport.TestLogger;

/**
 * Created by abra on 1/31/17.
 */
public class AppleSignIn extends CommonAPI {
    @FindBy(how = How.XPATH, using=".//*[@id='ac-gn-bag']")
    public WebElement homePageBagButton;

    @FindBy(how = How.XPATH, using=".//*[@id='ac-gn-bagview-content']/nav/ul/li[5]")
    public WebElement homePageSignInButton;

    @FindBy(how = How.XPATH, using=".//*[@id='login-appleId']")
    public WebElement appleIDField;

    @FindBy(how = How.XPATH, using=".//*[@id='login-password']")
    public WebElement passwordField;

    @FindBy(how = How.XPATH, using=".//*[@id='sign-in']")
    public WebElement signInButton;

    @FindBy(how = How.CSS, using="#coherent_id_6")
    public WebElement errorMissingAppleID;

    @FindBy(how = How.CSS, using="#coherent_id_6")
    public WebElement errorMissingPassword;

    @FindBy(how = How.XPATH, using=".//*[@id='ac-gn-bagview-content']/nav/ul/li[5]")
    public WebElement signOutButton;





    public void appleLogin(String userID, String pass){
        homePageBagButton.click();
        TestLogger.log("Clicked on Bag icon");
        homePageSignInButton.click();
        TestLogger.log("Clicked on Sign In button");
        appleIDField.sendKeys(userID);
        TestLogger.log("Clicked on Apple ID Field and entered username");
        passwordField.sendKeys(pass);
        TestLogger.log("Clicked on Password Field and entered password");
        signInButton.click();
        TestLogger.log("Clicked on Sign In Button");
    }



    public void appleLoginPage(){
        homePageBagButton.click();
        TestLogger.log("Clicked on Bag Icon");
        homePageSignInButton.click();
        TestLogger.log("Clicked on Sign In icon");
    }

    public void verifySignIn(){
        homePageBagButton.click();
    }
}
