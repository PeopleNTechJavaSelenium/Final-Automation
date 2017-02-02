package UI.HomePageUI;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by abra on 2/1/17.
 */
public class NavigationUI extends CommonMethods {

    @FindBy(how = How.CSS, using = "#header_browse")
    public WebElement browseBtn;


//    public BrowsePageUI clickBrowserBtn() {
//        browseBtn.click();
//        return new BrowsePageUI();
//    }
}
