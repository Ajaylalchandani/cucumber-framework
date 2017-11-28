package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.automationframework.UIUtil;
 

public class TestSteps {

	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() throws Throwable {
	WebDriver driver = UIUtil.createDriver();

	 driver.close();
	    throw new PendingException();

	}

	@When("^User Navigate to LogIn Page$")
	public void User_Navigate_to_LogIn_Page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^User enters UserName and Password$")
	public void User_enters_UserName_and_Password() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^Message displayed Login Successfully$")
	public void Message_displayed_Login_Successfully() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
	
	@When("^User LogOut from the Application$")
	public void User_LogOut_from_the_Application() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void Message_displayed_LogOut_Successfully() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}


}
