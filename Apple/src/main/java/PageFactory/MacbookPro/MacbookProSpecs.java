package PageFactory.MacbookPro;

import methods.CommonMethods;
import utility.ExtentReport.TestLogger;

/**
 * Created by abra on 2/3/17.
 */
public class MacbookProSpecs extends CommonMethods {

    public void navigateMacbookProSpecs(){
        driver.navigate().to("http://www.apple.com/macbook-pro/specs/");
        TestLogger.log("Navigated to 'http://www.apple.com/amcbook-pro/specs/");
    }


}
