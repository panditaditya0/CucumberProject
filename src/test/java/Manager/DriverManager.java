package Manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class DriverManager {
    public static  WebDriver driver;
    public static WebDriver getDriver(){
        if(driver == null){
            driver = WebDriverManager.chromedriver().create();
        }
        return driver;
    }
}
