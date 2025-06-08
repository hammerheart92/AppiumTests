package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected AndroidDriver driver;

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

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

