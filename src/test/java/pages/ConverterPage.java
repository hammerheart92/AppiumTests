package pages;

import base.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import utils.HelperMethods;

public class ConverterPage extends BaseTest {

    private static final Logger logger = LogManager.getLogger(CalculatorPage.class);
    private AndroidDriver driver;
    private HelperMethods helpers;

    public ConverterPage(AndroidDriver driver) {
        this.driver = driver;
        this.helpers = new HelperMethods(driver);
        logger.info("ConvertorPage initialized");
    }

    private WebElement btnZero() {
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/converter_keypad_btn_00"));
    }

    private WebElement btnOne() {
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/converter_keypad_btn_01"));
    }

    private WebElement btnTwo() {
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/converter_keypad_btn_02"));
    }

    private WebElement btnThree() {
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/converter_keypad_btn_03"));
    }

    private WebElement btnFour() {
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/converter_keypad_btn_04"));
    }

    private WebElement btnFive() {
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/converter_keypad_btn_05"));
    }

    private WebElement btnSix() {
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/converter_keypad_btn_06"));
    }

    private WebElement btnSeven() {
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/converter_keypad_btn_07"));
    }

    private WebElement btnEight() {
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/converter_keypad_btn_08"));
    }

    private WebElement btnNine() {
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/converter_keypad_btn_09"));
    }

    private WebElement btnBackSpace() {
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/converter_keypad_btn_backspace"));
    }

    private WebElement btnClear() {
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/converter_keypad_btn_clear"));
    }

    private WebElement btnPrevious() {
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/converter_keypad_btn_previous"));
    }

    private WebElement btnNext() {
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/converter_keypad_btn_next"));
    }

    private WebElement btnDot() {
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/converter_keypad_btn_dot"));
    }

    private WebElement btnPlusMinus() {
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/converter_keypad_btn_plusminus"));
    }

    private WebElement resultField() {
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/converter_pager_edt_2"));
    }

    public void openUnitConverter() {
        helpers.clickElement(
                driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_handle_btn_converter")),
                "Unit Converter");
    }

    public void selectTemperatureTab() {
        WebElement temperatureTab = driver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@text='Temperature']"
        ));
        helpers.clickElement(temperatureTab, "Temperature Tab");
    }

    public void openFromUnitDropdown() {
        WebElement fromUnitDropdown = driver.findElement(AppiumBy.xpath(
                "//android.widget.LinearLayout[@content-desc='Fahrenheit Unit Dropdown list']/android.widget.ImageView"));
        helpers.clickElement(fromUnitDropdown, "From Unit Dropdown");
    }

    public void clickZero() {
        helpers.clickElement(btnZero(), "0");
    }

    public void clickOne() {
        helpers.clickElement(btnOne(), "1");
    }

    public void clickTwo() {
        helpers.clickElement(btnTwo(), "2");
    }

    public void clickThree() {
        helpers.clickElement(btnThree(), "3");
    }

    public void clickFour() {
        helpers.clickElement(btnFour(), "4");
    }

    public void clickFive() {
        helpers.clickElement(btnFive(), "5");
    }

    public void clickSix() {
        helpers.clickElement(btnSix(), "6");
    }

    public void clickSeven() {
        helpers.clickElement(btnSeven(), "7");
    }

    public void clickEight() {
        helpers.clickElement(btnEight(), "8");
    }

    public void clickNine() {
        helpers.clickElement(btnNine(), "9");
    }

    public void clickBackSpace() {
        helpers.clickElement(btnBackSpace(), "X");
    }

    public void clickClear() {
        helpers.clickElement(btnClear(), "C");
    }

    public void clickPrevious() {
        helpers.clickElement(btnPrevious(), "Previous button");
    }

    public void clickNext() {
        helpers.clickElement(btnNext(), "Next button");
    }

    public void clickDot() {
        helpers.clickElement(btnDot(), ".");
    }

    public void clickPlusMinus() {
        helpers.clickElement(btnPlusMinus(), "+/-");
    }

    public String getResultText() {
        return helpers.getText(resultField());
    }
}
