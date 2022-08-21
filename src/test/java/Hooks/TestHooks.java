package Hooks;

import Manager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class TestHooks {
    public static WebDriver driver;
    @Before
    public  void browserSetup(){
        driver = DriverManager.getDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public  void tearDown(){
        driver.close();
        driver.quit();
    }
}
