package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.HelperMethods;

public class CalculatorPage {

    private static final Logger logger = LogManager.getLogger(CalculatorPage.class);
    private AndroidDriver driver;
    private HelperMethods helpers;

    public CalculatorPage(AndroidDriver driver) {
        this.driver = driver;
        this.helpers = new HelperMethods(driver, logger);
        logger.info("CalculatorPage initialized");
    }

    private WebElement btnZero(){
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_00"));
    }

    private WebElement btnOne(){
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01"));
    }

    private WebElement btnTwo(){
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02"));
    }

    private WebElement btnAdd(){
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
    }

    private WebElement btnThree(){
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03"));
    }

    private WebElement btnFour(){
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_04"));
    }

    private WebElement btnFive(){
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05"));
    }

    private WebElement btnSix(){
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_06"));
    }

    private WebElement btnSeven(){
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07"));
    }

    private WebElement btnEight(){
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_08"));
    }

    private WebElement btnNine(){
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09"));
    }

    private WebElement btnEquals(){
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
    }

    private WebElement resultField(){
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));
    }

    private WebElement btnSubtract(){
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_sub"));
    }

    private WebElement btnMultiply(){
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul"));
    }

    private WebElement btnDivide(){
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_div"));
    }

    private WebElement btnClear(){
        return driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_clear"));
    }

    public void clickZero(){
        helpers.clickElement(btnZero(),"0");
    }

    public void clickOne(){
        helpers.clickElement(btnOne(),"1");
    }

    public void clickTwo(){
        helpers.clickElement(btnTwo(),"2");
    }

    public void clickThree(){
        helpers.clickElement(btnThree(), "3");
    }

    public void clickFour(){
        helpers.clickElement(btnFour(), "4");
    }

    public void clickFive(){
        helpers.clickElement(btnFive(), "5");
    }

    public void clickSix(){
        helpers.clickElement(btnSix(), "6");
    }

    public void clickSeven(){
        helpers.clickElement(btnSeven(), "7");
    }

    public void clickEight(){
        helpers.clickElement(btnEight(), "8");
    }

    public void clickNine(){
        helpers.clickElement(btnNine(), "9");
    }

    public void clickAdd(){
        helpers.clickElement(btnAdd(), "+");
    }

    public void clickEqual(){
        helpers.clickElement(btnEquals(), "=");
    }

    public void clickSubtract(){
        helpers.clickElement(btnSubtract(), "-");
    }

    public void clickMultiply(){
        helpers.clickElement(btnMultiply(), "x");
    }

    public void clickDivide(){
        helpers.clickElement(btnDivide(), "/");
    }

    public void clearCalculator() {
        helpers.clickElement(btnClear(), "C");
    }

    public String getResultText() {
        return helpers.getText(resultField());
    }

}
