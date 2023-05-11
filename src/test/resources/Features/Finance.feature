

@FinanceFeature
Feature: Navigate to Finance


  @Finance
  Scenario: Create new Invoice

    Given  Browser is open
    And  I login to OneTool
    And I Navigate to Finance
    And I click on create Invoice
    And I create New Invoice
    And I click on ChooseInvoice
    And I write InvoiceTitle
    And I write InvoiceCod
    And I click on chooseProject
    And I Click on ChosePaymentText
    And I Click on ValuePaymentText
    And I Click on Action
    Then I Click on InvoiceGenerate