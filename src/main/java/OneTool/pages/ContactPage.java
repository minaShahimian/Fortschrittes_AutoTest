package OneTool.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class ContactPage extends OneToolPage {
    // public ContactPage(WebDriver driver) {    }


    //New ContactPerson
    //TestScenario: 1)Go to BurgerMenu 2)Click on Contact 3)Click on NewContact 4)Write the text Field 5)Click on save button

    @FindBy(xpath = "//span[text()='Contacts']")
    private WebElement ContactMenu;

    public void ClickContactMenu() {
        ContactMenu.click();
    }

    @FindBy(xpath = "//span[text()='New contact']")
    private WebElement NewContactMenu;

    public void ClickNewContactMenu() {
        NewContactMenu.click();
    }

    @FindBy(xpath = "//input[@id='vorname']")
    private WebElement nameField;

    public void ClickNameField() {
        nameField.sendKeys("Auto_Test");
    }

    @FindBy(xpath = "//input[@id='name']")
    private WebElement FamilyNameField;

    public void ClickFamilyNameField() {
        FamilyNameField.sendKeys("Auto_Test");
    }

    @FindBy(xpath = "//select[@id='sex']//option[2]")
    private WebElement GenderField;

    public void ClickGenderField() {
        GenderField.click();
    }


    @FindBy(xpath = "//input[@id='mail']")
    private WebElement Mail;

    public void ClickMail() {
        Mail.sendKeys("Testing@1tool.com");
    }


    @FindBy(xpath = "//input[@id='mail_nl']")
    private WebElement MailCheckbox;

    public void ClickMailCheckbox() {
        MailCheckbox.click();
    }

    @FindBy(xpath = "//input[@id='sms_nl']")
    private WebElement SmsCheckbox;
    public void ClickSmsCheckbox() {
        SmsCheckbox.click();
    }

    @FindBy(xpath = "//button[@class='btn btn-success btn-small']")
    private WebElement SaveIcon;

    public void ClickSaveIcon() {
        SaveIcon.click();
    }

    @FindBy(xpath = "//button[@class='btn btn-success btn-small']")
    private WebElement DeleteIcon;

    public void ClickDeleteIcon() {
        DeleteIcon.click();
    }


}
