package OneTool.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import oneTool.pages.ProductsPage;

public class ProductsSteps {

    ProductsPage productsPage;

    @When("I click on product")
    public void I_Click_On_Product() {

        productsPage.ClickProduct();
    }

    @And("I click on productOverview")
    public void I_Click_On_ProductOverview() {
        productsPage.ClickProductOverview();

    }

    @And("I click on newProduct")
    public void I_Click_On_NewProduct() {
        productsPage.ClickNewProduct();

    }

    @And("I click on productName")
    public void I_Click_On_ProductName() {
        productsPage.ClickProductName("Auto_Test");

    }

    @And("I click on categoryProductSearch")
    public void I_Click_On_CategoryProductSearch() {
        productsPage.ClickCategoryProductSearch();

    }

    @And("I click on demoCategory")
    public void I_Click_On_DemoCategory() {
        productsPage.ClickDemoCategory();

    }

    @And("I click on chooseDemoCategory")
    public void I_Click_On_ChooseDemoCategory() {
        productsPage.ClickChooseDemoCategory();

    }

    @And("I click on priceProduct")
    public void I_Click_On_PriceProduct() {
        productsPage.ClickPriceProduct();

    }

    @And("I click on productSaveBTN")
    public void I_Click_On_ProductSaveBTN() {
        productsPage.ClickSaveBtnProduct();

    }

}
