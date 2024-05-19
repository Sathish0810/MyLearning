package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInitialization {
    WebDriver driver;
    public WebDriver driverInit(String browser)
    {
        if(browser.trim().equalsIgnoreCase("chrome"))
        {
            System.out.println("Browser Launched successfully"+" "+browser);
            driver = new ChromeDriver();
        }
        else if(browser.trim().equalsIgnoreCase("firefox"))
        {
            System.out.println("Browser Launched successfully"+" "+browser);
            driver = new FirefoxDriver();
        }
        if(browser.trim().equalsIgnoreCase("edge"))
        {
            System.out.println("Browser Launched successfully"+" "+browser);
            driver = new EdgeDriver();
        }
        else {
            System.out.println("Unable to launch the browser"+" "+browser);
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        return driver;
    }
}
