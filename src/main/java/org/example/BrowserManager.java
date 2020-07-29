package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util{
    public static LoadProperty loadProperty=new LoadProperty();
    public  static String browser=loadProperty.getProperty("browser");

    public  void setUpWebBrowser(){
        System.out.println(browser);
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
            System.out.println(loadProperty.getProperty("url"));
            driver.get(loadProperty.getProperty("url"));
        }
        else if(browser.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\BrowserDriver\\geckodriver.exe");
            File pathToBinary = new File("src\\test\\resources\\BrowserDriver\\firefox.exe");
            FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);

            //Now you can Initialize marionette driver to launch firefox
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            FirefoxOptions options = new FirefoxOptions();
            capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(ffBinary));
            capabilities.setCapability("marionette", true);

            driver = new FirefoxDriver();
            System.out.println(loadProperty.getProperty("url"));
            driver.get(loadProperty.getProperty("url"));
        }
        else if(browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.IEDriverServer.driver", "src\\test\\resources\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            System.out.println(loadProperty.getProperty("url"));
            driver.get(loadProperty.getProperty("url"));
        }
        else{
            System.out.println("Please choose a valid web-browser");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //driver.get("https://demo.nopcommerce.com/");
        driver.get(loadProperty.getProperty("url"));
    }
    public  void closeBrowser() {//re-usable method to close web-browser
        driver.close();
    }
}