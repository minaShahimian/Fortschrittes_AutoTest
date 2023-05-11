

package OneTool.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class AdministrationPage extends OneToolPage {

    //Setting:  _GlobalSetting_ Layout:
    //TestScenario: 1)Go to BurgerMenu 2)Click on administration 3)Click on GlobalSetting 4)Click on Layout ->Navigate to Layout
    // 5)Choose color Field 6)Click on save button
    @FindBy(xpath = "//ul[@class='menu']//li[18]")
    private WebElement Setting;

    public void ClickSetting() {
        Setting.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Global settings')]/self::span")
    private WebElement GlobalSetting;

    public void ClickGlobalSetting() {
        GlobalSetting.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Layout')]/self::span")
    private WebElement Layout;

    public void ClickLayout() {
        Layout.click();
    }

    @FindBy(xpath = "//input[@name='header_color']")
    private WebElement HeaderColor;

    public void ClickHeaderColor(String color) {
        HeaderColor.sendKeys(color);
    }

    @FindBy(xpath = "//input[@name='header_nav_color']")
    private WebElement HeaderNavigationColor;

    public void ClickHeaderNavigationColor(String color) {
        HeaderNavigationColor.sendKeys(color);
    }

    @FindBy(xpath = "//input[@name='version_color']")
    private WebElement VersionButtonColor;

    public void ClickVersionButtonColor(String color) {
        VersionButtonColor.sendKeys(color);
    }

    @FindBy(xpath = "//input[@name='contactsearch_border_color']")
    private WebElement ContactSearchBorderColor;

    public void ClickContactSearchBorderColor(String color) {
        ContactSearchBorderColor.sendKeys(color);
    }

    @FindBy(xpath = "//button[@class='btn btn-success']")
    private WebElement SBLayout; // SBLayout: SaveButtonLayout

    public void ClickSBLayout() {
        SBLayout.click();
    }


    // GlobalSetting_Customer portal:
    //TestScenario: 1)Go to BurgerMenu 2)Click on administration 3)Click on GlobalSetting 4)Click on Customer portal ->Navigate to Overview
    // 5)Tab: master data: fill out the form 6)Click on save button

    @FindBy(xpath = "//span[text()='Customer Portal']")
    private WebElement CustomerPortal;

    public void ClickCustomerPortal() {
        CustomerPortal.click();
    }

    @FindBy(xpath = "")
    private WebElement CustomerPortalOverview;

    public void ClickCustomerPortalOverview() {
        CustomerPortalOverview.click();
    }

    @FindBy(xpath = "")
    private WebElement projectCategory;

    public void ClickprojectCategory() {
        projectCategory.click();
    }

    @FindBy(xpath = "")
    private WebElement projectCategoryValue;

    public void ClickProjectCategoryValue() {
        projectCategoryValue.click();
    }

    @FindBy(xpath = "")
    private WebElement Admin_Email;

    public void ClickAdmin_Email() {
        Admin_Email.click();
    }

    @FindBy(xpath = "")
    private WebElement notifyManager;

    public void ClickNotifyManager() {
        notifyManager.click();
    }

    @FindBy(xpath = "")
    private WebElement AdminMail;

    public void ClickAdminMail() {
        AdminMail.click();
    }

    @FindBy(xpath = "")
    private WebElement CustomerMail;

    public void ClickCustomerMail() {
        CustomerMail.click();
    }

    @FindBy(xpath = "")
    private WebElement savaBTN;

    public void ClickSavaBTN() {
        savaBTN.click();
    }


    // Contacts
    //TestScenario: 1)Go to BurgerMenu 2)Click on administration 3)Click on Contact 4)Click on ContactGroup ->Navigate to Manage contact groups
    // 5)Write text Field 6)Click on save button


    @FindBy(xpath = "")
    private WebElement Contacts;

    public void ClickContacts() {
        Contacts.click();
    }

    @FindBy(xpath = "")
    private WebElement ContactGroup;

    public void ClickContactGroup() {
        ContactGroup.click();
    }

    @FindBy(xpath = "")
    private WebElement NewContactGroup;

    public void ClickNewContactGroup() {
        NewContactGroup.click();
    }

    @FindBy(xpath = "")
    private WebElement SaveButton6;

    public void ClickSaveButton6() {
        SaveButton6.click();
    }


}
