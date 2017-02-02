package AppleTable;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by abra on 1/31/17.
 */
public class TableData extends CommonAPI {

    @Test
    public void macbookProSpecs(){
        driver.navigate().to("http://www.apple.com/macbook-pro/specs/");
        List<WebElement> list = getListOfWebElementsByCss("#techspecs-row div.nth-child(2)");
        System.out.println(list);
    }
}
