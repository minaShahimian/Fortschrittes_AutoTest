
@OrganisationFeature
Feature: Organisation

  @ProjectTest
  Scenario: Project
    Given  Browser is open
    And  I login to OneTool
    When  I click on Organisation
    And  I click on Project
    And  I click on  NewProject
    And I navigate to Project
    And I fill out NewProject

