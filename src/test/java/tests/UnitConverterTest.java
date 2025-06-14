package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConverterPage;

public class UnitConverterTest extends BaseTest {

    @Test
    public void testSelectTemperature() {
        ConverterPage converterPage = new ConverterPage(driver);
        converterPage.openUnitConverter();
        converterPage.selectTemperatureTab();
        converterPage.openFromUnitDropdown();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFahrenheitToCelsiusConversion() {
        ConverterPage converterPage = new ConverterPage(driver);
        converterPage.openUnitConverter();
        converterPage.selectTemperatureTab();
        converterPage.clickThree();

        String result = converterPage.getResultText();
        Assert.assertTrue(result.contains("−16.1111111111"), "Expected result to contain '−16.1111111111'");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
