package com.qa.eccom.tests;

import DriverFactory.DriverInitialization;
import com.qa.eccom.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    DriverInitialization  di;
    WebDriver driver;
    protected LoginPage lp;
    @BeforeTest
    public void setup()
    {
        di=new DriverInitialization();
        driver=di.driverInit("chrome");
        lp=new LoginPage(driver);
    }
    public void teatDown()
    {
        driver.quit();
    }
}
