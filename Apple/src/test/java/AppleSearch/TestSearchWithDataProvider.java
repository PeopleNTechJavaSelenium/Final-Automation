package AppleSearch;

import PageFactory.SearchBar.AppleSearchBar;
import methods.BaseTest;
import com.extentereports.listener.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by abra on 1/31/17.
 */
public class TestSearchWithDataProvider extends BaseTest {


    @DataProvider(name = "Products")
    public Object[][] createData(){
        return new Object[][]{
                {"iPhone"} ,
                {"Macbook Pro"} ,
                {"iPad"} ,
        };

    }
    @Test(dataProvider = "Products")
    public void searchUsingDataProvider(String data) throws InterruptedException{
        AppleSearchBar appleSearchBar = PageFactory.initElements(driver, AppleSearchBar.class);
        TestLogger.log("Searching for items");
        appleSearchBar.searchWithEnter(data);
        appleSearchBar.clearSearchInput();
        TestLogger.log("Searched for iPhone, Macbook Pro & iPad");
       TestLogger.log("Search for items finished");
    }

}