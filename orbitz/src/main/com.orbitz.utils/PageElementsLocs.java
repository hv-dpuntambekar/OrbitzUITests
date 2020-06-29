import org.openqa.selenium.By;

public class PageElementsLocs {

        // FlightSearch Page Locators
        public static By flightsTabLoc = By.id("tab-flight-tab-hp");
        public static By multiCityTabLoc = By.id("flight-type-multi-dest-label-hp-flight");
        public static By adultsDropDownLoc = By.id("flight-adults-hp-flight");
        public static By childrenDropDownLoc = By.id("flight-children-hp-flight");
        public static By firstChildAgeDropDownLoc = By.id("flight-age-select-1-hp-flight");
        public static By secondChildAgeDropDownLoc = By.id("flight-age-select-2-hp-flight");
        public static By addFlightBtnLoc = By.id("add-flight-leg-hp-flight");
        public static By originFirstLoc = By.id("flight-origin-hp-flight");
        public static By originSecondLoc = By.id("flight-2-origin-hp-flight");
        public static By originThirdLoc = By.id("flight-3-origin-hp-flight");
        public static By desFirstLoc = By.id("flight-destination-hp-flight");
        public static By destSecondLoc = By.id("flight-2-destination-hp-flight");
        public static By destThirdLoc = By.id("flight-3-destination-hp-flight");
        public static By departureDateFirstLoc = By.id("flight-departing-single-hp-flight");
        public static By departureDateSecondLoc = By.id("flight-2-departing-hp-flight");
        public static By departureDateThirdLoc = By.id("flight-3-departing-hp-flight");
        public static By closeBtnLoc = By.xpath("//button[contains(@class,'datepicker-close-btn close')]");
        public static By searchBtnLoc = By.xpath("//form[@id='gcw-flights-form-hp-flight']//button[contains(@class,'btn-primary btn-action gcw-submit')]");

        // Flight Result Page Locator
        public static By noOfAvailableFlightsLoc = By.xpath("//*[@class='flight-module segment offer-listing']");
        public static By noStopsLoc = By.xpath("//*[@id='stops']/div/div[3]");
        public static By sortByDropDownLoc = By.xpath("//*[@id='sortDropdown']");
        public static By flightDetailsPriceLoc = By.xpath("//div[@data-test-id='price-column'][1]");
        public static By flightDetailsDepartureTimeLoc = By.xpath("//*[@data-test-id='departure-time'][1]");
        public static By flightDetailsArrivalTimeLoc = By.xpath("//*[@data-test-id='arrival-time'][1]");
        public static By flightDetailsAirlineNameLoc = By.xpath("//*[@data-test-id='airline-name'][1]");
        public static By selectFirstFlightLoc = By.xpath("(//button[@data-test-id='select-button'])[1]");
        public static By selectFareFirstFlightLoc = By.xpath("//button[@data-test-id='select-button-1'][1]");
        public static By selectSecondFlightLoc = By.xpath("(//button[@data-test-id='select-button'])[1]");
        public static By selectFareSecondFlightLoc = By.xpath("//button[@data-test-id='select-button-1'][1]");
        public static By selectThirdFlightLoc = By.xpath("(//button[@data-test-id='select-button'])[1]");
        public static By selectFareThirdFlightLoc = By.xpath("//button[@data-test-id='select-button-1'][1]");

        //Review your trip Page Locators
        public static By actualDepDateFirstLoc = By.xpath("(//div[contains(@class,'departureDate')])[1]");
        public static By actualOriginFirstLoc = By.xpath("(//div[contains(@class,'airportCode')])[1]");
        public static By actualDestFirstLoc = By.xpath("(//div[contains(@class,'airportCode')])[2]");
        public static By actualDepDateSecondLoc = By.xpath("(//div[contains(@class,'departureDate')])[2]");
        public static By actualOriginSecondLoc = By.xpath("(//div[contains(@class,'airportCode')])[3]");
        public static By actualDestSecondLoc = By.xpath("(//div[contains(@class,'airportCode')])[4]");
        public static By actualDepDateThirdLoc = By.xpath("(//div[contains(@class,'departureDate')])[3]");
        public static By actualOriginThirdLoc = By.xpath("(//div[contains(@class,'airportCode')])[5]");
        public static By actualDestThirdLoc = By.xpath("(//div[contains(@class,'airportCode')])[6]");
}
