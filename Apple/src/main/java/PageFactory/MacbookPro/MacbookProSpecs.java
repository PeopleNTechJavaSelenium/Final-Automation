package PageFactory.MacbookPro;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import utility.ExtentReport.TestLogger;

import java.util.List;

/**
 * Created by abra on 2/3/17.
 */
public class MacbookProSpecs extends CommonMethods {

    public void navigateMacbookProSpecs() {
        driver.navigate().to("http://www.apple.com/macbook-pro/specs/");
        TestLogger.log("Navigated to 'http://www.apple.com/amcbook-pro/specs/");
    }

    public void macbookWithTouchBarPrice() {
        String cellValue1 = getTextByCss(".techspecs-section.section-price div:nth-child(2)");
        System.out.println("2016 13' MacbookPro w/o Touchbar Price : " + cellValue1);
        TestLogger.log("Printed price of 2016 13' MacbookPro w/o Touchbar");
    }


    public void macbookWithoutTouchBarPrice() {
        String cellValue2 = getTextByCss(".techspecs-section.section-price div:nth-child(3)");
        System.out.println("2016 13' MacbookPro w/ Touchbar Price : " + cellValue2);
        TestLogger.log("Printed price of 2016 13' MacbookPro w/ Touchbar");
    }


    public void macbookProProcessor() {
        List<WebElement> list = getListOfWebElementsByCss("div[data-analytics-section-engagement='name:thirteen-inch processor'] div");
        for (WebElement we : list) {
            System.out.println(we.getText());
            TestLogger.log("Printed Processor Information of MacbookPro w & w/o Touchbar");
        }
    }
}
