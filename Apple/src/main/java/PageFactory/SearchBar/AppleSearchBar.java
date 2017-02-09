package PageFactory.SearchBar;

import Base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.ExtentReport.TestLogger;

/**
 * Created by abra on 1/31/17.
 */
public class AppleSearchBar extends CommonAPI {

    @FindBy(how = How.CSS, using=".ac-gn-link.ac-gn-link-search")
    public WebElement homePageSearchIcon;

    @FindBy(how = How.CSS, using="#ac-gn-searchform-input")
    public WebElement homePageSearchField;

    @FindBy(how = How.CSS, using="#ac-gn-searchform-submit")
    public WebElement submitSearchBarIcon;

    @FindBy(how = How.CSS, using=".as-search-results-value")
    public WebElement resultsFound;


    public void searchWithEnter(String product) {
        homePageSearchIcon.click();
        TestLogger.log("Clicked on Search Icon");
        homePageSearchField.sendKeys(product, Keys.ENTER);
        TestLogger.log("Typed Product name in the Search Field and pressed Enter");
    }

    public void clearSearchInput(){
        homePageSearchIcon.click();
        homePageSearchField.clear();
    }

    public void searchIPhoneInSearchBar(){
        homePageSearchIcon.click();
        TestLogger.log("Clicked on Search Icon");
        homePageSearchField.sendKeys("iPhone 7");
        TestLogger.log("Typed 'iPhone7' in the Search Field");
        submitSearchBarIcon.click();
        TestLogger.log("Clicked on Search Icon in Search Bar");
    }

}
