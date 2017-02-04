package AppleSearch;

import Base.CommonAPI;
import PageFactory.SearchBar.AppleSearchBar;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by abra on 1/31/17.
 */
public class TestSearchBar extends CommonAPI {


    @Test
    public void searchIPhone7() throws Exception{
        AppleSearchBar appleSearchBar = PageFactory.initElements(driver, AppleSearchBar.class);
        report=new ExtentReports("/Users/abra/maven-projects/FinalAutomation/Apple/extentReport/ExtentReport.html");
        logger = report.startTest("TestSearchBar");
        logger.log(LogStatus.INFO, "Browser Started");
        appleSearchBar.searchIPhoneInSearchBar();
        logger.log(LogStatus.INFO, "Searched for iPhone 7");
        sleepFor(2);
        captureScreenshot(driver,"iPhone 7 search");
        Assert.assertTrue(appleSearchBar.resultsFound.isDisplayed());
        logger.log(LogStatus.PASS, "Search Bar works");
    }
}
