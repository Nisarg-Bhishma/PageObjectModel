package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends BasePage{
    public static LoadProperty loadProperty=new LoadProperty();
    public  static String browser=loadProperty.getProperty("browser");

    public  void setUpWebBrowser()
    {
        System.setProperty("webdriver.chrome.driver","src\\test\\java\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println(loadProperty.getProperty("url"));
    }
    public void closeBrowser()
    {
        driver.close();
    }
}