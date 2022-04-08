package tests.tiketa;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Login extends BaseTest {
    @BeforeClass
    public void openLink() {
        pages.Common.openLink("https://www.tiketa.lt/EN/");
        pages.tiketa.Login.acceptAll();
    }

    @Test
    public void testLoginFunctionality() {
        String expectedName = "TESTAVIMAS51342";
        String actualOutcome;

        pages.tiketa.Login.clickOnLoginTab();
        pages.tiketa.Login.enterUsername("testavimas51342@outlook.com");
        pages.tiketa.Login.enterPassword("4AVs554Ts41");
        pages.tiketa.Login.clickOnLoginButton();
        pages.tiketa.Login.waitForRefresh();

        actualOutcome = pages.tiketa.Login.loginInfo();

        Assert.assertEquals(actualOutcome,expectedName);
    }
}
