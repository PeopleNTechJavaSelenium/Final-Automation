package utility.ExtentReport;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.Reporter;

/**
 * Created by abra on 2/9/17.
 */
public class TestLogger {

    //CREATES COMMON LOGGER

    public static void log(final String message) {
        Reporter.log(message + "<br>", true);
        utility.ExtentReport.ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");  // new
    }
}
