package AppleSearch;

import Base.CommonAPI;
import PageFactory.SearchBar.AppleSearchBar;
import utility.ExtentReport.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by abra on 1/31/17.
 */
public class TestSearchWithDataProvider extends CommonAPI {


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
        appleSearchBar.searchWithEnter(data);
        appleSearchBar.clearSearchInput();
        TestLogger.log("Cleared Search Input");
       TestLogger.log("Finished Searching for Product using Data Provider");
    }

}