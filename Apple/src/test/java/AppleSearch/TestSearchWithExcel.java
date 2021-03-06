package AppleSearch;

import Base.CommonAPI;
import PageFactory.SearchBar.AppleSearchBar;
import dataToSearch.ExcelDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.ExtentReport.TestLogger;

import java.io.IOException;

/**
 * Created by abra on 1/31/17.
 */
public class TestSearchWithExcel extends CommonAPI {

    @Test
    public void searchProductUsingExcelFile() throws IOException, InterruptedException {
        ExcelDataReader excelDataReader = new ExcelDataReader();
        AppleSearchBar appleSearchBar = PageFactory.initElements(driver, AppleSearchBar.class);

        String[] value = excelDataReader.getData();

        for(int i=1; i<value.length;i++){
            appleSearchBar.searchWithEnter(value[i]);
            TestLogger.log("Searched for product using Excel file");
            System.out.println(value[i]);
            navigateBack();
        }
    }
}
