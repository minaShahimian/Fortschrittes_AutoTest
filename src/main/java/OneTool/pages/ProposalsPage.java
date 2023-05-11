package OneTool.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class ProposalsPage extends OneToolPage {

    //Proposals/New Order

    @FindBy(xpath = "//span[text()='Proposals']")
    private WebElement Proposals;

    public void ClickProposals() {
        Proposals.click();
    }

    @FindBy(xpath = "//span[text()='New order']")
    private WebElement NewOrder;

    public void ClickNewOrder() {
        NewOrder.click();
    }

      //Order circles:
    @FindBy(xpath = "//select[@id='phase_id']//option[4]")
    private WebElement Phase;

    public void ClickPhase() {
        Phase.click();
    }

    @FindBy(xpath = "//textarea[@name='title']")
    private WebElement proposalTitle;

    public void ClickProposalTitle(String title) {
        proposalTitle.sendKeys(title);
    }

    //Orders Proposal receive:
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[2]/form/div[2]/div[4]/div/div[4]/div[1]/ul/li[1]/text()")
    private WebElement receive;

    public void ClickReceive() {
        receive.click();
    }

    @FindBy(xpath = "//input[@id='orderCode']")
    private WebElement orderCode;

    public void ClickOrderCode(String code) {
        orderCode.sendKeys(code);
    }

    @FindBy(xpath = "//li[@class='token-input-token-facebook']//p")
    private WebElement opportunity;

    public void ClickOpportunity() {
        opportunity.click();
    }
    //Payment type

    @FindBy(xpath = "//select[@name='payment_type']//option[3]")
    private WebElement paymentType;

    public void ClickPaymentType() {
        paymentType.click();
    }

    @FindBy(xpath = "//div[@id='s2id_product-search']//a[@class='select2-choice']")
    private WebElement addPosition;

    public void ClickAddPosition() {
        addPosition.click();
    }

    @FindBy(xpath = "//div[@id='btnAddPosition']")
    private WebElement addPositionBTN;

    public void ClickAddPositionBTN() {
        addPositionBTN.click();

    }

    //free text

    @FindBy(xpath = "//iframe[@title='WYSIWYG-Editor, customer_text_field, drücken Sie ALT 0 für Hilfe.']")
    private WebElement freeText;

    public void SetFreeText(String text) {
        freeText.sendKeys(text);
    }

    @FindBy(xpath = "//input[@value='email']")
    private WebElement sendEmail;

    public void ClickSendEmail() {
        sendEmail.click();
    }

    @FindBy(xpath = "//input[@id='submitCreate']")
    private WebElement orderGenerateBTN;

    public void ClickOrderGenerateBTN() {
        orderGenerateBTN.click();
    }


}
