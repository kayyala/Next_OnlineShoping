import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Sudhakar on 05/10/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(format = "html:target/Cucumber.html",
        tags = "@Login",
        features = "src/main/resources/User_Ac.feature")
public class RunnerTest {

}
