package PageFactory.HomePage.PageHeader;

import UI.HomePageUI.*;
import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abra on 2/1/17.
 */
public class AppleHomePageHeader extends CommonMethods{

    @FindBy(xpath = ".//*[@id='ac-globalnav']/div/ul[2]/li/a")
    List<WebElement> elements = new ArrayList<WebElement>();

    @FindBy(css = ".eyebrow")
    public WebElement titleMacBookPro;



    public Apple appleClick() {
        elements.get(0).click();
        return new Apple();
    }


    public Mac macClick() {
        elements.get(1).click();
        return new Mac();
    }

    public iPad iPadClick() {
        elements.get(2).click();
        return new iPad();
    }

    public iPhone iPhoneClick() {
        elements.get(3).click();
        return new iPhone();
    }

    public Watch watchClick() {
        elements.get(4).click();
        return new Watch();
    }

    public TV tvClick() {
        elements.get(5).click();
        return new TV();
    }

    public Music musicClick() {
        elements.get(6).click();
        return new Music();
    }

    public Support supportClick() {
        elements.get(7).click();
        return new Support();
    }

    public Search searchClick() {
        elements.get(8).click();
        return new Search();
    }

    public Bag bagClick() {
        elements.get(9).click();
        return new Bag();
    }
}
