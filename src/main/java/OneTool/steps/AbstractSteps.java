package OneTool.steps;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class AbstractSteps {
    @Managed(driver = "chrome") //webdriver.chrome.driver

    protected WebDriver driver;


}
