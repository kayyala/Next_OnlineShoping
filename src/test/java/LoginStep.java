import Utils.AutomationConstants;
import com.Pages.Home_Page;
import com.Pages.Login_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Sudhakar on 06/10/2017.
 */
public class LoginStep {

    Home_Page home_page = new Home_Page();

    Login_Page login_page = new Login_Page();

    @Given("^Iam on home page$")
    public void iam_on_home_page() throws Throwable {
        String currentURL = home_page.isInHome_page();
        System.out.println("Before Login Ac printing URL++++++" + currentURL);
        Assert.assertEquals(AutomationConstants.URL, currentURL);
        home_page.goMyaccount();
    }
    @When("^I provides  Username \"(.*?)\"$")
    public void i_provides_Username(String UserNamess) throws Throwable {
        login_page.Validuser(UserNamess);
    }
    @When("^I provides  Password \"(.*?)\"$")
    public void i_provides_Password(String Password) throws Throwable {
        login_page.Validpassword(Password);
    }
    @When("^Logs in$")
    public void logs_in() throws Throwable {
        login_page.Login();
        String currentURL = home_page.isInHome_page();
        System.out.println("After Login Ac printing URL++++++" + currentURL);
    }
    @Then("^User should see the  message\"(.*?)\"$")
    public void user_should_see_the_message(String Message) throws Throwable {
        String welcomeMessageTxt = home_page.isInMyAc_Page();
        Assert.assertEquals(Message, welcomeMessageTxt);

        home_page.LogoutAc();
        String currentURL = home_page.isInHome_page();
        System.out.println(" After Logout Ac printing URL====" + currentURL);
    }
}
