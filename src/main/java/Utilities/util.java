package Utilities;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class util extends webconnector {

    List<String> completefile;

    // waiting for element to appear
    public WebElement waitforelementtoappear(WebElement element) {

        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        highLightElement(element);
        return wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(element)));


    }

    public void clickUsingJs(WebElement element) {

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);

    }

    public void sendkeysUsingJs(String longstring, WebElement element) {

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].setAttribute('value', '" + longstring + "')", element);

    }

    public void selectByVisibleText(WebElement element, String value) {

        Select objSelect = new Select(element);
        objSelect.selectByVisibleText(value);
    }


    public void highLightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();

        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

            System.out.println(e.getMessage());
        }

        js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

    }


}
