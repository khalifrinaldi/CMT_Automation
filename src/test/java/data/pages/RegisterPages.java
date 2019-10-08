package data.pages;

import data.setups.BaseSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPages extends BaseSteps{

    @FindBy (id = "submit-join")
    public static WebElement registerbutton;

    @FindBy (id = "email")
    public static WebElement emailfield;

    @FindBy (id = "password")
    public static WebElement passfield;

    @FindBy (id = "first-name")
    public static WebElement firstnamefield;

    @FindBy (id = "last-name")
    public static WebElement lastnamefield;

    @FindBy (id = "mobile-phone")
    public static WebElement phonefield;

    @FindBy (id = "residence-city")
    public static WebElement cityfield;

    @FindBy (xpath = "//*[@id=\"body\"]/div[2]/div[1]/div[1]/div[1]/h3")
    public static WebElement verifyhome;

    public RegisterPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void fillemail(String mail) {
        new RegisterPages(driver);
        inputText(mail, emailfield, driver);
    }

    public static void fillpass(String pass){
        new RegisterPages(driver);
        inputText(pass, passfield, driver);
    }

    public static void fillfirstname(String first){
        new RegisterPages(driver);
        inputText(first, firstnamefield, driver);
    }

    public static void filllastname(String last){
        new RegisterPages(driver);
        inputText(last, lastnamefield, driver);
    }

    public static void fillphone(String phone){
        new RegisterPages(driver);
        inputText(phone, phonefield, driver);
    }

    public static void fillcity(String city){
        new RegisterPages(driver);
        inputText(city, cityfield, driver);
    }

    public static void clickregister() throws InterruptedException {
        new RegisterPages(driver);
        clickButton(registerbutton, driver);
    }

    public static void verifyregister(){
        new RegisterPages(driver);
        isElementPresent(verifyhome);

    }
}
