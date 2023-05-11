package OneTool.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j;
import oneTool.pages.ContactPage;
@Log4j
public class ContactSteps extends AbstractSteps{
    ContactPage contactPage;

    @And("I click on ContactMenu")
    public void I_Click_On_ContactMenu() {

        contactPage.ClickContactMenu();

    }

    @When("I click on NewContactMenu")
    public void I_Click_On_NewContactMenu() {

        contactPage.ClickNewContactMenu();

    }
    @And("I fill out newContact")
    public void I_Fill_Out_NewContact(){
        contactPage.ClickNameField();
        contactPage.ClickFamilyNameField();
        contactPage.ClickGenderField();
        contactPage.ClickMail();
        //contactPage.ClickMailCheckbox();
        //contactPage.ClickSmsCheckbox();


    }
    @Then ("I click on saveIcon")
    public void  I_Click_On_SaveIcon(){

        contactPage.ClickSaveIcon();
        contactPage.ClickDeleteIcon();
    }
}