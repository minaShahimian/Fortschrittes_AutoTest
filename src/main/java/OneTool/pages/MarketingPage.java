package OneTool.pages;

import lombok.Getter;
import lombok.extern.log4j.Log4j;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;


@Log4j
@Getter
public class MarketingPage extends OneToolPage {


    //Marketing
    // 1)Go to BurgerMenu 2)Click on Marketing 3)Click on create Newsletter 4)Choose on demo newsletter ->Navigate to Newsletter
    // 5)Write the text Field 6)Click on save button 6)Click on Preview ->Navigate to send Page 7)


    @FindBy(xpath = "//span[text()='Marketing']")
    private WebElement Marketing;

    public void ClickMarketing() {
        Marketing.click();

    }

    @FindBy(xpath = "//span[text()='Create newsletter']")
    private WebElement CreateNewsletter;

    public void ClickCreateNewsletter() {
        CreateNewsletter.click();

    }

    @FindBy(xpath = "//select[@class='width-100']")
    private WebElement Newsletter;

    public void ClickNewsletter() {
        Newsletter.click();

    }

    @FindBy(xpath = "//select[@class='width-100']//option[2]")
    private WebElement ChooseNewsletter;

    public void ClickChooseNewsletter() {
        ChooseNewsletter.click();

    }

    @FindBy(xpath = "//button[@class='btn btn-inverse btn-white']")
    private WebElement Laden;

    public void ClickLaden() {
        Laden.click();

    }

    @FindBy(xpath = "//input[@placeholder='Subject']")
    private WebElement Subject;

    public void ClearSubject() {
        Subject.clear();

    }

    public void ClickSubject() {
        Subject.click();

    }

    @FindBy(xpath = "//textarea[@id='nl_preheader']")
    private WebElement PreHeader;

    public void ClearPreHeader() {
        PreHeader.clear();

    }

    public void ClickPreHeader() {
        PreHeader.click();

    }

    @FindBy(xpath = "//button[@id='saveSubmit']")
    private WebElement SBNewsletter; //SB: SaveButton

    public void ClickSBNewsletter() {
        SBNewsletter.click();

    }

    @FindBy(xpath = "//button[@id='formSubmit']")
    private WebElement preview;

    public void ClickPreview() {
        preview.click();

    }

    @FindBy(xpath = "//button[@id='saveSubmit']") //form[@id='nl_action_form']//button[3]
    private WebElement SaveSend;

    public void ClickSaveSend() {
        SaveSend.click();

    }

    @FindBy(xpath = "//input[@id='check_uncheckall']")
    private WebElement DeselectAll;

    public void ClickAlleDeselectAll() {
        DeselectAll.click();

    }

    @FindBy(xpath = "//input[@value='5']")
    private WebElement Bewerber;

    public void ClickBewerber() {
        Bewerber.click();

    }

    @FindBy(xpath = "//input[@value='2']")
    private WebElement customers;

    public void ClickCustomers() {
        customers.click();

    }

    @FindBy(xpath = "//input[@value='3']")
    private WebElement Leads;

    public void ClickLeads() {
        Leads.click();

    }

    @FindBy(xpath = "//input[@value='4']")
    private WebElement Lieferanten;

    public void ClickLieferanten() {
        Lieferanten.click();

    }

    @FindBy(xpath = "//input[@value='1']")
    private WebElement MarketingKontakte;

    public void ClickMarketingKontakte() {
        MarketingKontakte.click();

    }


    @FindBy(xpath = "//button[@id='send_it']")
    private WebElement SaveToSelectedAddressButton;

    public void ClickSaveToSelectedAddressButton() {
        SaveToSelectedAddressButton.click();
    }
}

