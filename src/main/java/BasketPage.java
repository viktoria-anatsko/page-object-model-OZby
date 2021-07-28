import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BasketPage extends BaseModel {

    @FindBy(xpath = "//p[@id=\"loginPopupIntro\"]")
    private WebElement textOnPage;

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public String getText() {
        return textOnPage.getText();
    }
}
