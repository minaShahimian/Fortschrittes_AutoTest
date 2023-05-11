package OneTool.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j;
import oneTool.pages.AdministrationPage;

@Log4j
public class AdministrationSteps extends AbstractSteps {
    AdministrationPage administrationPage;


    //Layout

    @When("I click on Administration")
    public void I_Click_On_Administration() {
        administrationPage.ClickSetting();

    }

    @And("I click on GlobalSetting")
    public void I_Click_On_GlobalSetting() {
        administrationPage.ClickGlobalSetting();

    }

    @And("I navigate to Layout")
    public void I_Navigate_To_Layout() {
        administrationPage.ClickLayout();
    }

    @And("I fill out HeaderColor")
    public void I_Fill_Out_HeaderColor() {
        administrationPage.ClickHeaderColor("#e586bf");
        administrationPage.ClickHeaderNavigationColor("#959de3");
        administrationPage.ClickVersionButtonColor("#8ed6a3");
        administrationPage.ClickContactSearchBorderColor("#db6d6d");
    }
    @Then("I click on SBLayout")
    public void I_Click_On_SBLayout() {
        administrationPage.ClickSBLayout();

    }


    //Customer portal:

    @And("I click on CustomerPortal")
    public void I_Click_On_CustomerPortal() {
        administrationPage.ClickCustomerPortal();

    }

    @And("I click on CustomerPortalOverview")
    public void I_Click_On_CustomerPortalOverview() {
        administrationPage.ClickCustomerPortalOverview();

    }

    @And("I click on projectCategory")
    public void I_Click_On_projectCategory() {
        administrationPage.ClickprojectCategory();

    }

    @And("I click on projectCategoryValue")
    public void I_Click_On_projectCategoryValue() {
        administrationPage.ClickProjectCategoryValue();

    }

    @And("I click on Admin_Email")
    public void I_Click_On_Admin_Email() {
        administrationPage.ClickAdmin_Email();

    }

    @And("I click on notifyManager")
    public void I_Click_On_notifyManager() {
        administrationPage.ClickNotifyManager();

    }

    @And("I click on AdminMail")
    public void I_Click_On_AdminMail() {
        administrationPage.ClickAdminMail();

    }

    @And("I click on CustomerMail")
    public void I_Click_On_CustomerMail() {
        administrationPage.ClickCustomerMail();

    }

    @And("I click on savaBTN")
    public void I_Click_On_SavaBTN() {
        administrationPage.ClickSavaBTN();

    }
    //Contacts

    @And("I click on Contacts")
    public void I_Click_On_Contacts() {
        administrationPage.ClickContacts();

    }

    @And("I click on ContactGroup")
    public void I_Click_On_ContactGroup() {
        administrationPage.ClickContactGroup();

    }

    @And("I write on NewContactGroup")
    public void I_Write_NewContactGroup() {
        administrationPage.ClickNewContactGroup();

    }

    @And("I click on SaveButton6")
    public void I_Click_On_SaveButton6() {
        administrationPage.ClickSaveButton6();

    }

}
