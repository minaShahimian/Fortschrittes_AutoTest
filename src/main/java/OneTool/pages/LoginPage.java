package OneTool.pages;

import lombok.extern.log4j.Log4j;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

@Log4j

public class LoginPage extends OneToolPage {


    //LoginPage:
    //TestScenario: 1)Write Username and password.  2)Click login button. ->Navigate to OneTool page.

    @FindBy(xpath = "//input[@id='email']")
    private WebElement User;

    public void setUser() {
        User.sendKeys("Testing@1Tool.com ");
    }

    @FindBy(xpath = "//input[@id='password']")
    private WebElement Password;

    public void setPassword() {
        Password.sendKeys("L.w2khMW!TEMYi.EXxQ!hpHyvedQNj8nBGH");
    }

    @FindBy(xpath = "//button[@class='width-35 pull-right btn btn-sm btn-primary ']")
    private WebElement Login;

    public void ClickLogin() {
        Login.click();
    }

/*

    public void login(Users user) {
        ClickLogin();
       login(user.getUsername(), user.getPassword());
    }

    public void login( final String username, final String password) {

        writeTextToInputField("//input[@id='email']", username, true, false);
        writeTextToInputField("//input[@id='password']", password, true, false);
        ClickLogin();
    }


 */


}
