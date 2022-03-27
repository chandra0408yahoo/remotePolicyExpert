package methods;


import Utilities.FirstConfigFile;
import Utilities.util;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class homepagemethods extends util {

    FirstConfigFile FC = new FirstConfigFile();


    @FindBy(css = "div[class='row question-row-title'] select[class='form-control']")
    public WebElement title;

    @FindBy(css = "div[class='row question-row-first-name'] input[class='form-control']")
    public WebElement firstName;

    @FindBy(css = "div[class='row question-row-last-name'] input[class='form-control']")
    public WebElement lastName;

    @FindBy(css = ".question-row-what-is-your-date-of .row > div:nth-of-type(1) > select")
    public WebElement dateInDOB;

    @FindBy(css = ".question-row-what-is-your-date-of .row > div:nth-of-type(2) > select")
    public WebElement monthInDOB;

    @FindBy(css = ".question-row-what-is-your-date-of .row > div:nth-of-type(3) > select")
    public WebElement yearINDOB;


    @FindBy(css = "div[class='row question-row-what-is-your-occupat'] input[class='form-control']")
    public WebElement occupation;

    @FindBy(css = ".question-row-what-is-your-marital .form-control")
    public WebElement matrial;

    @FindBy(css = ".question-row-do-you-have-another .btn-group > button:nth-of-type(2)")
    public WebElement anotherOccupation;


    @FindBy(css = "div[class='row question-row-main-phone-number'] input[class='form-control']")
    public WebElement phoneNumber;

    @FindBy(css = "div[class='row question-row-what-is-your-e-mail'] input[class='form-control']")
    public WebElement email;


    @FindBy(css = ".question-row-you-are-answering-th .btn-group > button:nth-of-type(2)")
    public WebElement aboutYouColumn_No;


    @FindBy(css = ".question-row-address-of-the-prope .form-control")
    public WebElement enterAddress;


    @FindBy(css = "ul[class='list-group'] > li")
    public List<WebElement> allAddress;


    @FindBy(css = ".question-row-is-this-the-same-as .btn-group >  button:nth-of-type(1)")
    public WebElement correspondenceAddressYes;

    @FindBy(css = ".question-row-what-type-of-propert .form-control")
    public WebElement propetyType;

    @FindBy(css = ".question-row-which-of-these-best .form-control")
    public WebElement propetyTypeModel;


    public void enterFnameOfUser(String fname) {

        sendKeysText(firstName, fname);
    }

    public void enterLastName(String lname) {

        sendKeysText(lastName, lname);
    }

    public void enterOccupation(String Occupation) {

        sendKeysText(occupation, Occupation);
    }

    public void enterPhoneNumber(String phnum) {

        sendKeysText(phoneNumber, phnum);
    }

    public void enterEmail(String emailval) {

        sendKeysText(email, emailval);
    }

    public void enterTitle(String titleval) {

        selectByVisibleText(title, titleval);
    }

    public void enterDOB(String date, String month, String year) {

        selectByVisibleText(dateInDOB, date);

        selectByVisibleText(monthInDOB, month);

        selectByVisibleText(yearINDOB, year);
    }

    public void enterMatrinalStatus(String mrval) {
        selectByVisibleText(matrial, mrval);
    }

    public void enterAnotherOccupation() {

        seleniumClick(anotherOccupation);
    }

    public void enterAddress(String area, String location) throws InterruptedException {

        sendKeysText(enterAddress, area);

        Thread.sleep(2000);

        try {
            allAddress.stream().filter(x -> x.getText().contains(location)).forEach(element -> element.click());
        } catch (StaleElementReferenceException stale) {
            allAddress.stream().filter(x -> x.getText().contains(location)).forEach(element -> element.click());
        }
    }

    public void enterOccupationAddressYes() {
        seleniumClick(correspondenceAddressYes);
    }

    public void selectPropertyType(String ans, String arg1) {


        selectByVisibleText(propetyType, ans);


        if (ans.equals("House")) {

            selectByVisibleText(propetyTypeModel, arg1);

        } else if (ans.contains("Flat")) {

            selectByVisibleText(propetyTypeModel, arg1);


        } else if (ans.equals("Bungalow")) {

            selectByVisibleText(propetyTypeModel, arg1);

        } else if (ans.equals("Other")) {

            selectByVisibleText(propetyTypeModel, arg1);

        }


    }
}








