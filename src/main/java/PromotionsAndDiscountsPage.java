import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PromotionsAndDiscountsPage extends BaseModel {

    @FindBy(xpath = "//a[text()='Распродажа']")
    private WebElement saleMenuItem;

    public PromotionsAndDiscountsPage(WebDriver driver) {
        super(driver);
    }

     public String getText() {
        return saleMenuItem.getText();
    }
}
