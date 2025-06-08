package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculatorPage {

    private static final Logger logger = LogManager.getLogger(CalculatorPage.class);
    private AndroidDriver driver;

    public CalculatorPage(AndroidDriver driver) {
        this.driver = driver;
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
        logger.info("Clicked button 0");
        logger.debug("Result displayed: " + resultField().getText());
        btnZero().click();
    }

    public void clickOne(){
        logger.info("Clicked button 1");
        logger.debug("Result displayed: " + resultField().getText());
        btnOne().click();
    }

    public void clickTwo(){
        logger.info("Clicked button 2");
        logger.debug("Result displayed: " + resultField().getText());
        btnTwo().click();
    }

    public void clickAdd(){
        logger.info("Clicked button (+)");
        logger.debug("Result displayed: " + resultField().getText());
        btnAdd().click();
    }

    public void clickThree(){
        logger.info("Clicked button 3");
        logger.debug("Result displayed: " + resultField().getText());
        btnThree().click();
    }

    public void clickFour(){
        logger.info("Clicked button 4");
        logger.debug("Result displayed: " + resultField().getText());
        btnFour().click();
    }

    public void clickFive(){
        logger.info("Clicked button 5");
        logger.debug("Result displayed: " + resultField().getText());
        btnFive().click();
    }

    public void clickSix(){
        logger.info("Clicked button 6");
        logger.debug("Result displayed: " + resultField().getText());
        btnSix().click();
    }

    public void clickSeven(){
        logger.info("Clicked button 7");
        logger.debug("Result displayed: " + resultField().getText());
        btnSeven().click();
    }

    public void clickEight(){
        logger.info("Clicked button 8");
        logger.debug("Result displayed: " + resultField().getText());
        btnEight().click();
    }

    public void clickNine(){
        logger.info("Clicked button 9");
        logger.debug("Result displayed: " + resultField().getText());
        btnNine().click();
    }

    public void clickEqual(){
        logger.info("Clicked button (=)");
        logger.debug("Result displayed: " + resultField().getText());
        btnEquals().click();
    }

    public String getResultText() {
        String result = resultField().getText();
        logger.info("Retrieved result: " + result);
        return result;
    }


    public void clickSubtract(){
        logger.info("Clicked button (-)");
        logger.debug("Result displayed: " + resultField().getText());
        btnSubtract().click();
    }

    public void clickMultiply(){
        logger.info("Clicked button (X)");
        logger.debug("Result displayed: " + resultField().getText());
        btnMultiply().click();
    }

    public void clickDivide(){
        logger.info("Clicked button (/)");
        logger.debug("Result displayed: " + resultField().getText());
        btnDivide().click();
    }

    public void clearCalculator() {
        logger.info("Clicked button (C)");
        logger.debug("Result displayed: " + resultField().getText());
        btnClear().click();
    }

}
