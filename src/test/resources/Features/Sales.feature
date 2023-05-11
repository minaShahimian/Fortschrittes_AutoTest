@SalesFeature
Feature: Sales

  @OpportunitiesTest
  Scenario: Create Opportunities
    Given  Browser is open
    And  I login to OneTool
    When I click on Sales
    And I click on Opportunities
    And I click on ClickNewOpportunity
    And I write on Appellation
    #And I write on Contact1
    And I click on OpportunitiesPhase
    And I click on CostCenter
    And I click on Source
    And I click on Revenue
    And I click on Responsible
    And I click on ProbabilityOfSuccess
    And I click on Status
    And I click on CreateDate
    And I click on FinishDate
    And I write Description
    And I click on OpportunitiesSaveBTN



  @SalesCampaignTest
  Scenario: Create Campaign
    Given  Browser is open
    And  I login to OneTool
    When I click on Sales
    And I click on SalesCampaign
    And I click on NewCampaign
    And I click on CampaignName
    #And I click on associatedProducts
    And I click on SalesContactGroup
    And I click on SaveCampaign