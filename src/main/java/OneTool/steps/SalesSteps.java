package OneTool.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import oneTool.pages.SalesPage;

public class SalesSteps {

    SalesPage salesPage;

    //Opportunities

    @When("I click on Sales")
    public void I_Click_On_Sales() {
        salesPage.ClickSales();
    }

    @And("I click on Opportunities")
    public void I_Click_On_Opportunities() {
        salesPage.ClickOpportunities();
    }

    @And("I click on ClickNewOpportunity")
    public void I_Click_On_NewOpportunity() {
        salesPage.ClickNewOpportunity();
    }

    @And("I write on Appellation")
    public void I_Write_On_Appellation() {
        salesPage.SetAppellation("AutoTest");
    }

    @And("I write on Contact1")
    public void I_Write_On_Contact1() {
        salesPage.SetContact1();
    }

    @And("I click on OpportunitiesPhase")
    public void I_Click_On_OpportunitiesPhase() {
        salesPage.ClickOpportunitiesPhase();
    }

    @And("I click on CostCenter")
    public void I_Click_On_CostCenter() {
        salesPage.ClickCostCenter();
    }

    @And("I click on Source")
    public void I_Click_On_Source() {
        salesPage.ClickSource();
    }

    @And("I click on Revenue")
    public void I_Click_On_Revenue() {
        salesPage.ClickRevenue();
    }

    @And("I click on Responsible")
    public void I_Click_On_Responsible() {
        salesPage.ClickResponsible();
    }

    @And("I click on ProbabilityOfSuccess")
    public void I_Click_On_ProbabilityOfSuccess() {
        salesPage.ClickProbabilityOfSuccess(80);
    }

    @And("I click on Status")
    public void I_Click_On_Status() {
        salesPage.ClickStatus();
    }

    @And("I click on CreateDate")
    public void I_Click_On_CreateDate() {
        salesPage.ClickCreateDate();
    }

    @And("I click on FinishDate")
    public void I_Click_On_FinishDate() {
        salesPage.ClickFinishDate();
    }

    @And("I write Description")
    public void I_Write_kDescription() {
        salesPage.writeDescription("This Opportunity is for test and don't have any value");
    }

    @And("I click on OpportunitiesSaveBTN")
    public void I_Click_On_OpportunitiesSaveBTN() {
        salesPage.ClickOpportunitiesSaveBTN();
    }

    //Campaign
    @And("I click on SalesCampaign")
    public void I_Click_On_SalesCampaign() {
        salesPage.ClickSalesCampaign();

    }

    @And("I click on NewCampaign")
    public void I_Click_On_NewCampaign() {
        salesPage.ClickNewCampaign();
    }

    @And("I click on CampaignName")
    public void I_Click_On_CampaignName() {
        salesPage.ClickCampaignName("Auto_Test");
    }

    @And("I click on associatedProducts")
    public void I_Click_On_AssociatedProducts() {
        salesPage.ClickAssociatedProducts();
    }

    @And("I click on SalesContactGroup")
    public void I_Click_On_SalesContactGroup() {
        salesPage.ClickSalesContactGroup();
    }

    @And("I click on SaveCampaign")
    public void I_Click_On_SaveCampaign() {
        salesPage.ClickSaveCampaign();
    }


}
