import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ShopsOZPage extends BaseModel {

    @FindBy(xpath = "//a[@class=\"site-desc__controls__item\"]")
    private WebElement linkOnPage;

    public ShopsOZPage(WebDriver driver) {
        super(driver);
    }

    public String getText() {
        return linkOnPage.getText();
    }
}
