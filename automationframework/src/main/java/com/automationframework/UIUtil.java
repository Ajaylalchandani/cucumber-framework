package com.automationframework;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;



/**
 * Utility class  have all the utility functions which will be used across the framework
 *  
 * @author  Ajay Lal Chandani
 * 
 */
public class UIUtil {

   // time expected for a page load/reload in milliseconds
   public static final long PAGE_LOAD_TIME = 250;
   
   /**
    * Creates the web driver to chrome driver and open the URL
    * 
    * @return web driver
 * @throws InterruptedException 
    */ 
   public static WebDriver createDriver() throws InterruptedException  {
	   String driverpath= System.getProperty("user.dir")+"\\lib\\chromedriver\\windows"+"\\chromedriver.exe";
	   System.setProperty("webdriver.chrome.driver", driverpath);
	   WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		Thread.sleep(5000);
      // driver.get("http://localhost:8080/app/ncui/index.html#/ingredients");
      return driver;
   }

   /**
    * Closing the web driver instance 
    * 
    * @param driver driver
    */
   public static void closeDriver(WebDriver driver)  {
      if(driver == null)
         return;
      
      driver.close();
   }

   /**
    * Performs a single tap of the given element
    * 
    * @param element element
    */
   public static void singleTap(WebDriver driver, WebElement element) {
      assertElementDisplayed(element);
      new TouchActions(driver).singleTap(element).perform();
   }

   /**
    * Performs a single click of the given element
    * 
    * @param element element
    * @deprecated singleTap() should be used instead
    */
   public static void singleClick(WebDriver driver, WebElement element) {
      assertElementDisplayed(element);
      element.click();
   }

   /**
    * Retrieves an element for the given index and throws an error if the element
    * cannot be found
    * 
    * @param items items
    * @param index index
    * @return located item
    */
   public static WebElement getElementByIndex(List<WebElement> items, int index) {
      if(items == null)
         throw new IllegalArgumentException("Null items");

      if(items.size() < index)
         throw new IllegalArgumentException("Index out of bounds, requested: " + 
               index + ", items size: " + items.size());
      
      return items.get(index);
   }
   
   /**
    * Creates the given page
    * 
    * @param driver web driver
    * @param type page type
    * @return created page
    */
 
   /**
    * Verifies that the given element is displayed on screen
    * 
    * @param element element
    */
   public static void assertElementDisplayed(WebElement element) {
      if(element == null || !element.isDisplayed())
         throw new IllegalStateException("Element " + element + " is not displayed");
   }

}
