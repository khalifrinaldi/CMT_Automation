package data.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import data.pages.RegisterPages;

public class RegisterSteps {

    @And("^On Register page user fill email \"([^\"]*)\"$")
    public void onRegisterPageUserFillEmail(String mail) throws Throwable {
        RegisterPages.fillemail(mail);
    }

    @Then("^On Register page user fill password \"([^\"]*)\"$")
    public void onRegisterPageUserFillPassword(String pass) throws Throwable {
        RegisterPages.fillpass(pass);
    }

    @And("^On Register page user fill First name \"([^\"]*)\"$")
    public void onRegisterPageUserFillFirstName(String first) throws Throwable {
        RegisterPages.fillfirstname(first);
    }

    @Then("^On Register page user fill Last name \"([^\"]*)\"$")
    public void onRegisterPageUserFillLastName(String last) throws Throwable {
        RegisterPages.filllastname(last);
    }

    @And("^On Register page user fill Phone Number \"([^\"]*)\"$")
    public void onRegisterPageUserFillPhoneNumber(String phone) throws Throwable {
        RegisterPages.fillphone(phone);
    }

    @Then("^On Register page user City \"([^\"]*)\"$")
    public void onRegisterPageUserCity(String city) throws Throwable {
        RegisterPages.fillcity(city);
    }

    @Then("^Verify Register Success$")
    public void verifyRegisterSuccess() {
        RegisterPages.verifyregister();
    }
}
