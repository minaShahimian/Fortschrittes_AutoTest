package OneTool.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j;
import oneTool.pages.UserSettingsPage;

@Log4j
public class UserSettingsSteps extends AbstractSteps {
    UserSettingsPage usersettingsPage;

    //Userdata
    @When("I click on welcomeUsername")
    public void I_click_On_WelcomeUsername() {

        usersettingsPage.ClickWelcomeUser();
    }

    @And("I click on setting")
    public void I_Click_To_Setting() {

        usersettingsPage.ClickSetting();

    }

    @And("I navigate to UserDataTab")
    public void I_Navigate_To_UserDataTab() {

        usersettingsPage.ClickOnUserDataTab();

    }

    @Then("I fill out EditUsername")
    public void I_Fill_Out_EditUsername() {

        usersettingsPage.ClickEditUsername();

    }

    //View

    @And("I navigate to View")
    public void I_Navigate_To_View() {

        usersettingsPage.ClickView();

    }

    @Then("I fill out View")
    public void I_Fill_Out_View() {

        usersettingsPage.ClickStartPage();

    }

    //Contact
    @And("I navigate to Contacts")
    public void I_Navigate_To_Contacts() {
        usersettingsPage.ClickContacts();
    }

    @Then("I fill out Contacts")
    public void I_Fill_Out_Contacts() {
    }


    //TimeTracking
    @And("I navigate to TimeTracking")
    public void I_Navigate_To_TimeTracking() {
        usersettingsPage.ClickTimeTracking();
    }

    @Then("I fill out TimeTracking")
    public void I_Fill_Out_TimeTracking() {
    }


    //Notification
    @And("I navigate to Notifications")
    public void I_Navigate_To_Notifications() {
        usersettingsPage.ClickNotification();
    }

    @Then("I fill out Notifications")
    public void I_Fill_Out_Notifications() {
    }

    //Buttons

    @And("I navigate to Buttons")
    public void I_Navigate_To_Buttons() {
        usersettingsPage.ClickButtons();
    }

    @Then("I fill out Buttons")
    public void I_Fill_Out_Buttons() {
    }

    //ModuleTabs
    @And("I navigate to ModuleTabs")
    public void I_Navigate_To_ModuleTabs() {
        usersettingsPage.ClickModuleTabs();
    }

    @Then("I fill out ModuleTabs")
    public void I_Fill_Out_ModuleTabs() {

    }
}
