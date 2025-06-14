package tests;

import base.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalculatorPage;
import pages.ConverterPage;

public class CalculatorTest extends BaseTest {

    @Test(groups = {"smoke"})
    public void testAddition() {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.clickTwo();
        calculatorPage.clickAdd();
        calculatorPage.clickThree();
        calculatorPage.clickEqual();

        String result = calculatorPage.getResultText();
        Assert.assertTrue(result.contains("5"), "Expected result to contain '5'");
    }

    @Test(groups = {"regression"})
    public void testSubtraction() {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.clickThree();
        calculatorPage.clickSubtract();
        calculatorPage.clickTwo();
        calculatorPage.clickEqual();

        String result = calculatorPage.getResultText();
        Assert.assertTrue(result.contains("1"), "Expected result to contain '1'");
    }

    @Test(groups = {"regression"})
    public void testMultiply() {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.clickNine();
        calculatorPage.clickMultiply();
        calculatorPage.clickEight();
        calculatorPage.clickEqual();

        String result = calculatorPage.getResultText();
        Assert.assertTrue(result.contains("72"), "Expected result to contain '72'");
    }

    @Test(groups = {"regression"})
    public void testDivide() {
        CalculatorPage calculatorPage = new CalculatorPage(driver);

        calculatorPage.clickFive();
        calculatorPage.clickFour();
        calculatorPage.clickTwo();
        calculatorPage.clickDivide();
        calculatorPage.clickThree();
        calculatorPage.clickEqual();

        String result = calculatorPage.getResultText();
        Assert.assertTrue(result.contains("180.6666666667"), "Expected result to contain '180.6666666667'");
    }

    @Test(groups = {"regression"})
    public void testMultipleCalculations() {
        CalculatorPage calculatorPage = new CalculatorPage(driver);

        // Step 1: 6 + 7 = 13
        calculatorPage.clickSix();
        calculatorPage.clickAdd();
        calculatorPage.clickSeven();
        calculatorPage.clickEqual();

        // Step 2: - 2 = 11
        calculatorPage.clickSubtract();
        calculatorPage.clickTwo();
        calculatorPage.clickEqual();

        // Step 3: + 160 = 171
        calculatorPage.clickAdd();
        calculatorPage.clickOne();
        calculatorPage.clickSix();
        calculatorPage.clickZero();
        calculatorPage.clickEqual();

        // Step 4: ÷ 8 = 21.375
        calculatorPage.clickDivide();
        calculatorPage.clickEight();
        calculatorPage.clickEqual();

        String result = calculatorPage.getResultText();
        Assert.assertTrue(result.contains("21.375"), "Expected result to contain '21.375'");
    }

    @Test(groups = {"smoke", "regression"})
    public void testCalculationWithClear() {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.clickOne();
        calculatorPage.clickZero();
        calculatorPage.clickZero();
        calculatorPage.clickMultiply();
        calculatorPage.clickTwo();
        calculatorPage.clickEqual();
        calculatorPage.clearCalculator();

        calculatorPage.clickFive();
        calculatorPage.clickZero();
        calculatorPage.clickAdd();
        calculatorPage.clickTwo();
        calculatorPage.clickFive();
        calculatorPage.clickEqual();

        String result = calculatorPage.getResultText();
        Assert.assertTrue(result.contains("75"), "Expected result to contain '75'");
    }

    @Test
    public void openConverterTest() throws InterruptedException {
        ConverterPage converterPage = new ConverterPage(driver);
        converterPage.openUnitConverter();
        // Add a wait or log to pause and observe

        Thread.sleep(3000);
    }
}