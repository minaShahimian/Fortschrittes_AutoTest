@AdministrationFeature
Feature: Navigate to Setting

  @LayoutTest
  Scenario: Layout
    Given  Browser is open
    And I login to OneTool
    When  I click on Administration
    And  I click on GlobalSetting
    And I navigate to Layout
    And I fill out HeaderColor
    Then  I click on SBLayout


  @CustomerPortalTest
  Scenario: Contacts
    Given  Browser is open
    And  I login to OneTool
    When  I click on Administration
    And  I click on GlobalSetting
    And I click on CustomerPortal
    And I click on CustomerPortalOverview
    And I click on projectCategory
    And I click on projectCategoryValue
    And I click on Admin_Email
    And I click on notifyManager
    And I click on AdminMail
    And I click on CustomerMail
    And I click on savaBTN


  @Contact
  Scenario: Contacts
    Given  Browser is open
    And  I login to OneTool
    When  I click on Administration
    And I click on Contacts
    And I click on ContactGroup
    And I write on NewContactGroup
    And I click on SaveButton6

