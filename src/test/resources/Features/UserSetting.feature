@EditUserDataFeature
Feature: Navigate to User

  @UserDataTabTest
  Scenario: UserData
    Given  Browser is open
    And  I login to OneTool
    When  I click on welcomeUsername
    And  I click on setting
    And I navigate to UserDataTab
    Then I fill out EditUsername


  @ViewTabTest
  Scenario: View
    Given  Browser is open
    And  I login to OneTool
    When  I click on welcomeUsername
    And  I click on setting
    And I navigate to View
    Then I fill out View

  @ContactTabTest
  Scenario: Contacts
    Given  Browser is open
    And  I login to OneTool
    When  I click on welcomeUsername
    And  I click on setting
    And I navigate to Contacts
    Then I fill out Contacts


  @TimeTrackingTabTest
  Scenario: TimeTracking
    Given  Browser is open
    And  I login to OneTool
    When  I click on welcomeUsername
    And  I click on setting
    And I navigate to TimeTracking
    Then I fill out TimeTracking

  @NotificationsTabTest
  Scenario: Notifications
    Given  Browser is open
    And  I login to OneTool
    When  I click on welcomeUsername
    And  I click on setting
    And I navigate to Notifications
    Then I fill out Notifications

  @ButtonsTabTest
  Scenario: Buttons
    Given  Browser is open
    And  I login to OneTool
    When  I click on welcomeUsername
    And  I click on setting
    And I navigate to Buttons
    Then I fill out Buttons

  @ModuleTabsTest
  Scenario: ModuleTabs
    Given  Browser is open
    And  I login to OneTool
    When  I click on welcomeUsername
    And  I click on setting
    And I navigate to ModuleTabs
    Then I fill out ModuleTabs

