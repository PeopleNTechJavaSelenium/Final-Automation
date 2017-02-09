package TestSignIn;

import methods.CommonMethods;
import org.testng.annotations.Test;
import utility.ExtentReport.TestLogger;

/**
 * Created by abra on 1/31/17.
 */
public class TestAppleSignIn extends CommonMethods {

//    @Test
//    public void signInUsingBlankCredentials() throws Exception {
//        AppleSignIn appleSignIn = PageFactory.initElements(driver, AppleSignIn.class);
//        appleSignIn.appleLogin("", "");
//        TestLogger.log("Entered blank credentials");
//        Assert.assertTrue(appleSignIn.errorMissingAppleID.isDisplayed());
//        TestLogger.log("Missing Apple ID error message is displayed");
//    }
//
//
//    @Test
//    public void signInUsingBlankPassword() throws Exception {
//        AppleSignIn appleSignIn = PageFactory.initElements(driver, AppleSignIn.class);
//        appleSignIn.appleLogin("ab@gmail.com", "");
//        TestLogger.log("Entered blank password");
//        Assert.assertTrue(appleSignIn.errorMissingPassword.isDisplayed());
//        TestLogger.log("Missing Password error message is displayed");
//
//    }


    @Test
    public void singInUsingCorrectCredentialsFromDB() throws InterruptedException{
        userLogInDB();
        TestLogger.log("Logged into Apple account using database");
    }



   // @Test
//    public void signInUsingScanner() throws Exception{
//        userLogInScanner();
//
//    }
}

