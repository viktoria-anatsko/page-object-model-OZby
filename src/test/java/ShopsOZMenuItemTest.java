import base.BaseTest;
import org.junit.Assert;
import org.testng.annotations.Test;

public class ShopsOZMenuItemTest extends BaseTest {

    private static final String LINK_LEARN_MORE = "Узнать больше";

    @Test
    public void testClickShopsOZMenuItem() {

        ShopsOZPage shopsOZPage = new MainPage(getDriver())
                .openPage()
                .clickShopsOZMenu();

        Assert.assertEquals(shopsOZPage.getText(), LINK_LEARN_MORE);
    }
}
