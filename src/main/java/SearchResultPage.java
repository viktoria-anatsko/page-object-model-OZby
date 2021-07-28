import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchResultPage extends BaseModel {

    @FindBy(xpath = "//p[text()='Карандаш чернографитный с ластиком \"Party Blackline\" (HB)']")
    private WebElement searchProduct;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public String getText() {
        return searchProduct.getText();
    }
}
