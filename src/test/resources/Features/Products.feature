
@ProductsFeature
Feature: products

  @ProductsTest
  Scenario: NewProduct
    Given  Browser is open
    And  I login to OneTool
    When I click on product
    And I click on productOverview
    And I click on newProduct
    And I click on productName
    And I click on categoryProductSearch
    And I click on demoCategory
    And I click on chooseDemoCategory
    And I click on priceProduct
    And I click on productSaveBTN
