package MacbookProSpecsTable;

import PageFactory.MacbookPro.MacbookProSpecs;
import org.testng.annotations.Test;

/**
 * Created by abra on 1/31/17.
 */
public class TableData extends MacbookProSpecs {


    @Test
    public void macbookProPriceComparison(){
        navigateMacbookProSpecs();
        macbookWithTouchBarPrice();
        macbookWithoutTouchBarPrice();
    }


    @Test
    public void macbookProProcessorComparison(){
        navigateMacbookProSpecs();
        macbookProProcessor();
        }
    }
