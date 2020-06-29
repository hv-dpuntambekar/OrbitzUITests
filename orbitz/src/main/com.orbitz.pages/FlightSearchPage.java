import jdk.jfr.Name;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class FlightSearchPage extends TestBase {

    public FlightSearchPage() throws IOException {
    }
    public String getTestData(String key) throws IOException, ParseException {
        JSONArray dataSet =  jsonReaderClass.readJson();
        JSONObject record = (JSONObject) dataSet.get(0);
        JSONObject data = (JSONObject) record.get("searchCriteria");
        String value = data.get(key).toString();
        return value;
    }
    public void clickFlightTab() {
        SeleniumHelper.click(PageElementsLocs.flightsTabLoc);
    }

    public void clickMultiCityTab() {
        SeleniumHelper.click(PageElementsLocs.multiCityTabLoc);
    }

    public void clickAddAnotherFlight() {
        SeleniumHelper.click(PageElementsLocs.addFlightBtnLoc);
    }

    public void setFlyingCity(By locator, String city) {
        SeleniumHelper.setText(locator, city);
    }

    public void setDeptDate(By locator, String date) {
        SeleniumHelper.setText(locator, date);
    }

    public void setNoOfAdults(String noOfAdults) throws InterruptedException {
        SeleniumHelper.selectOptionFromDDMenu(PageElementsLocs.adultsDropDownLoc, noOfAdults);
    }

    public void setNoOfChildren(String noOfChildren) {
        SeleniumHelper.selectOptionFromDDMenu(PageElementsLocs.childrenDropDownLoc, noOfChildren);
    }

    public void setAgeOfChild(By locator, String ageOfChild) {
        SeleniumHelper.selectOptionFromDDMenu(locator, ageOfChild);
    }

    public void submitSearch() throws InterruptedException {
        SeleniumHelper.click(PageElementsLocs.closeBtnLoc);
        SeleniumHelper.click(PageElementsLocs.searchBtnLoc);
    }

}

