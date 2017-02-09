package MacbookProSpecsTable;

import PageFactory.MacbookPro.MacbookProSpecs;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.ExtentReport.TestLogger;

import java.util.List;

/**
 * Created by abra on 1/31/17.
 */
public class TableData extends MacbookProSpecs {

    @Test
    public void macbookProPriceComparison(){
        navigateMacbookProSpecs();
        //List<WebElement> list = getListOfWebElementsByCss(".techspecs-section.section-price div.nth-child(2)");
        String cellValue1 = getTextByCss(".techspecs-section.section-price div:nth-child(2)");
        System.out.println("2016 13' MacbookPro w/o Touchbar Price : "+cellValue1);
        TestLogger.log("Printed price of 2016 13' MacbookPro w/o Touchbar");
        String cellValue2 = getTextByCss(".techspecs-section.section-price div:nth-child(3)");
        System.out.println("2016 13' MacbookPro w/ Touchbar Price : "+cellValue2);
        TestLogger.log("Printed price of 2016 13' MacbookPro w/ Touchbar");


    }

    @Test
    public void macbookProProcessorComparison(){
        navigateMacbookProSpecs();
        List<WebElement> list = getListOfWebElementsByCss("div[data-analytics-section-engagement='name:thirteen-inch processor'] div");
        for(WebElement we:list){
            System.out.println(we.getText());
            TestLogger.log("Printed Processor Information of MacbookPro w & w/o Touchbar");
        }
    }

}
