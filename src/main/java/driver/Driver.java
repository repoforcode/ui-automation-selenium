package driver;

import manager.DriverThreads;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    public static WebDriver driver;

    public static void initDriver(){
        if(DriverThreads.getDriver()==null) {
            System.setProperty("webdriver.chrome.driver", "/Users/mymachine/Documents/Workspace/UIAutomation/src/main/resources/chromedriver");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("-- remote_allow_origins=*");

            driver= new ChromeDriver(chromeOptions);
            DriverThreads.setDriver(driver);
            System.out.println("driver instance created" + driver);
            DriverThreads.getDriver().get("https://www.google.co.in");
        }


    }

    public static void tearDown(){
        if(DriverThreads.getDriver()!=null) {
            DriverThreads.getDriver().quit();
            DriverThreads.unload();
        }
    }


}
