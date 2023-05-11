package OneTool.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lombok.extern.log4j.Log4j;
import oneTool.pages.FinancePage;

@Log4j
public class FinanceSteps extends AbstractSteps {

    FinancePage financePage;

    @And("I Navigate to Finance")
    public void I_Navigate_To_Finance() {

        financePage.ClickFinance();
    }

    @And("I click on create Invoice")
    public void I_Click_On_Create_Invoice() {
        financePage.ClickInvoice();

    }
    @And("I create New Invoice")
    public void I_Create_New_Invoice() {
        financePage.ClickCreateInvoice();
    }

    @And("I click on ChooseInvoice")
    public void I_Click_On_ChooseInvoice() {
        financePage.ClickChooseInvoice();
    }

    @And("I write InvoiceTitle")
    public void I_Write_InvoiceTitle() {
        financePage.SetInvoiceTitle();
    }

    @And("I write InvoiceCod")
    public void I_Write_InvoiceCod() {
        financePage.SetInvoiceCod();
    }


    @And("I click on chooseProject")
    public void I_Click_On_ChooseProject() {
        financePage.ClickChooseProject();
    }


    @And("I Click on ChosePaymentText")
    public void I_Click_On_ChosePaymentText() {
        financePage.ClickChosePaymentText();

    }

    @And("I Click on ValuePaymentText")
    public void I_Click_On_ValuePaymentText() {
        financePage.ClickValuePaymentText();

    }

    @And("I Click on Action")
    public void I_Click_On_Action() {
        financePage.ClickAction();

    }

    @Then("I Click on InvoiceGenerate")
    public void I_Click_On_InvoiceGenerate() {
        financePage.ClickInvoiceGenerate();

    }


}
