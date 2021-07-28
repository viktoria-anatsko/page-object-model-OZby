import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AuthorizationPage extends BaseModel {

    @FindBy(xpath = "//a[@id=\"loginFormLoginEmailLink\"]")
            private WebElement emailLink;

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    public String getText() {
        return emailLink.getText();
    }
}
