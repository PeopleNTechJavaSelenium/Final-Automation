package PageFactory.HomePage.PageHeader;

import UI.HomePageUI.*;
import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.ExtentReport.TestLogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abra on 2/1/17.
 */
public class AppleHomePageHeader extends CommonMethods {

    @FindBy(xpath = ".//*[@id='ac-globalnav']/div/ul[2]/li/a")
    List<WebElement> elements = new ArrayList<WebElement>();

    @FindBy(css = ".eyebrow")
    public WebElement titleMacBookPro;


    public Apple appleClick() {
        elements.get(0).click();
        TestLogger.log("Clicked on Apple logo");
        return new Apple();
    }


    public Mac macClick() {
        elements.get(1).click();
        TestLogger.log("Clicked on Mac icon");
        return new Mac();
    }

    public iPad iPadClick() {
        elements.get(2).click();
        TestLogger.log("Clicked on iPad icon");
        return new iPad();
    }

    public iPhone iPhoneClick() {
        elements.get(3).click();
        TestLogger.log("Clicked on iPhone Icon");
        return new iPhone();
    }

    public Watch watchClick() {
        elements.get(4).click();
        TestLogger.log("Clicked on Watch Icon");
        return new Watch();
    }

    public TV tvClick() {
        elements.get(5).click();
        TestLogger.log("Clicked on TV icon");
        return new TV();
    }

    public Music musicClick() {
        elements.get(6).click();
        TestLogger.log("Clicked on Music icon");
        return new Music();
    }

    public Support supportClick() {
        elements.get(7).click();
        TestLogger.log("Clicked on Support icon");
        return new Support();
    }

    public Search searchClick() {
        elements.get(8).click();
        TestLogger.log("Clicked on Search icon");
        return new Search();
    }

    public Bag bagClick() {
        elements.get(9).click();
        TestLogger.log("Clicked on Bag icon");
        return new Bag();
    }
}
