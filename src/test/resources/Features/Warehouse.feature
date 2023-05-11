
@WarehouseFeature
Feature: Warehouse

  @JournalTest
  Scenario: Create new transfer posting
    Given  Browser is open
    And  I login to OneTool
    When I click on Warehouse
    And I click on Journal
    And I click on WarehouseOverview
    And I click on NewTransferPostingBTN
    And I click on WithSerialNumber
    And I write NewTransferPostingProduct
    And I set on ProposalNumber
    And I set on DeliveryNote
    And I click on Comment
    And I click on NewTransferPostingSave