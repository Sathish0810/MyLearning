package com.qa.eccom.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

    @Test
    public void loginTitleTest()
    {
    String actualTitle=lp.loginPageTitle();
        Assert.assertEquals(driver, "Account Login");
    }

    @Test
    public void loginpageURLTest()
    {
        String actualURL=lp.loginPageURL();
        Assert.assertTrue(actualURL.contains("naveenautomationlabs"));
    }

    @Test
    public void isPasswordResetLinkExistsTest()
    {
        boolean isAvailable=lp.isPasswordResetLinkExists();
        Assert.assertTrue(isAvailable);
    }

    @Test
    public void loginTest()
    {
        lp.loginBtn("neelasathish8@gmail.com", "Clinique$5");
    }

}
