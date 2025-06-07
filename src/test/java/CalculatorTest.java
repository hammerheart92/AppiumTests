import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {

    private AppiumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("No name's A12")
                .setUdid("RF8RC06FW2W")
                .setPlatformName("Android")
                .setPlatformVersion("13")
                .setAppPackage("com.sec.android.app.popupcalculator")
                .setAppActivity("com.sec.android.app.popupcalculator.Calculator");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        System.out.println("Calculator App launched!");
    }

    @Test
    public void testAddition() {
        // Tap 2
        driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02")).click();

        // Tap +
        driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add")).click();

        // Tap 3
        driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03")).click();

        // Tap =
        driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal")).click();

        // Get the result
        String result = driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
        System.out.println("Result is: " + result);  // Expecting: 5

        Assert.assertTrue(result.contains("5"), "Expected result to contain '5'");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
