package data.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import data.pages.GeneralPages;
import data.pages.RegisterPages;

public class GeneralSteps extends GeneralPages{

    @Given("^Open website \"([^\"]*)\"$")
    public void openWebsite(String web) throws Throwable {
        GeneralPages.getweb(web);
    }

    @And("^On Register click Register button$")
    public void onRegisterClickRegisterButton() throws InterruptedException {
        Thread.sleep(2000);
        RegisterPages.clickregister();
    }
}
