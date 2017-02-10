package BrowseTest;

import PageFactory.HomePage.SiteFooter.SiteFooterOptions;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by abra on 2/9/17.
 */
public class JobsTest extends CommonMethods{

    @Test
    public void getTwitchOverview() throws Exception{
        SiteFooterOptions sfo = PageFactory.initElements(driver, SiteFooterOptions.class);
        sfo.clickJobs();
        sfo.clickTwitchGlassDoorProfileBtn();
        switchToChildTab();
        sfo.getOverview();
        switchToParentTab();
        Assert.assertTrue(sfo.TwitchLogo.isDisplayed());
    }
}
