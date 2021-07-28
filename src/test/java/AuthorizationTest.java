import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationTest extends BaseTest {

    private static final String EMAIL_LINK = "Электронная почта";

    @Test
    public void testClickAuthorizationButton() {

        AuthorizationPage authorizationPage = new MainPage(getDriver())
                .openPage()
                .clickAuthorizationButton();

        Assert.assertEquals(authorizationPage.getText(), EMAIL_LINK);
    }
}
