package data.setups;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class BaseSteps extends Setup {

    public static WebDriver driver;
    public static WebDriverWait wait;
    private static boolean initialized = false;
    public static JavascriptExecutor jse = (JavascriptExecutor) driver;

    public BaseSteps() {
        if (!initialized) {
            driver = InitializedStep.getwebInstance();
            wait = new WebDriverWait(this.driver, 30);
        }else {
            try {
                startbrowser();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            initialized = true;
        }
    }

    public static void clickButton(WebElement webElement, WebDriver driver) throws InterruptedException {
        waitForVisibilityOf(webElement,driver);
        webElement.click();
    }

    private static void waitForVisibilityOf(WebElement webElement, WebDriver driver) {
        WebDriverWait webDriverWait = new WebDriverWait(driver,70);
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public String getText(WebElement webElement)
    {
        return webElement.getText();
    }

    public static void inputText(String inputText, WebElement webElement,@SuppressWarnings("rawtypes") WebDriver driver) {
        webElement.clear();
        webElement.sendKeys(inputText);
    }

    public static boolean isElementPresent(WebElement webElement) {
        try {
            if(webElement.isDisplayed())
                return true;
        } catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
        return false;
    }
}
