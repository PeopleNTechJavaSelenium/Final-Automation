package com.extentereports.listener;

import com.relevantcodes.extentreports.LogStatus;
import methods.BaseTest;
import org.testng.Reporter;

/**
 * Created by abra on 2/9/17.
 */
public class TestLogger extends BaseTest {
    public static void log(final String message) {
        Reporter.log(message + "<br>", true);
        ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");  // new
    }
}
