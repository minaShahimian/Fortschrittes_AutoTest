package OneTool.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class OrganisationPage extends OneToolPage {


    //Organisation: New Project
    //TestScenario: 1)Go to BurgerMenu 2)Click on Organisation 3)Click on Project 4)Write text Field 5)Click on save button

    @FindBy(xpath = "//span[text()='Organisation']")
    private WebElement Organisation;

    public void ClickOrganisation() {
        Organisation.click();
    }

    @FindBy(xpath = "//span[text()='Projects']")
    private WebElement Project;

    public void ClickProject() {
        Project.click();
    }

    @FindBy(xpath = "//span[text()='New project']")
    private WebElement NewProject;

    public void ClickNewProject() {
        NewProject.click();
    }

    @FindBy(xpath = "//input[@id='project[name]']")
    private WebElement ProjectName;

    public void ClickProjectName() {
        ProjectName.click();
    }

    @FindBy(xpath = "//span[@class='select2-chosen']")
    private WebElement Contact;

    public void ClickContact() {
        Contact.click();
    }

    @FindBy(xpath = "/html/body/div[17]/div/input")
    private WebElement WriteContact;

    public void ClickWriteContact() {
        WriteContact.click();
    }

    @FindBy(xpath = "/html/body/div[17]/ul/li/div")
    private WebElement resultContact;

    public void ClickResultContact() {
        resultContact.click();
    }

    @FindBy(xpath = "//select[@name='project[phase]']")
    private WebElement Phase;

    public void ClickPhase() {
        Phase.click();
    }

    @FindBy(xpath = "//select[@name='project[phase]']//option[2]")
    private WebElement Value1Phase;

    public void ClickValue1Phase() {
        Value1Phase.click();
    }

    @FindBy(xpath = "//select[@id='project[type]']")
    private WebElement Categories;

    public void ClickCategories() {
        Categories.click();
    }

    @FindBy(xpath = "//select[@name='project[type]']//option[3]")
    private WebElement Value1Categories;

    public void ClickValue1Categories() {
        Value1Categories.click();
    }

    @FindBy(xpath = "//select[@name='project[manager]']")
    private WebElement ProjectManager;

    public void ClickProjectManager() {
        ProjectManager.click();
    }

    @FindBy(xpath = "//select[@name='project[manager]']//option[1]")
    private WebElement Value1ProjectManager;

    public void ClickValue1ProjectManager() {
        Value1ProjectManager.click();
    }

    @FindBy(xpath = "//button[@class='btn btn-success no-border']")
    private WebElement CreateNewProjectButton;

    public void ClickCreateNewProjectButton() {
        CreateNewProjectButton.click();
    }


}
