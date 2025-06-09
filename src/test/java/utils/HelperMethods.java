package utils;

import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HelperMethods {
    private AndroidDriver driver;
    private WebDriverWait wait;
    private static final Logger logger = LogManager.getLogger(HelperMethods.class);

    public HelperMethods(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickElement(WebElement element, String description) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        logger.info("Clicked button " + description);
    }

    public String getText(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        String text = element.getText();
        logger.info("Retrieved result: " + text);
        return text;
    }
}
