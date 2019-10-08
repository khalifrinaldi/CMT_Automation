package data.setups;

import org.openqa.selenium.WebDriver;

public class DriverPool {

    private static WebDriver webInstance;

    public static WebDriver getwebInstance() {
        return webInstance;
    }

    public static void setwebInstance(WebDriver webInstance) {
        DriverPool.webInstance = webInstance;
    }
}
