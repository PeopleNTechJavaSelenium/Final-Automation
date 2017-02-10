package HomePageTest.TopLiveChannelTest;

import Base.CommonAPI;
import PageFactory.HomePage.TopLiveChannels.FirstTopLiveChannel;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by abra on 1/31/17.
 */
public class FirstTopLiveChannelTest extends CommonAPI {

    @Test
    public void clickFirstTopLiveChannelTest() throws Exception{
        FirstTopLiveChannel firstTopLiveChannel = PageFactory.initElements(driver,FirstTopLiveChannel.class);
        ((JavascriptExecutor)driver).executeScript("scroll(0,2100)");
        sleepFor(3);
        firstTopLiveChannel.clickFirstTopLiveChannel();
        sleepFor(3);
        captureScreenshot(driver, "Top Live Channel");
    }
}
