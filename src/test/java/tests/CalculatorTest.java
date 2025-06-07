package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import pages.CalculatorPage;

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
        CalculatorPage calculatorPage = new CalculatorPage((AndroidDriver) driver);

        calculatorPage.clickTwo();
        calculatorPage.clickAdd();
        calculatorPage.clickThree();
        calculatorPage.clickEqual();

        String result = calculatorPage.getResultText();
        System.out.println("Result is: " + result);
        Assert.assertTrue(result.contains("5"), "Expected result to contain '5'");
    }

    @Test
    public void testSubtraction() {
        CalculatorPage calculatorPage = new CalculatorPage((AndroidDriver) driver);

        calculatorPage.clickThree();
        calculatorPage.clickSubtract();
        calculatorPage.clickTwo();
        calculatorPage.clickEqual();

        String result = calculatorPage.getResultText();
        System.out.println("Result is: " + result);
        Assert.assertTrue(result.contains("1"), "Expected result to contain '1'");
    }

    @Test
    public void testMultiply() {
        CalculatorPage calculatorPage = new CalculatorPage((AndroidDriver) driver);

        calculatorPage.clickNine();
        calculatorPage.clickMultiply();
        calculatorPage.clickEight();
        calculatorPage.clickEqual();

        String result = calculatorPage.getResultText();
        System.out.println("Result is: " + result);
        Assert.assertTrue(result.contains("72"), "Expected result to contain '72'");
    }

    @Test
    public void testDivide() {
        CalculatorPage calculatorPage = new CalculatorPage((AndroidDriver) driver);

        calculatorPage.clickFive();
        calculatorPage.clickFour();
        calculatorPage.clickTwo();
        calculatorPage.clickDivide();
        calculatorPage.clickThree();
        calculatorPage.clickEqual();

        String result = calculatorPage.getResultText();
        System.out.println("Result is: " + result);
        Assert.assertTrue(result.contains("180.6666666667"), "Expected result to contain '180.6666666667'");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
