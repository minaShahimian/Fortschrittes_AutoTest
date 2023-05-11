package OneTool.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class UserSettingsPage extends OneToolPage {


    //Users:
    //TestScenario: 1)Click on User 2)Click on Setting ->Navigate to User dataTab 3)Choose chose your Tab

//Userdata Tab



    @FindBy(xpath = "//span[@class='user-name']")
    private WebElement WelcomeUser;
    public void ClickWelcomeUser(){WelcomeUser.click();}

    @FindBy(xpath = "//a[text()=' Settings ']")  //ul[@id='myTab']//li[1]
    private WebElement Setting;
    public void ClickSetting(){Setting.click();}


    @FindBy(xpath = "//a[contains(text(),'Userdata')]/self::a")
    private WebElement UserDataTab;
    public void ClickOnUserDataTab(){UserDataTab.click();}


    @FindBy(xpath = "//input[@id='username']")
    private WebElement EditUsername;
    public void ClickEditUsername(){EditUsername.click();}

    //View Tab

    @FindBy(xpath = " //a[contains(text(),'View')]/self::a")  //ul[@id='myTab']//li[2]
    private WebElement View;
    public void ClickView(){ View.click();}

    @FindBy(xpath = "//select[@name='startpage']//option[4]")
    private WebElement StartPage;
    public void ClickStartPage(){ StartPage.click();}



    //Contact Tab
    @FindBy(xpath = " //a[contains(text(),'Contacts')]/self::a")  //ul[@id='myTab']//li[3]
    private WebElement Contacts;
    public void ClickContacts(){ Contacts.click();}



    //TimeTracking Tab
    @FindBy(xpath = "//a[contains(text(),'Timetracking')]/self::a")  //ul[@id='myTab']//li[4]
    private WebElement TimeTracking;
    public void ClickTimeTracking(){ TimeTracking.click();}

    //Notification Tab
    @FindBy(xpath = "//a[contains(text(),'Notifications')]/self::a")  //ul[@id='myTab']//li[5]
    private WebElement Notification;
    public void ClickNotification(){ Notification.click();}



    //Buttons Tab
    @FindBy(xpath = "//a[contains(text(),'Buttons')]/self::a")  //ul[@id='myTab']//li[6]
    private WebElement Buttons;
    public void ClickButtons(){ Buttons.click();}



    //ModuleTabs Tab
    @FindBy(xpath = "//a[contains(text(),'Module Tabs')]/self::a")  //ul[@id='myTab']//li[7]
    private WebElement ModuleTabs;
    public void ClickModuleTabs(){ ModuleTabs.click();}


}



