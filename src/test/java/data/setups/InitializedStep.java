package data.setups;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.formatter.model.Result;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InitializedStep extends Setup{

    @Before
    public void Initialbrowser() throws MalformedURLException {
        startbrowser();
    }

    @After
    public void SavedScreenshot(Scenario scenario) throws Exception {
        for (int i = 1; i <= 10; i++) {
            if (scenario.getStatus().equals(Result.FAILED)) {
                DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
                Date date = new Date();
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("reports/ErrorScr/scr"+(dateFormat.format(date))+".png"));
                Reporter.addScreenCaptureFromPath("ErrorScr/scr"+(dateFormat.format(date))+".png");
                break;
            }
        }
        driver.close();
        driver.quit();
    }
}
