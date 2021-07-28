import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchResultTest extends BaseTest {

    private static final String SEARCH_PRODUCT = "Карандаш чернографитный с ластиком \"Party Blackline\" (HB)";

    @Test
    public void testSearchResult() {

        SearchResultPage searchResultPage = new MainPage(getDriver())
                .openPage()
                .searchFor("карандаш\n");

        Assert.assertEquals(searchResultPage.getText() , SEARCH_PRODUCT);
    }
}
