package OneTool.pages;


import lombok.extern.log4j.Log4j;
import net.serenitybdd.core.pages.PageObject;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

@Log4j
public abstract class AbstractPage extends PageObject {


    protected static final Logger logger = LogManager.getLogger(AbstractPage.class);

    private static final int ELEMENT_WAIT_DEFAULT = 30; // seconds

    public void waitForElement(By expression, int seconds) {
        try {
            waitForAjax();
            new WebDriverWait(getDriver(), seconds).until(visibilityOfElementLocated(expression));
        } catch (final TimeoutException e) {
            logger.info("TimeoutException while waiting for element by expression: " + expression);
        }
    }


    private void waitForAjax() {
    }

    public void writeTextToInputField(String inputFieldId, CharSequence keys, boolean exactId, boolean ajaxElement) {
        writeTextToInputField(exactId ? By.id(inputFieldId) : By.xpath("//input[contains(@id, '" + inputFieldId + "')]"), keys, ajaxElement);
    }

    public void writeTextToInputField(By by, CharSequence keys, boolean ajaxElement) {
        waitForElement(by, ELEMENT_WAIT_DEFAULT);
        writeTextToElement(by, ajaxElement, keys);
    }
    public WebElement findElement(By by) throws NoSuchElementException {
        return findElement(by, true);
    }

    public WebElement findElement(By by, boolean throwException) throws NoSuchElementException {
        List<WebElement> webElement = null;
        boolean elementFound = false;
        int retryCount = 0;
        do {
            webElement = getDriver().findElements(by);
            if (webElement.size() > 0) {
                elementFound = true;
            } else {
                logger.warn("Element by " + by + " not found. Retrying...");
                try {
                    Thread.sleep(300);
                } catch (final InterruptedException e1) {
                    logger.error(e1);
                }
            }
        } while (retryCount++ < 3 && webElement.size() == 0);

        if (!elementFound && throwException) {
            throw new NoSuchElementException("Element by " + by + " not found.");
        }
        if (!throwException && !elementFound) {
            return null;
        }
        return webElement.get(0);
    }
    public void writeTextToElement(By by, boolean ajaxElement, CharSequence... keys) {
        WebElement element = findElement(by);

        element.clear();

        // When we have a date input field, there is a javascript code running upon clearing the element. Therefore,
        // after clearing the element we need to wait for ajax before we continue
        if (ajaxElement) {
            waitForAjax();
        }

        int retryCount = 0;
        boolean sendKeysSuccessful;
        do {
            try {
                // If the text could not be cleared for some reason, then select the whole text using CTRL+A and override it
                if (element.getAttribute("value") != null && !element.getAttribute("value").isEmpty()) {
                    element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
                }
                element.sendKeys(keys);
                sendKeysSuccessful = true;
            } catch (final StaleElementReferenceException e) {
                sendKeysSuccessful = false;
                logger.warn("Stale element " + element.toString() + " recognized. Retry to send keys to element...");
                element = findElement(by);
                try {
                    Thread.sleep(300);
                } catch (final InterruptedException e1) {
                    logger.error(e1);
                }
            }
        } while (retryCount++ < 10 && !sendKeysSuccessful);

        if (retryCount > 1) {
            logger.info("We had to retry " + (retryCount - 1) + " times until we could successfully write text to element " + element.toString());
        }

      // Assert.assertTrue("Could not write text " + Arrays.toString(keys) + " to element " + element.toString(), sendKeysSuccessful);

        // When we have a date input field, we need to remove the focus from the element so that any focus listeners can
        // run before we can continue interacting with other elements. Therefore, we are clicking on TAB to remove the focus
        // from the input data field.
        if (ajaxElement) {
            element.sendKeys(Keys.TAB);
        }

    }

   /* public void goToPage(String url) {
        getDriver().get(url);
    }

    */
   /*  abstract protected void goToHomePage();

    */


    /*protected String getOneToolHomePageUrl() {
        return OneToolConfiguration.getProperty("OneTool.url");
    }

     */


}




