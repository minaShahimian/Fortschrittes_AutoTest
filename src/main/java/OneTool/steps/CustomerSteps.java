package OneTool.steps;

import lombok.extern.log4j.Log4j;
import net.thucydides.core.annotations.Steps;

@Log4j
public class CustomerSteps extends AbstractSteps{

    @Steps
    private LoginSteps loginSteps;


    //LoginPage:
    //TestScenario: 1)Write Username and password.  2)Click on login button. ->Navigate to 1Tools page.


  /*  @And("I Login to OneTool")
    public void i_login_to_oneTool()

  */  {


       //loginSteps.navigateAndLogin(user);

    }
}
