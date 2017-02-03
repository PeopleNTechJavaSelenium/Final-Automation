package TestSignIn;

import PageFactory.SignIn.AppleSignIn;
import methods.CommonMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by abra on 1/31/17.
 */
public class TestAppleSignIn extends CommonMethods {

    @Test
    public void signInUsingBlankCredentials() throws Exception {
        AppleSignIn appleSignIn = PageFactory.initElements(driver, AppleSignIn.class);
        appleSignIn.appleLogin("", "");
        Assert.assertTrue(appleSignIn.errorMissingAppleID.isDisplayed());
    }



    @Test
    public void signInUsingBlankPassword() throws Exception {
        AppleSignIn appleSignIn = PageFactory.initElements(driver, AppleSignIn.class);
        appleSignIn.appleLogin("ab@gmail.com", "");
        Assert.assertTrue(appleSignIn.errorMissingPassword.isDisplayed());
    }



//    @Test
//    public void signInUsingCorrectEmail() throws Exception {
//        AppleSignIn appleSignIn = PageFactory.initElements(driver, AppleSignIn.class);
//        appleSignIn.appleLogin("abrashamchy@gmail.com", "");//           <----ENTER PASSWORD BEFORE RUNNING
//       appleSignIn.verifySignIn();
//        Assert.assertTrue(appleSignIn.signOutButton.isDisplayed());
//
//    }

//    @Test
//    public void signInUsingScanner() throws Exception{
//        userLogInScanner();
//
//    }

    @Test
    public void singInUsingCorrectCredentialsFromDB() throws InterruptedException{
        userLogInDB();
    }
}

