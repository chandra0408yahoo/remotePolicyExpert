package StepDefinitions;

import Utilities.util;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import methods.homepagemethods;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class homepagestepdefs extends util {

    //creating object for methods
    public homepagemethods homepage_method;

    //contructor initialising config file and homepage method
    public homepagestepdefs() throws IOException {

        intialise();
        homepage_method = PageFactory.initElements(open_browser(), homepagemethods.class);

    }


    @Before()
    public void firstbefore() {
        System.out.println("BEFORE STEP");

    }

    //quiting browser
    @After()
    public void firstafter() {
        //   quitbrowser();
    }

    //opening browser and navigating to website
    @Given("^Navigate to website$")
    public void navigateToWebsite() {
        gotowebsite();

    }


    @When("^I enter firstname as \"([^\"]*)\" of new customer$")
    public void iEnterFirstnameAsOfNewCustomer(String arg0) {
        homepage_method.enterFnameOfUser(arg0);
    }


    @And("^I enter lastname as \"([^\"]*)\" of new customer$")
    public void iEnterLastnameAsOfNewCustomer(String arg0) {
        homepage_method.enterLastName(arg0);
    }

    @And("^I select title as \"([^\"]*)\"$")
    public void iSelectTitleAs(String arg0) {
        homepage_method.enterTitle(arg0);
    }

    @And("^I select occupation as \"([^\"]*)\"$")
    public void iSelectOccupationAs(String arg0) {
        homepage_method.enterOccupation(arg0);
    }

    @And("^I enter phonenumber \"([^\"]*)\"$")
    public void iEnterPhonenumber(String arg0) {
        homepage_method.enterPhoneNumber(arg0);
    }

    @And("^I enter email as \"([^\"]*)\"$")
    public void iEnterEmailAs(String arg0) {
        homepage_method.enterEmail(arg0);
    }

    @And("^I enter DOB as day \"([^\"]*)\" month \"([^\"]*)\" and year \"([^\"]*)\"$")
    public void iEnterDOBAsDayMonthAndYear(String arg0, String arg1, String arg2) {
        homepage_method.enterDOB(arg0, arg1, arg2);
    }

    @And("^I enter matrinal status \"([^\"]*)\"$")
    public void iEnterMatrinalStatus(String arg0) {
        homepage_method.enterMatrinalStatus(arg0);
    }

    @And("^I enter another occupation as No$")
    public void iEnterAnotherOccupationAsNo() {
        homepage_method.enterAnotherOccupation();
    }

    @And("^I enter address as area \"([^\"]*)\" and location \"([^\"]*)\"$")
    public void iEnterAddressAsAreaAndLocation(String arg0, String arg1) throws InterruptedException {
        homepage_method.enterAddress(arg0, arg1);
    }

    @And("^I enter occupation address yes$")
    public void iEnterOccupationAddressYes() {
        homepage_method.enterOccupationAddressYes();
    }

    @When("^I select property as \"([^\"]*)\" and type in \"([^\"]*)\"$")
    public void iSelectPropertyAsAndTypeIn(String arg0, String arg1) {
        homepage_method.selectPropertyType(arg0, arg1);
    }
}
