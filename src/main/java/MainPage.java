import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BaseModel {

    @FindBy(xpath = "//*[@id=\"top-s\"]")
    private WebElement searchPanel;

    @FindBy(xpath = "//a[text()='Акции и скидки']")
    private WebElement promotionsAndDiscountsMenuItem;

    @FindBy(xpath = "//a[text()='Товары в школу']")
    private WebElement goodsToSchoolMenuItem;

    @FindBy(xpath = "//li[@id=\"storesTab\"]")
    private WebElement shopsOZMenuItem;

    @FindBy(xpath = "//a[@class=\"top-panel__userbar__auth\"]")
    private WebElement authorizationButton;

    @FindBy(xpath = "//a[@class=\"top-panel__userbar__cart__item\"]")
    private WebElement basketMenuItem;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage openPage() {
        getDriver().get("https://oz.by/");
        return this;
    }

    public SearchResultPage searchFor(String text) {
        searchPanel.sendKeys(text);

        return new SearchResultPage(getDriver());
    }

    public PromotionsAndDiscountsPage clickPromotionsAndDiscountsMenu() {
        promotionsAndDiscountsMenuItem.click();

        return new PromotionsAndDiscountsPage(getDriver());
    }

    public GoodsToSchoolPage clickGoodsToSchoolMenu() {
        goodsToSchoolMenuItem.click();

        return new GoodsToSchoolPage(getDriver());
    }

    public ShopsOZPage clickShopsOZMenu() {
        shopsOZMenuItem.click();

        return new ShopsOZPage(getDriver());
    }

    public AuthorizationPage clickAuthorizationButton() {
        authorizationButton.click();

        return new AuthorizationPage(getDriver());
    }

    public BasketPage clickBasketMenu() {
        basketMenuItem.click();

        return new BasketPage(getDriver());
    }
}
