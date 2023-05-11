package OneTool.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import oneTool.pages.WarehousePage;

public class WarehouseSteps {
    WarehousePage warehousePage;

    @When("I click on Warehouse")
    public void I_Click_On_Warehouse() {
        warehousePage.ClickWarehouse();
    }

    @And("I click on Journal")
    public void I_Click_On_Journal() {
        warehousePage.ClickJournal();
    }

    @And("I click on WarehouseOverview")
    public void I_Click_On_WarehouseOverview() {
        warehousePage.ClickWarehouseOverview();
    }

    @And("I click on NewTransferPostingBTN")
    public void I_Click_On_NewTransferPostingBTN() {
        warehousePage.ClickNewTransferPostingBTN();

    }

    @And("I click on WithSerialNumber")
    public void I_Click_On_WithSerialNumber() {
        warehousePage.ClickWithSerialNumber();
    }

    @And("I write NewTransferPostingProduct")
    public void I_Write_NewTransferPostingProduct() {
        warehousePage.SetNewTransferPostingProduct("Auto_Test");
    }

    @And("I set on ProposalNumber")
    public void I_Set_On_ProposalNumber() {
        warehousePage.SetProposalNumber(1000);
    }

    @And("I set on DeliveryNote")
    public void I_Set_On_DeliveryNote() {
        warehousePage.SetDeliveryNote(11111);

    }
    @And("I click on Comment")
    public void I_Click_On_Comment() {
        warehousePage.ClickComment();

    }

    @And("I click on NewTransferPostingSave")
    public void I_Click_On_NewTransferPostingSave() {
        warehousePage.ClickNewTransferPostingSave();

    }


}
