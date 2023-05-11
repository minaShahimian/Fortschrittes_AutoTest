package OneTool.steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import lombok.extern.log4j.Log4j;
import oneTool.pages.LoginPage;

import java.util.concurrent.TimeUnit;


@Log4j
public class LoginSteps extends AbstractSteps {

    LoginPage loginPage;
    //WebDriver driver = null;


    @Given("Browser is open")
    public void browser_is_open() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        // driver = new ChromeDriver();
        driver.get("https://devel.kundenmeister.com/welcome/logout");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.HOURS);
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.HOURS);
        driver.manage().window().maximize();

    }

/*
    @And("I navigate as {} and login")
    public void i_navigate_as_x_and_login(Users user) {
        //loginPage.goToHomePage();
        System.out.println("Hello Method");
        loginPage.login(user);

    }

 */
    @And("I login to OneTool")
    public void i_login_to_OneTool() {
        //loginPage.goToHomePage();
        loginPage.ClickLogin();
        loginPage.setUser();
        loginPage.setPassword();
        loginPage.ClickLogin();

    }


}
