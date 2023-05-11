package OneTool.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class DashboardPage extends OneToolPage {


    //Search
    @FindBy(xpath = "//i[@class='km-search']")
    private WebElement Search;

    public void ClickSearch() {
        Search.click();
    }


}
