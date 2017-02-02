package PageFactory.HomePage.TopLiveChannels;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.How.CSS;

/**
 * Created by abra on 1/31/17.
 */
public class FirstTopLiveChannel extends CommonAPI {

    @FindBy(how = CSS, using="a[data-tt_content_index='1'][data-tt_content='top_channels']")                 //html/body/div[5]/div[3]/div[4]/div[4]/div[1]/div[1]/div/div/div[1]/HomePageUI[1]/img
    public WebElement firstTopLiveChannelImg;


    public void clickFirstTopLiveChannel(){
        firstTopLiveChannelImg.click();
    }
}
