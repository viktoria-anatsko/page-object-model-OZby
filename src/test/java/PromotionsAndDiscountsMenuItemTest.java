import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PromotionsAndDiscountsMenuItemTest extends BaseTest {

    private static final String SALE_MENU_ITEM = "Распродажа";

    @Test
    public void testClickPromotionsAndDiscountsMenuItem() {

        PromotionsAndDiscountsPage promotionsAndDiscountsPage = new MainPage(getDriver())
                .openPage()
                .clickPromotionsAndDiscountsMenu();

        Assert.assertEquals(promotionsAndDiscountsPage.getText(), SALE_MENU_ITEM);
    }
}
