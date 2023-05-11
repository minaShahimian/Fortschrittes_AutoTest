
@MarketingFeature
Feature: Marketing


  @marketingTest
  Scenario: Create new Newsletter and sent to client

    Given  Browser is open
    And  I login to OneTool
    When I navigate to Marketing
    And I click on CreateNewsletter
    And  I click on Newsletter
    And  I click on ChooseNewsletter
    And  I click on Laden
    And I fill out Newsletter
    And  I click on SBNewsletter
    And  I click on preview
    And  I click on SaveSend
    And  I click on DeselectAll
    Then I select on ContactGroups
    Then I click on ClickSaveToSelectedAddressButton

