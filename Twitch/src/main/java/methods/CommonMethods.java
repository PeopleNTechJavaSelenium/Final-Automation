package methods;

import Base.CommonAPI;
import PageFactory.LogIn.TwitchLogIn;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utility.SQL.ConnectDatabaseSQL;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abra on 1/31/17.
 */
public class CommonMethods extends CommonAPI {

    public Boolean loggedIn = false;


    public void userLogInDB() throws InterruptedException {
        if (!loggedIn) {

            TwitchLogIn twitchLogIn = PageFactory.initElements(driver, TwitchLogIn.class);

            twitchLogIn.LogInWindow();

            ConnectDatabaseSQL connectDatabaseSQL = new ConnectDatabaseSQL();
            List<String> list = new ArrayList<String>();
            list = connectDatabaseSQL.retrieveDataFromTable("login_info", "twitch_login_credentials");
            int i = 0;
            typeByCss("input#username.text", list.get(i));
            typeByCss("#password", list.get(i + 1));
            clickByCss(".primary.button.js-login-button");
            loggedIn = true;
        }
    }


    public static void captureScreenshot(WebDriver driver, String screenshotName){

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("../Twitch/screenshots/"+screenshotName+".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot "+e.getMessage());;
        }

    }
}
