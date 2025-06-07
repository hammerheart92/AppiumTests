package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class CalculatorPage {

    private AndroidDriver driver;

    public CalculatorPage(AndroidDriver driver) {
        this.driver = driver;
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
        btnZero().click();
    }

    public void clickOne(){
        btnOne().click();
    }

    public void clickTwo(){
        btnTwo().click();
    }

    public void clickAdd(){
        btnAdd().click();
    }

    public void clickThree(){
        btnThree().click();
    }

    public void clickFour(){
        btnFour().click();
    }

    public void clickFive(){
        btnFive().click();
    }

    public void clickSix(){
        btnSix().click();
    }

    public void clickSeven(){
        btnSeven().click();
    }

    public void clickEight(){
        btnEight().click();
    }

    public void clickNine(){
        btnNine().click();
    }

    public void clickEqual(){
        btnEquals().click();
    }

    public String getResultText() {
        return resultField().getText();
    }

    public void clickSubtract(){
        btnSubtract().click();
    }

    public void clickMultiply(){
        btnMultiply().click();
    }

    public void clickDivide(){
        btnDivide().click();
    }

    public void clearCalculator() {
        btnClear().click();
    }

}
