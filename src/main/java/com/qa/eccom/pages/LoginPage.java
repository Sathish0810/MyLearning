package com.qa.eccom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
  private By emailId=By.id("input-email");
  private By password=By.id("input-password");
  private By passwordLink=By.linkText("Forgotten Password");
  private By loginBtn=By.xpath("//input[@type='submit']");

  public LoginPage (WebDriver driver)
  {
      this.driver=driver;
  }
   public String loginPageTitle()
   {
       String Title=driver.getTitle();
       return Title;
   }
    public String loginPageURL()
    {
        String currentPageURL=driver.getCurrentUrl();
        return currentPageURL;
    }
    public boolean isPasswordResetLinkExists()
    {
        boolean flag=driver.findElement(passwordLink).isDisplayed();
        return flag;
    }
    public void loginBtn(String un, String pwd)
    {
        driver.findElement(emailId).sendKeys(un);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginBtn).click();
    }

}
