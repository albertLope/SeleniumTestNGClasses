package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HoverOverInSelenium {

    public static void main(String[] args) throws InterruptedException {

        /*
            Hover over in the action class.


            Interview question.
                How do you hover over in selenium?
                        I am using the action class to hover over in selenium.

                How do you use action class in selenium?

         */

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver;

        driver = new ChromeDriver();

        driver.get("https://www.etsy.com/");

        driver.manage().window().maximize();

        Actions action = new Actions(driver);

//        element 1 to hover over on
        WebElement homeAndLiving = driver.findElement(By.xpath("//span[contains(text(),'Home & Living')]"));

//        I am hover over on  home and living element
        action.moveToElement(homeAndLiving).perform();

        Thread.sleep(2000);

//        element 2 to hover over on
        WebElement  Jewelry = driver.findElement(By.xpath("//span[contains(text(),'Jewelry & Accessories')]"));

        action.moveToElement(Jewelry).perform();



    }

}
