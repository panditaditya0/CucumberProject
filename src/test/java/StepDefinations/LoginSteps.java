package StepDefinations;

import Hooks.TestHooks;
import Pages.Login;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    public  static  WebDriver driver = TestHooks.driver;
    @When("I logs in")
    public void i_logs_in() {
        new Login(driver).logInTo();
    }
    @Then("I should be able to in registration page")
    public void i_should_be_able_to_in_registration_page() {
        new Login(driver).logInTo();
    }
}
