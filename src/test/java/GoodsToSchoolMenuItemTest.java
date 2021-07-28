import base.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoodsToSchoolMenuItemTest extends BaseTest {

    private static final String PAGE_TITLE = "Товары к школе";

    @Test
    public void testClickGoodsToSchoolMenuItem() {

        GoodsToSchoolPage goodsToSchoolPage = new MainPage(getDriver())
                .openPage()
                .clickGoodsToSchoolMenu();

        Assert.assertEquals(goodsToSchoolPage.getText(), PAGE_TITLE);
    }
}
