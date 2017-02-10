package AppleHome;

import PageFactory.HomePage.PageHeader.AppleHomePageHeader;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by abra on 1/31/17.
 */
public class TestAppleHomePage extends CommonMethods {


    public AppleHomePageHeader testButton() throws Exception {
        AppleHomePageHeader appleHomePageHeader = PageFactory.initElements(driver, AppleHomePageHeader.class);
        return PageFactory.initElements(driver, AppleHomePageHeader.class);
    }


    @Test
    public void clickAppleBtn() throws Exception {
        testButton().appleClick();
        captureScreenshot(driver, "HomePage");
        sleepFor(3);
    }


    @Test
    public void clickMacBtn() throws Exception {
        testButton().macClick();
        captureScreenshot(driver, "MacbookPage");
        sleepFor(3);
    }

    @Test
    public void clickiPadBtn() throws Exception {
        testButton().iPadClick();
        captureScreenshot(driver, "iPadPage");
        sleepFor(3);
    }

    @Test
    public void clickiPhoneBtn() throws Exception {
        testButton().iPhoneClick();
        captureScreenshot(driver, "iPhonePage");
        sleepFor(3);
    }

    @Test
    public void clickWatchBtn() throws Exception {
        testButton().watchClick();
        captureScreenshot(driver, "watchPage");
        sleepFor(3);
    }

    @Test
    public void clickTVBtn() throws Exception {
        testButton().tvClick();
        captureScreenshot(driver, "TvPage");
        sleepFor(3);
    }

    @Test
    public void clickMusicBtn() throws Exception {
        testButton().musicClick();
        captureScreenshot(driver, "MusicPage");
        sleepFor(3);
    }

    @Test
    public void clickSupportBtn() throws Exception {
        testButton().supportClick();
        captureScreenshot(driver, "SupportPage");
        sleepFor(3);
    }

    @Test
    public void clickSearchBtn() throws Exception {
        testButton().searchClick();
        captureScreenshot(driver, "SearchPage");
        sleepFor(3);
    }

    @Test
    public void clickBagBtn() throws Exception {
        testButton().bagClick();
        captureScreenshot(driver, "BagPage");
        sleepFor(3);
    }

}

