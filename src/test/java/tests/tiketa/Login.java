package tests.tiketa;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Login extends BaseTest {
    @BeforeClass
    public void openLinkAndAcceptCookies() {
        pages.Common.openLink("https://www.tiketa.lt/EN/");
        pages.Common.acceptAllCookies();
    }

    @Test
    public void testLoginFunctionality() {
        String expectedName = "TESTAVIMAS51342"; //Enter expected account name
        String actualOutcome;

        pages.tiketa.Login.clickOnLoginTab();
        pages.tiketa.Login.enterUsername(""); //Enter username
        pages.tiketa.Login.enterPassword(""); //Enter password
        pages.tiketa.Login.clickOnLoginButton();
        pages.tiketa.Login.waitForRefresh();
        actualOutcome = pages.tiketa.Login.loginInfo();

        Assert.assertEquals(actualOutcome,expectedName);
    }
}
