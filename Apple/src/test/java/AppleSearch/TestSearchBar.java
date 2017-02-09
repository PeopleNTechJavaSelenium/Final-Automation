package AppleSearch;

import Base.CommonAPI;
import PageFactory.SearchBar.AppleSearchBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ExtentReport.TestLogger;


/**
 * Created by abra on 1/31/17.
 */
public class TestSearchBar extends CommonAPI{


    @Test
    public void searchBarTest() throws Exception{
        AppleSearchBar appleSearchBar = PageFactory.initElements(driver, AppleSearchBar.class);
        appleSearchBar.searchIPhoneInSearchBar();
        captureScreenshot(driver,"iPhone 7 search");
        Assert.assertTrue(appleSearchBar.resultsFound.isDisplayed());
        TestLogger.log("'Results Found' is displayed");
        TestLogger.log("Search Bar functioning properly");
    }

}
