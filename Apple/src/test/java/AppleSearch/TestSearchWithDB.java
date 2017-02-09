package AppleSearch;

import Base.CommonAPI;
import PageFactory.SearchBar.AppleSearchBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.ExtentReport.TestLogger;
import utility.SQL.ConnectDatabaseSQL;

import java.util.List;

/**
 * Created by abra on 1/31/17.
 */
public class TestSearchWithDB extends CommonAPI {

    @Test
    public void searchUsingDB()throws Exception, InterruptedException{

        AppleSearchBar appleSearchBar = PageFactory.initElements(driver, AppleSearchBar.class);

        ConnectDatabaseSQL db = new ConnectDatabaseSQL();
        TestLogger.log("Connected to mySQL Database");
        List<String> st = db.retrieveDataFromTable("search_items","products");
        for(String data:st) {
            appleSearchBar.searchWithEnter(data);
            TestLogger.log("Result displayed");
            sleepFor(2);
            TestLogger.log("Finished Searching for Product using mySQL Database");
            navigateBack();
        }
    }
}
