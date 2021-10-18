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

    @FindBy(css = "div[data-testid='date-dropdowns'] select[data-di-id='di-id-a89569cc-533d8c2c']")
    public WebElement dateInDOB;

    @FindBy(css = "div[data-testid='date-dropdowns'] select[data-di-id='di-id-eaf765f5-ba9dfee6']")
    public WebElement monthInDOB;

    @FindBy(css = "div[data-testid='date-dropdowns'] select[data-di-id='di-id-7e47da21-61281cf1']")
    public WebElement yearINDOB;


    @FindBy(css = "div[class='row question-row-what-is-your-occupat'] input[class='form-control']")
    public WebElement occupation;

    @FindBy(css = "div[class='questionset-input'] select[data-di-id='di-id-737a2a00-c4bbe427']")
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

        waitforelementtoappear(firstName);
        firstName.sendKeys(fname);
    }

    public void enterLastName(String lname) {
        waitforelementtoappear(lastName);
        lastName.sendKeys(lname);
    }

    public void enterOccupation(String Occupation) {
        waitforelementtoappear(occupation);
        occupation.sendKeys(Occupation);
    }

    public void enterPhoneNumber(String phnum) {
        waitforelementtoappear(phoneNumber);
        phoneNumber.sendKeys(phnum);
    }

    public void enterEmail(String emailval) {
        waitforelementtoappear(email);
        email.sendKeys(emailval);
    }

    public void enterTitle(String titleval) {
        waitforelementtoappear(title);
        selectByVisibleText(title, titleval);
    }

    public void enterDOB(String date, String month, String year) {
        waitforelementtoappear(dateInDOB);
        selectByVisibleText(dateInDOB, date);

        waitforelementtoappear(monthInDOB);
        selectByVisibleText(monthInDOB, month);

        waitforelementtoappear(yearINDOB);
        selectByVisibleText(yearINDOB, year);
    }

    public void enterMatrinalStatus(String mrval) {
        waitforelementtoappear(matrial);
        selectByVisibleText(matrial, mrval);
    }

    public void enterAnotherOccupation() {
        waitforelementtoappear(anotherOccupation);
        anotherOccupation.click();
    }

    public void enterAddress(String area, String location) throws InterruptedException {

        waitforelementtoappear(enterAddress);
        enterAddress.sendKeys(area);

        Thread.sleep(2000);

        try {
            allAddress.stream().filter(x -> x.getText().contains(location)).forEach(element -> element.click());
        } catch (StaleElementReferenceException stale) {
            System.out.println("Element is stale. Clicking again");
            allAddress.stream().filter(x -> x.getText().contains(location)).forEach(element -> element.click());
        }
    }

    public void enterOccupationAddressYes() {
        waitforelementtoappear(correspondenceAddressYes);
        correspondenceAddressYes.click();
    }

    public void selectPropertyType(String ans, String arg1) {


        waitforelementtoappear(propetyType);
        selectByVisibleText(propetyType, ans);


        if (ans.equals("House")) {

            waitforelementtoappear(propetyTypeModel);
            selectByVisibleText(propetyTypeModel, arg1);

        } else if (ans.contains("Flat")) {

            waitforelementtoappear(propetyTypeModel);
            selectByVisibleText(propetyTypeModel, arg1);


        } else if (ans.equals("Bungalow")) {

            waitforelementtoappear(propetyTypeModel);
            selectByVisibleText(propetyTypeModel, arg1);

        } else if (ans.equals("Other")) {

            waitforelementtoappear(propetyTypeModel);
            selectByVisibleText(propetyTypeModel, arg1);

        }


    }
}








