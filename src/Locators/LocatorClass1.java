package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClass1 {


    /*
    TABLE OF CONTENT

        ID
        Name
        Link text
        Partial Link text

        getText
        sendkeys
        click


     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

//        navigate to google.com
        driver.get("https://ultimateqa.com/automation/");

//        id locator
        driver.findElement(By.id("s")).sendKeys("Techno Study");

        driver.findElement(By.id("searchsubmit")).click();

//        System.out.println(driver.getCurrentUrl());

//        Printing current URL
        String URL = driver.getCurrentUrl();

        System.out.println(URL);

        driver.navigate().back();

//      name locator

//        System.out.println(driver.findElement(By.className("et_pb_fullwidth_header_subhead")).getText());

        String header = driver.findElement(By.className("et_pb_fullwidth_header_subhead")).getText();

        System.out.println(header);


//        Linked text

            driver.findElement(By.linkText("Big page with many elements")).click();

            driver.navigate().back();

//        Partial Linked Text

            driver.findElement(By.partialLinkText("Big page with many")).click();



    }


}
