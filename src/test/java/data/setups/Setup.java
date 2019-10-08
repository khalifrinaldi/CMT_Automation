package data.setups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;

public class Setup extends DriverPool{

    WebDriver driver;

    public void startbrowser() throws MalformedURLException {
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
//        chromeOptions.addArguments("--disable-notifications");
//        chromeOptions.addArguments("--window-size=1920,1080");
//        driver = new ChromeDriver(chromeOptions);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        setwebInstance(driver);
    }

    public void startbrowserFF() throws MalformedURLException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        setwebInstance(driver);
    }
}
