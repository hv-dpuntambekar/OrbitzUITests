import org.openqa.selenium.By;

import java.io.IOException;

public class FlightResultsPage extends TestBase{
    public FlightResultsPage() throws IOException {
    }

    public int noOfAvailableFlights(){
          int results = SeleniumHelper.getElementList(PageElementsLocs.noOfAvailableFlightsLoc);
          return results;
    }

    public void selectLeastStops(){
        SeleniumHelper.click(PageElementsLocs.noStopsLoc);
    }

    public void selectLowestPrice(){
        SeleniumHelper.selectOptionFromDDMenu(PageElementsLocs.sortByDropDownLoc,"Price (Lowest)");
    }

    public void getFlightDetails(){
       String depTime = SeleniumHelper.getText(PageElementsLocs.flightDetailsDepartureTimeLoc);
       String arrivalTime = SeleniumHelper.getText(PageElementsLocs.flightDetailsArrivalTimeLoc);
       String price = SeleniumHelper.getText(PageElementsLocs.flightDetailsPriceLoc);
       String airlineName = SeleniumHelper.getText(PageElementsLocs.flightDetailsAirlineNameLoc);
        log.info("\n\nFLIGHT DETAILS FOR LOWEST FAIR AND STOPS: Airline Name  " + airlineName + "\n Departure time   "
                + depTime + "\n Arrival time   "  + arrivalTime + "\n Price   " + price + "\n\n");
    }

    public String getActualDest(By airport){
        return SeleniumHelper.getText(airport);
    }

    public String getActualOrigin(By airport){
        return SeleniumHelper.getText(airport);
    }

    public String getActualDepartureDate(By date){
        return SeleniumHelper.getText(date);
    }

    public void selectFlight(By selectFlight, By selectFare) throws InterruptedException {
        SeleniumHelper.sleep(1000);
        SeleniumHelper.click(selectFlight);
        SeleniumHelper.click(selectFare);
    }

}
