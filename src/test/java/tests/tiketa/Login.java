package tests.tiketa;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Login extends BaseTest {
    @BeforeClass
    public void openLink() {
        pages.Common.openLink("https://www.tiketa.lt/EN/");
        pages.tiketa.Login.waitForAdPopupToBeVisible();
        pages.tiketa.Login.acceptAll();
    }

    @Test
    public void testLoginFunctionality() {
        // 1. Click on "Login"
        // 2. Input username
        // 3. Input password
        // 4. Click on "Login" button
        // 5. Check if you're logged in
        String expectedName = "TESTAVIMAS51342";
        String actualOutcome;

        pages.tiketa.Login.clickOnLoginTab();
        pages.tiketa.Login.enterUsername("testavimas51342@outlook.com");
        pages.tiketa.Login.enterPassword("4AVs554Ts41");
        pages.tiketa.Login.clickOnLoginButtonAndSleepFor1Sec();

        actualOutcome = pages.tiketa.Login.loginInfo();

        Assert.assertEquals(actualOutcome,expectedName);
    }
}
