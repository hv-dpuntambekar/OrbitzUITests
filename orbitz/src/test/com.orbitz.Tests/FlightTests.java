import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class FlightTests extends TestBase {
    FlightSearchPage flightSearchPage;
    FlightResultsPage flightResultsPage;
    public FlightTests() throws IOException {
    }

    @BeforeTest(alwaysRun = true)
    public void setUp() throws IOException {
        initialization();
        flightSearchPage = new FlightSearchPage();
        flightResultsPage = new FlightResultsPage();

    }
    @Test
    public void flightSearchResultsTest() throws IOException, ParseException, InterruptedException {


        flightSearchPage.clickFlightTab();
        log.info("**CLICKED FLIGHT TAB**");

        flightSearchPage.clickMultiCityTab();
        log.info("**CLICKED MULTI-CITY TAB**");

        flightSearchPage.setFlyingCity(PageElementsLocs.originFirstLoc,flightSearchPage.getTestData("originFirstAirport"));
        flightSearchPage.setFlyingCity(PageElementsLocs.desFirstLoc,flightSearchPage.getTestData("destFirstAirport"));
        flightSearchPage.setDeptDate(PageElementsLocs.departureDateFirstLoc, flightSearchPage.getTestData("departureDateFirst"));
        log.info("ADDED 1st FLIGHT DETAILS**");


        flightSearchPage.setNoOfAdults(flightSearchPage.getTestData("noOfAdults"));
        flightSearchPage.setNoOfChildren(flightSearchPage.getTestData("noOfChildren"));
        flightSearchPage.setAgeOfChild(PageElementsLocs.firstChildAgeDropDownLoc,flightSearchPage.getTestData("ageOfFirstChild"));
        flightSearchPage.setAgeOfChild(PageElementsLocs.secondChildAgeDropDownLoc,flightSearchPage.getTestData("ageOfSecondChild"));
        log.info("**ADDED PASSENGER DETAILS**");

        flightSearchPage.setFlyingCity(PageElementsLocs.originSecondLoc,flightSearchPage.getTestData("originSecondAirport"));
        flightSearchPage.setFlyingCity(PageElementsLocs.destSecondLoc,flightSearchPage.getTestData("destSecondAirport"));
        flightSearchPage.setDeptDate(PageElementsLocs.departureDateSecondLoc, flightSearchPage.getTestData("departureDateSecond"));
        log.info("**ADDED 2nd FLIGHT DETAILS**");

        flightSearchPage.clickAddAnotherFlight();
        log.info("**CLICKED ADD ANOTHER FLIGHT**");

        flightSearchPage.setFlyingCity(PageElementsLocs.originThirdLoc,flightSearchPage.getTestData("originThirdAirport"));
        flightSearchPage.setFlyingCity(PageElementsLocs.destThirdLoc,flightSearchPage.getTestData("destThirdAirport"));
        flightSearchPage.setDeptDate(PageElementsLocs.departureDateThirdLoc, flightSearchPage.getTestData("departureDateThird"));
        log.info("**ADDED 3rd FLIGHT DETAILS");

        flightSearchPage.submitSearch();
        log.info("**SUBMITED SEARCH FOR AVAILABLE FLIGHTS**");

        int results = flightResultsPage.noOfAvailableFlights();
        log.info("** NO OF AVAILABLE FLIGHTS::   " + results + "**");

        flightResultsPage.selectLowestPrice();
        flightResultsPage.selectLeastStops();
        log.info("** SELECTED LOWEST FARE AND LEAST STOPS FILTER **");

        flightResultsPage.getFlightDetails();
        log.info("** GOT FLIGHT DETAILS");

        flightResultsPage.selectFlight(PageElementsLocs.selectFirstFlightLoc, PageElementsLocs.selectFareFirstFlightLoc);
        flightResultsPage.selectFlight(PageElementsLocs.selectSecondFlightLoc, PageElementsLocs.selectFareSecondFlightLoc);
        flightResultsPage.selectFlight(PageElementsLocs.selectThirdFlightLoc, PageElementsLocs.selectFareThirdFlightLoc);
        log.info("SELECTED FLIGHTS WITH NO EXTRA CHARGES");

        //Navigate to Review My Trip Page
        SeleniumHelper.switchWindow();

        // Verify Actual search criteria matches with Expected search criteria

        Assert.assertEquals(flightResultsPage.getActualOrigin(PageElementsLocs.actualOriginFirstLoc),flightSearchPage.getTestData("originFirstAirport"));
        Assert.assertEquals(flightResultsPage.getActualDest(PageElementsLocs.actualDestFirstLoc),flightSearchPage.getTestData("destFirstAirport"));
        Assert.assertEquals(flightResultsPage.getActualDepartureDate(PageElementsLocs.actualDepDateFirstLoc),flightSearchPage.getTestData("expDepFirstDate"));
        Assert.assertEquals(flightResultsPage.getActualOrigin(PageElementsLocs.actualOriginSecondLoc),flightSearchPage.getTestData("originSecondAirport"));
        Assert.assertEquals(flightResultsPage.getActualDest(PageElementsLocs.actualDestSecondLoc),flightSearchPage.getTestData("destSecondAirport"));
        Assert.assertEquals(flightResultsPage.getActualDepartureDate(PageElementsLocs.actualDepDateSecondLoc),flightSearchPage.getTestData("expDepSecondDate"));
        Assert.assertEquals(flightResultsPage.getActualOrigin(PageElementsLocs.actualOriginThirdLoc),flightSearchPage.getTestData("originThirdAirport"));
        Assert.assertEquals(flightResultsPage.getActualDest(PageElementsLocs.actualDestThirdLoc),flightSearchPage.getTestData("destThirdAirport"));
        Assert.assertEquals(flightResultsPage.getActualDepartureDate(PageElementsLocs.actualDepDateThirdLoc),flightSearchPage.getTestData("expDepThirdDate"));
        log.info("**VERIFIED ACTUAL SEARCH CRITERIA WITH EXPECTED CRITERIA**");
    }

    @AfterTest(alwaysRun = true)
    public void tearDown(){

        //closeBrowser();
    }

}
