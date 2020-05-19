package SeleniumNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDownloadAndFirstClass {

    /*
        Open the browser

        Navigate to google.com

        navigate back

        navigate forward

        navigate refresh

     */

    public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver" , "D:\\Selenium dependency\\drivers\\chromedriver.exe");

            // open the browser
            WebDriver driver = new ChromeDriver();

//        navigate to google.com
            driver.get("https://www.google.com/");

        Thread.sleep(1000);

//        navigate back
        driver.navigate().back();

        Thread.sleep(1000);

//      navigate forward
        driver.navigate().forward();

        Thread.sleep(1000);

//        navigate refresh
        driver.navigate().refresh();

        driver.navigate().to("https://www.etsy.com/");

        /*
        navigate vs get in selenium

        navigate has back() forward() and refresh methods but

        get() doesnt have those methods

         */



    }


}
