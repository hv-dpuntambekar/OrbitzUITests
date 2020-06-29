import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import java.io.IOException;
import java.util.List;

public class SeleniumHelper extends TestBase {

    static WebDriverWait wait= new WebDriverWait(driver, 40);

    public SeleniumHelper() throws IOException {

    }

    public static void click(By identifier) {
        highLightElement(identifier);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(identifier));
            driver.findElement(identifier).click();
        } catch (StaleElementReferenceException|ElementNotInteractableException e) {
            driver.findElement(identifier).click();
        }
    }

   public static void clearText(By identifier) {
        highLightElement(identifier);
        try {
            click(identifier);
            driver.findElement(identifier).clear();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getText(By identifier){
        highLightElement(identifier);
        String txt = "";
        try{
            txt = driver.findElement(identifier).getText();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return txt;
    }

    public static void setText(By identifier, String text) {
        try {
            highLightElement(identifier);
            clearText(identifier);
            driver.findElement(identifier).sendKeys(text);
        } catch (NoSuchElementException e) {
            System.out.println("Element Not found");
        }
    }

    public static void selectOptionFromDDMenu(By identifier, String value)
    {
        highLightElement(identifier);
        Select dropdown = new Select(driver.findElement(identifier));
        dropdown.selectByVisibleText(value);

    }

    public static int getElementList(By locator){
        List<WebElement> listOfElements = driver.findElements(locator);
        return listOfElements.size();
    }

   public static void sleep(long s) throws InterruptedException {
        Thread.sleep(s);
   }

   public static void switchWindow(){
       for(String winHandle : driver.getWindowHandles()){
           driver.switchTo().window(winHandle);
       }

   }

   public static void highLightElement(By identifier)
    {
        WebElement element = driver.findElement(identifier);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }

}
