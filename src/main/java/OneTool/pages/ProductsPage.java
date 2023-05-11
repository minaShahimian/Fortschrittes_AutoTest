package OneTool.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    //Products: NewProduct
    //TestScenario: 1)Go to BurgerMenu 2)Click on Products 3)Click on Overview 4)Click on add Product ->Navigate to ProductInformation
    // 5)Fill text Field 6)Click on save button

    @FindBy(xpath = "//span[text()='Products']")
    private WebElement Product;

    public void ClickProduct() {
        Product.click();
    }

    @FindBy(xpath = "//span[text()='Overview']")
    private WebElement ProductOverview;

    public void ClickProductOverview() {
        ProductOverview.click();
    }

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/a")
    private WebElement NewProduct;

    public void ClickNewProduct() {
        NewProduct.click();
    }

    @FindBy(xpath = "//input[@id='bezeichnung']")
    private WebElement ProductName;

    public void ClickProductName(String productName) {
        ProductName.sendKeys();
    }

    @FindBy(xpath = "")
    private WebElement CategoryProductSearch;

    public void ClickCategoryProductSearch() {
        CategoryProductSearch.click();
    }

    @FindBy(xpath = "")
    private WebElement DemoCategory;

    public void ClickDemoCategory() {
        DemoCategory.click();
    }

    @FindBy(xpath = "")
    private WebElement ChooseDemoCategory;

    public void ClickChooseDemoCategory() {
        ChooseDemoCategory.click();
    }

    @FindBy(xpath = "")
    private WebElement PriceProduct;

    public void ClickPriceProduct() {
        PriceProduct.click();
    }

    @FindBy(xpath = "")
    private WebElement SaveBtnProduct;

    public void ClickSaveBtnProduct() {
        SaveBtnProduct.click();
    }


    //Products: Category  (DevelUrl)
    //TestScenario: 1)Go to BurgerMenu 2)Click on Products 3)Click on Category ->Navigate to Category Information
    // 5)Write text Field 6)Click on Save button


}
