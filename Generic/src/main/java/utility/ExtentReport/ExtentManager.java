package utility.ExtentReport;

import com.relevantcodes.extentreports.ExtentReports;
import org.testng.ITestContext;
import org.testng.Reporter;

import java.io.File;

/**
 * Created by abra on 2/9/17.
 */
public class ExtentManager {

    //CREATES COMMON EXTENT

    private static ExtentReports extent;
    private static ITestContext context;





//@Parameters({"Module"})
    public synchronized static ExtentReports getInstance() {
        if (extent == null) {
            File outputDirectory = new File(context.getOutputDirectory());
            File resultDirectory = new File(outputDirectory.getParentFile(), "html");
            extent = new ExtentReports(System.getProperty("user.dir") + "/Extent-Report/Extent Report.html", true);
            Reporter.log("Extent Report directory: " + resultDirectory, true);
            extent.addSystemInfo("Host Name" , "Abrams")
                    .addSystemInfo("Environment", "QA")
                    .addSystemInfo("User Name", "Abrasham Chowdhury");
            extent.loadConfig(new File(System.getProperty("user.dir") + "/report-config.xml"));
        }

        return extent;
    }


    public static void setOutputDirectory(ITestContext context) {
        ExtentManager.context = context;
    }
}
