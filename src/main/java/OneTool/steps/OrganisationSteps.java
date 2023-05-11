package OneTool.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j;
import oneTool.pages.OrganisationPage;

@Log4j
public class OrganisationSteps extends AbstractSteps {

    OrganisationPage organisationPage;

    @When("I click on Organisation")
    public void I_Click_On_Setting() {
        organisationPage.ClickOrganisation();
    }

    @And("I click on Project")
    public void I_Click_On_Project() {
        organisationPage.ClickProject();
    }

    @And("I click on  NewProject")
    public void I_Click_On_NewProject() {
        organisationPage.ClickNewProject();
    }

    @And("I navigate to Project")
    public void I_Navigate_To_Project() {
        organisationPage.ClickProject();
    }

    @And("I fill out NewProject")
    public void I_Fill_Out_NewProject() {
        organisationPage.ClickProjectName();
        organisationPage.ClickContact();
        organisationPage.ClickWriteContact();
        organisationPage.ClickResultContact();
        organisationPage.ClickPhase();
        organisationPage.ClickValue1Phase();
        organisationPage.ClickCategories();
        organisationPage.ClickValue1Categories();
        organisationPage.ClickProjectManager();
        organisationPage.ClickValue1ProjectManager();
        organisationPage.ClickCreateNewProjectButton();

    }


}
