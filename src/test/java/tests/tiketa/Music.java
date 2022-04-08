package tests.tiketa;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Music extends BaseTest {
    @BeforeClass
    public void openLinkAndAcceptCookies() {
        pages.Common.openLink("https://www.tiketa.lt/EN/koncertai");
        pages.Common.acceptAllCookies();
    }
    @Test
    public void testFilterFunctionality() {
        String expectedOutput = "VILNIUS\nALYTUS";
        String actualOutput;

        pages.tiketa.Music.clickOnCityField();
        pages.tiketa.Music.clickOnVilnius();
        pages.tiketa.Music.waitForRefresh();
        pages.tiketa.Music.clickOnCityField();
        pages.tiketa.Music.clickOnAlytus();
        actualOutput = pages.tiketa.Music.getTextofFilters();

        Assert.assertTrue(actualOutput.contains(expectedOutput));
    }
}
