package OneTool.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j;
import oneTool.pages.MarketingPage;

@Log4j
public class MarketingSteps extends AbstractSteps {

    MarketingPage marketingPage;

    @When("I navigate to Marketing")
    public void I_Navigate_To_Marketing() {
        marketingPage.ClickMarketing();
    }

    @And("I click on CreateNewsletter")
    public void I_Click_On_CreateNewsletter() {
        marketingPage.ClickCreateNewsletter();
    }

    @And("I click on Newsletter")
    public void I_Click_On_Newsletter() {
        marketingPage.ClickNewsletter();
    }

    @And("I click on ChooseNewsletter")
    public void I_Click_On_ChooseNewsletter() {
        marketingPage.ClickChooseNewsletter();
    }

    @And("I click on Laden")
    public void I_Click_On_Laden() {
        marketingPage.ClickLaden();
    }

    @And("I fill out Newsletter")
    public void I_Fill_Out_Newsletter() {
        marketingPage.ClearSubject();
        marketingPage.ClickSubject();
        marketingPage.ClearPreHeader();
        marketingPage.ClickPreHeader();
    }

    @And("I click on SBNewsletter")
    public void I_Click_On_SBNewsletter() {
        marketingPage.ClickSBNewsletter();
    }

    @And("I click on preview")
    public void I_Click_On_Preview() {
        marketingPage.ClickPreview();
    }

    @And("I click on SaveSend")
    public void I_Click_On_SaveSend() {
        marketingPage.ClickSaveSend();
    }

    @And("I click on DeselectAll")
    public void I_Click_On_DeselectAll() {
        marketingPage.ClickAlleDeselectAll();
    }

    @Then("I select on ContactGroups")
    public void I_Select_On_ContactGroups() {
        marketingPage.ClickBewerber();
        marketingPage.ClickCustomers();
        marketingPage.ClickLeads();
        marketingPage.ClickLieferanten();
        marketingPage.ClickMarketingKontakte();

    }

    @Then("I click on ClickSaveToSelectedAddressButton")
    public void I_Click_On_ClickSaveToSelectedAddressButton() {
        marketingPage.ClickSaveToSelectedAddressButton();
    }
}
