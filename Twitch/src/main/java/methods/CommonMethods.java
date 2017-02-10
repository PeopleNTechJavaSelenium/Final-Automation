package methods;

import Base.CommonAPI;

import java.util.ArrayList;

/**
 * Created by abra on 1/31/17.
 */
public class CommonMethods extends CommonAPI {

    public void switchToChildTab() {
        ArrayList<String> tabs2 = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        }

    public void switchToParentTab(){
        ArrayList<String> tabs2 = new ArrayList(driver.getWindowHandles());
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }
}
