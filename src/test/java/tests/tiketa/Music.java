package tests.tiketa;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Music extends BaseTest {
    @BeforeClass
    public void openLink() {
        pages.Common.openLink("https://www.tiketa.lt/EN/koncertai");
        pages.tiketa.Login.acceptAll();
    }
    @Test
    public void testCityFieldFunctionality() {
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
