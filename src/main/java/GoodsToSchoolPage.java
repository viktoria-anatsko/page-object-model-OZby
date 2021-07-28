import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GoodsToSchoolPage extends BaseModel {

    @FindBy(xpath = "//h1[@class=\"landing-header__title\"]")
    private WebElement pageTitle;

    public GoodsToSchoolPage(WebDriver driver) {
        super(driver);
    }

    public String getText() {
        return pageTitle.getText();
    }
}
