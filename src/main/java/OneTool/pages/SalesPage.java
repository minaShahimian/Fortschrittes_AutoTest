package OneTool.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class SalesPage {

    //Sales:  Opportunities
    //TestScenario: 1)Go to BurgerMenu 2)Click on Sales 3)Click on Opportunities 4)Click on new opportunity ->Navigate to Opportunities
    // 5)Write text Field 6)Click on save button

    @FindBy(xpath = "//span[text()='Sales']")
    private WebElement Sales;

    public void ClickSales() {
        Sales.click();
    }

    @FindBy(xpath = "//span[text()='Opportunities']")
    private WebElement Opportunities;

    public void ClickOpportunities() {
        Opportunities.click();
    }

    @FindBy(xpath = "//span[text()='New opportunity']")
    private WebElement NewOpportunity;

    public void ClickNewOpportunity() {
        NewOpportunity.click();
    }

    @FindBy(xpath = "//input[@id='opportunity']")
    private WebElement Appellation;

    public void SetAppellation(String appellation) {
        Appellation.sendKeys(appellation);
    }

    @FindBy(xpath = "//input[@id='s2id_autogen1']")
    private WebElement Contact1;

    public void SetContact1() {
        Contact1.click();
    }

    @FindBy(xpath = "//select[@name='stage_id']//option[4]")
    private WebElement OpportunitiesPhase;

    public void ClickOpportunitiesPhase() {
        OpportunitiesPhase.click();
    }

    @FindBy(xpath = "//select[@name='kostenstelle_id']//option[2]")
    private WebElement CostCenter;

    public void ClickCostCenter() {
        CostCenter.click();
    }

    @FindBy(xpath = "//select[@name='source_id']//option[8]")
    private WebElement Source;

    public void ClickSource() {
        Source.click();
    }

    @FindBy(xpath = "//input[@id='revenue']")
    private WebElement Revenue;

    public void ClickRevenue() {
        Revenue.click();
    }

    @FindBy(xpath = "//select[@name='user_id']//option[2]")
    private WebElement Responsible;

    public void ClickResponsible() {
        Responsible.click();
    }

    @FindBy(xpath = "//input[@id='input_propability']")
    private WebElement ProbabilityOfSuccess;

    public void ClickProbabilityOfSuccess(Integer Probability) {
        ProbabilityOfSuccess.sendKeys();
    }

    @FindBy(xpath = "//div[@id='status']//input[@value='2']")
    private WebElement Status;

    public void ClickStatus() {
        Status.click();
    }

    @FindBy(xpath = "//input[@id='creation_date']")
    private WebElement createDate;

    public void ClickCreateDate() {
        createDate.click();
    }

    @FindBy(xpath = "//input[@id='finish_date']")
    private WebElement FinishDate;

    public void ClickFinishDate() {
        FinishDate.click();
    }

    @FindBy(xpath = "//textarea[@id='description']")
    private WebElement Description;

    public void writeDescription(String description) {
        Description.sendKeys(description);
    }

    @FindBy(xpath = "//button[@class='btn btn-success']")
    private WebElement OpportunitiesSaveBTN;

    public void ClickOpportunitiesSaveBTN() {
        OpportunitiesSaveBTN.click();
    }


    //Sales: Campaign
    //TestScenario: 1)Go to BurgerMenu 2)Click on Sales 3)Click on Sales Campaign 4)Click on new Campaign ->Navigate to Create Campaign
    // 5)Fill text Field 6)Click on save button

    @FindBy(xpath = "//span[text()='Sales campaign']")
    private WebElement SalesCampaign;

    public void ClickSalesCampaign() {
        SalesCampaign.click();
    }

    @FindBy(xpath = "//span[text()='New campaign']")
    private WebElement NewCampaign;

    public void ClickNewCampaign() {
        NewCampaign.click();
    }

    @FindBy(xpath = "//input[@id='name']")
    private WebElement CampaignName;

    public void ClickCampaignName(String name) {
        CampaignName.sendKeys(name);
    }

    @FindBy(xpath = "//input[@id='s2id_autogen1']")
    private WebElement associatedProducts;

    public void ClickAssociatedProducts() {
        associatedProducts.click();
    }

    @FindBy(xpath = "//select[@id='won_contact_group']//option[5]")
    private WebElement SalesContactGroup;

    public void ClickSalesContactGroup() {
        SalesContactGroup.click();
    }

    @FindBy(xpath = "//button[@value='save']")
    private WebElement SaveCampaign;

    public void ClickSaveCampaign() {
        SaveCampaign.click();
    }


}
