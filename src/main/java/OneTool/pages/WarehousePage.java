package OneTool.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class WarehousePage {
    //Warehouse: Journal  (DevelUrl)
    //TestScenario: 1)Go to BurgerMenu 2)Click on Warehouse 3)Click on Journal 4)Click on Overview ->Navigate to Journal
    // 5)click on new transfer posting  6) choose the with serial number
    //7)Write text Field   8)Click on save button

    @FindBy(xpath = "//span[text()='Warehouse']")
    private WebElement warehouse;

    public void ClickWarehouse() {
        warehouse.click();
    }

    @FindBy(xpath = "//span[text()='Journal']")
    private WebElement Journal;

    public void ClickJournal() {
        Journal.click();
    }

    @FindBy(xpath = "//span[text()='Overview']")
    private WebElement warehouseOverview;

    public void ClickWarehouseOverview() {
        warehouseOverview.click();
    }

    @FindBy(xpath = "//a[@id='new-transfer']")
    private WebElement newTransferPostingBTN;

    public void ClickNewTransferPostingBTN() {
        newTransferPostingBTN.click();
    }

    @FindBy(xpath = "//a[@class='accordion-toggle collapsed']")
    private WebElement withSerialNumber;

    public void ClickWithSerialNumber() {
        withSerialNumber.click();
    }

    @FindBy(xpath = "//input[@id='transfer_product_id']")
    private WebElement newTransferPostingProduct;

    public void SetNewTransferPostingProduct(String product) {
        newTransferPostingProduct.sendKeys(product);
    }

    @FindBy(xpath = "//input[@id='product']")
    private WebElement proposalNumber;

    public void SetProposalNumber(Integer proNumber) {
        proposalNumber.sendKeys();
    }


    @FindBy(xpath = "//input[@id='delivery_note']")
    private WebElement deliveryNote;

    public void SetDeliveryNote(Integer note) {
        deliveryNote.sendKeys();
    }

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div[2]/div/div[2]/div[7]/div/div/div[2]/form/div[2]/div[1]/div[2]/div/div/div[5]/div/div/div/textarea")
////div[@class='controls']//textarea[@name='comment']
    private WebElement comment;

    public void ClickComment() {
        comment.click();
    }

    @FindBy(xpath = "//button[@id='btnEditTransferSave']")
    private WebElement newTransferPostingSave;

    public void ClickNewTransferPostingSave() {
        newTransferPostingSave.click();
    }


}
