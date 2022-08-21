package Pages;

import dev.failsafe.internal.util.Assert;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;
    public static final By emailId = By.id("email");
    public static final By nextButton = By.id("enterimg");
    public Login (WebDriver driver) {
        this.driver = driver;
    }

    public Login logInTo() {
        driver.get("https://demo.automationtesting.in/Index.html");
        driver.findElement(emailId);
        driver.findElement(nextButton);
        return this;
    }

    public Login validatePage() {
        boolean isPageTitleEqualToRegister = driver.getTitle().equals("Register");
        Assert.state(isPageTitleEqualToRegister, "Not as expected");
        return this;
    }
}
