package OneTool.steps;

import io.cucumber.java.en.Then;
import lombok.extern.log4j.Log4j;
import oneTool.pages.DashboardPage;

@Log4j
public class DashboardSteps extends AbstractSteps {

    DashboardPage dashboardPage;


    @Then("I click on Search")
    public void I_Click_On_Search() {
        dashboardPage.ClickSearch();
    }
}
