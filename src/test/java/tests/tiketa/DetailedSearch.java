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
        //1. Caption input
        //2. Click on Search
        //3. Find from results containing actualInput
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
        //1. Click on city field's span
        //2. Click on Vilnius
        //3. Click X
        //4. Confirm if Dropdown option displays "All cities"
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
        //1. Set date from 2024-01-01
        //2. to 2024-02-01
        //3. Click Search
        //4. No events have been found should be displayed //*[@id="eventsContainter"]/div[3]/h4[1]/center[1]
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
