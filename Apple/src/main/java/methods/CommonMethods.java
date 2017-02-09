package methods;

import Base.CommonAPI;
import PageFactory.SignIn.AppleSignIn;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utility.ExtentReport.TestLogger;
import utility.SQL.ConnectDatabaseSQL;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by abra on 1/31/17.
 */
public class CommonMethods extends CommonAPI {

    public Boolean loggedIn=false;


    public void userLogInDB() throws InterruptedException {
        if(!loggedIn){

            AppleSignIn appleSignIn = PageFactory.initElements(driver, AppleSignIn.class);

            appleSignIn.appleLoginPage();

            ConnectDatabaseSQL connectDatabaseSQL= new ConnectDatabaseSQL();
            TestLogger.log("Connected to mySQL database");
            List<String> list = new ArrayList<String>();
            list=connectDatabaseSQL.retrieveDataFromTable("login_info","apple_login_credentials");
            int i=0;
            typeByCss("#login-appleId",list.get(i));
            TestLogger.log("Entered Apple ID using database");
            typeByCss("#login-password", list.get(i+1));
            TestLogger.log("Entered Password using database");
            clickByCss("#sign-in");
            TestLogger.log("Clicked on Sign In button");
            loggedIn=true;
        }

    }



    public void userLogInScanner() throws InterruptedException{
        AppleSignIn appleSignIn = PageFactory.initElements(driver, AppleSignIn.class);

        appleSignIn.appleLoginPage();

        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter AppleID : ");
        String appleID = stdin.nextLine();
        appleSignIn.appleIDField.sendKeys(appleID);

        System.out.println("Enter Password : ");
        String password = stdin.nextLine();
        appleSignIn.passwordField.sendKeys(password);

        clickByXpath("html/body/div[2]/div[4]/div[1]/div[2]/div/div[1]/div/form/div[2]/button");

    }


    public static void captureScreenshot(WebDriver driver, String screenshotName){

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("../Apple/screenshots/"+screenshotName+".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot "+e.getMessage());;
        }

    }

}
