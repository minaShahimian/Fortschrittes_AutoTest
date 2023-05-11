package OneTool.pages;

import lombok.Getter;
import lombok.extern.log4j.Log4j;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

@Log4j
@Getter
public class FinancePage extends OneToolPage {

    //Finance: invoice
    // TestScenario: 1)Go to BurgerMenu 2)Click on Finance 3)Click on Invoice 4)Click on createInvoice ->Navigate to Create new invoice
    // 5)Write text Field 6)Click on invoiceGenerate button
    @FindBy(xpath = "//span[text()='Finance']")
    private WebElement Finance;

    public void ClickFinance() {
        Finance.click();
    }

    @FindBy(xpath = "//span[text()='Invoices']")
    private WebElement Invoice;

    public void ClickInvoice() {
        Invoice.click();
    }

    @FindBy(xpath = "//span[text()='Create Invoice']")
    private WebElement createInvoice;

    public void ClickCreateInvoice() {
        createInvoice.click();
    }

    @FindBy(xpath = "//select[@id='option_id']//option[@value='1']")
    private WebElement ChooseInvoice;

    public void ClickChooseInvoice() {
        ChooseInvoice.click();
    }

    @FindBy(xpath = "//textarea[@name='title']")
    private WebElement InvoiceTitle;

    public void SetInvoiceTitle() {
        InvoiceTitle.click();
    }

    @FindBy(xpath = "//input[@id='orderCode']")
    private WebElement InvoiceCod;

    public void SetInvoiceCod() {
        InvoiceCod.click();
    }

    @FindBy(xpath = "//input[@id='token-input-project']")
    private WebElement ChooseProject;

    public void ClickChooseProject() {
        ChooseProject.click();
    }

    @FindBy(xpath = "//select[@id='payment_type']")
    private WebElement chosePaymentText;

    public void ClickChosePaymentText() {
        chosePaymentText.click();
    }

    @FindBy(xpath = "//select[@id='payment_type']//option[3]")
    private WebElement valuePaymentText;

    public void ClickValuePaymentText() {
        valuePaymentText.click();
    }

    @FindBy(xpath = "//input[@value='email']")
    private WebElement action;

    public void ClickAction() {
        action.click();
    }

    @FindBy(xpath = "//input[@id='submitCreate']")
    private WebElement invoiceGenerate;

    public void ClickInvoiceGenerate() {
        invoiceGenerate.click();
    }


}
