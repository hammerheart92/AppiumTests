package utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class HelperMethods {
    private AppiumDriver driver;
    private WebDriverWait wait;
    private Logger logger;

    public HelperMethods(AppiumDriver driver, Logger logger) {
        this.driver = driver;
        this.logger = logger;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickElement(WebElement element, String label) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        logger.info("Clicked button " + label);
        try {
            WebElement resultField = driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));
            logger.debug("Result displayed: " + resultField.getText());
        } catch (Exception e) {
            logger.debug("Could not retrieve result field text after clicking " + label);
        }
    }

    public String getText(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        String text = element.getText();
        logger.info("Retrieved result: " + text);
        return text;
    }
}
