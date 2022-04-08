package tests.tiketa;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.BaseTest;

public class DetailedSearch extends BaseTest {
    @BeforeClass
    public void openLink() {
        pages.Common.openLink("https://www.tiketa.lt/EN/search");
        pages.Common.cookiesAndReload();
    }
    @Test
    public void testCaptionFieldWithAValidInput() {
        String actualInput = "EMIGRANTAI";
        String output;

        //Veiksmai
        pages.tiketa.DetailedSearch.enterMessageToCaptionField(actualInput);
        pages.tiketa.DetailedSearch.clickOnSearchButton();
        output = pages.tiketa.DetailedSearch.getResultText();

        //Palyginimass
        Assert.assertTrue(output.contains(actualInput));
    }

    @Test
    public void confirmXButtonFunctionalityOnCityField(){
        String expectedOutput = "All cities";
        String actualoutput;

        //Veiksmai
        pages.tiketa.DetailedSearch.clickOnSpan();
        pages.tiketa.DetailedSearch.clickOnVilnius();
        pages.tiketa.DetailedSearch.clickOnX();
        actualoutput = pages.tiketa.DetailedSearch.getCityResult();

        //Palyginimas
        Assert.assertEquals(actualoutput,expectedOutput);
    }

    @Test
    public void testDateFunctionalityWithInvalidInputs() {
        String expectedOutput = "No events have been found";
        String actualOutput;
        String dateFrom = "2024-01-01";
        String dateTo = "2024-02-01";

        pages.tiketa.DetailedSearch.enterDateFrom(dateFrom);
        pages.tiketa.DetailedSearch.enterDateTo(dateTo);
        pages.tiketa.DetailedSearch.clickOnSearchButton();
        actualOutput = pages.tiketa.DetailedSearch.getNoEventsHaveBeenFoundMessage();

        Assert.assertEquals(actualOutput,expectedOutput);
    }
}