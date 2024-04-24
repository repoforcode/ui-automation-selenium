package manager;

import org.openqa.selenium.WebDriver;

public class DriverThreads {

    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public static WebDriver getDriver(){
        return driverThreadLocal.get();
    }

    public static void setDriver(WebDriver dr_ref){
        driverThreadLocal.set(dr_ref);
    }

    public static void unload(){
        driverThreadLocal.remove();
    }
}
