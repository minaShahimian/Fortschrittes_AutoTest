
@ProposalsFeature
Feature: Proposals

  @NewOrderTest
  Scenario: Proposals -> New Order
    Given  Browser is open
    And  I login to OneTool
    When  I click on Proposals
    And  I click on newOrder
    And  I click on phase
    And  I click on proposalTitle
    #And  I click on Receive
    And  I click on orderCode
   #And  I click on opportunity
    And  I click on paymentType
    #And  I click on addPosition
   #And  I click on addPositionBTN
    And  I write on freeText
    And  I click on sendEmail
    Then I click on OrderGenerateBTN
