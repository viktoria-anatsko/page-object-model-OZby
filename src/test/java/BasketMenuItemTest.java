import base.BaseTest;
import org.junit.Assert;
import org.testng.annotations.Test;

public class BasketMenuItemTest extends BaseTest {

    private static final String TEXT_ON_PAGE = "Вход";

    @Test
    public void testClickBasketMenuItem() {

        BasketPage basketPage = new MainPage(getDriver())
                .openPage()
                .clickBasketMenu();

        Assert.assertEquals(basketPage.getText(), TEXT_ON_PAGE);
    }
}
