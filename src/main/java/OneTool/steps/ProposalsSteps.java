package OneTool.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j;
import oneTool.pages.ProposalsPage;

@Log4j
public class ProposalsSteps extends AbstractSteps {


    ProposalsPage proposalsPage;

    @When("I click on Proposals")
    public void I_Click_On_Proposals() {
        proposalsPage.ClickProposals();
    }

    @And("I click on newOrder")
    public void I_Click_On_NewOrder() {
        proposalsPage.ClickNewOrder();
    }


    @And("I click on phase")
    public void I_Click_On_Phase() {
        proposalsPage.ClickPhase();
    }

    @And("I click on proposalTitle")
    public void I_Click_On_ProposalTitle() {
        proposalsPage.ClickProposalTitle("Auto_Test Proposal");
    }


    @And("I click on Receive")
    public void I_Click_On_Receive() {
        proposalsPage.ClickReceive();
    }

    @And("I click on orderCode")
    public void I_Click_On_OrderCode() {
        proposalsPage.ClickOrderCode("At001");
    }

    @And("I click on opportunity")
    public void I_Click_On_Opportunity() {
        proposalsPage.ClickOpportunity();
    }

    @And("I click on paymentType")
    public void I_Click_On_PaymentType() {
        proposalsPage.ClickPaymentType();
    }

    @And("I click on addPosition")
    public void I_Click_On_AddPosition() {
        proposalsPage.ClickAddPosition();
    }

    @And("I click on addPositionBTN")
    public void I_Click_On_AddPositionBTN() {
        proposalsPage.ClickAddPositionBTN();
    }

    @And("I write on freeText")
    public void I_Write_On_FreeText() {
        proposalsPage.SetFreeText("This Proposal is just for test and don't have any value.");
    }

    @And("I click on sendEmail")
    public void I_Click_On_SendEmail() {
        proposalsPage.ClickSendEmail();
    }

    @Then("I click on OrderGenerateBTN")
    public void I_Click_On_OrderGenerateBTN() {
        proposalsPage.ClickOrderGenerateBTN();
    }

}
