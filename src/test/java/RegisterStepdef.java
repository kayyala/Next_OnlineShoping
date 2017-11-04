import Utils.AutomationConstants;
import com.Pages.Home_Page;
import com.Pages.RegistrationPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


/**
 * Created by Sudhakar on 05/10/2017.
 */
public class RegisterStepdef {

    Home_Page home_page = new Home_Page();
    RegistrationPage registrationPage = new RegistrationPage();

    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {
        String currentURL = home_page.isInHome_page();
        System.out.println("printing URL" + currentURL);
        Assert.assertEquals(AutomationConstants.URL, currentURL);

        home_page.goMyaccount();

    }

    @When("^I am registering my new AC$")
    public void i_am_registering_my_new_AC() throws Throwable {
    }

    @When("^I enter details$")
    public void i_enter_details() throws Throwable {

    }

    @Then("^my AC create sucessfully$")
    public void my_AC_create_sucessfully() throws Throwable {

    }

}
