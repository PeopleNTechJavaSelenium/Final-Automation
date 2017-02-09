package AppleSearch;

import PageFactory.SearchBar.AppleSearchBar;
import methods.BaseTest;
import com.extentereports.listener.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by abra on 1/31/17.
 */
public class TestSearchBar extends BaseTest{


    @Test
    public void searchIPhone7() throws Exception{
        AppleSearchBar appleSearchBar = PageFactory.initElements(driver, AppleSearchBar.class);
        appleSearchBar.searchIPhoneInSearchBar();
        TestLogger.log("Searched for iPhone 7");
        captureScreenshot(driver,"iPhone 7 search");
        Assert.assertTrue(appleSearchBar.resultsFound.isDisplayed());
        TestLogger.log("Search Bar works");
    }

}
