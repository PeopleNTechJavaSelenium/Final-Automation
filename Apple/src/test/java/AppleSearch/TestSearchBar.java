package AppleSearch;

import Base.CommonAPI;
import PageFactory.SearchBar.AppleSearchBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static methods.CommonMethods.captureScreenshot;

/**
 * Created by abra on 1/31/17.
 */
public class TestSearchBar extends CommonAPI {

    @Test
    public void searchIPhone7() throws Exception{
        AppleSearchBar appleSearchBar = PageFactory.initElements(driver, AppleSearchBar.class);
        appleSearchBar.searchIPhoneInSearchBar();
        sleepFor(2);
        captureScreenshot(driver,"iPhone 7 search");
        Assert.assertTrue(appleSearchBar.resultsFound.isDisplayed());
    }
}
