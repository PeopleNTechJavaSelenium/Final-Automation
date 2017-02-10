package UI.HomePageUI;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by abra on 2/1/17.
 */
public class NavigationUI extends CommonAPI {

    @FindBy(how = How.CSS, using = "#header_browse")
    public WebElement browseBtn;


//    public BrowsePageUI clickBrowserBtn() {
//        browseBtn.click();
//        return new BrowsePageUI();
//    }
}
