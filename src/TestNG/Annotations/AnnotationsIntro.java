package TestNG.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AnnotationsIntro {

    /*

        ANNOTATIONS
            BeforeSuite --> Running the code once before all the <test> run in the suite
                BeforeTest --> Running the code once before the each <test> run in the xml
                    Before class --> Running the code once before the class @Test s run
                        Before method --> Running  the code before each @Test
                               @Test
                        After method -->  Running  the code after each @Test
                     After class --> Running the code once After the class @Test s run
               After Test --> Running the code once after the each <test> run in the xml
           After suite --> Running the code once after all the <test> run in the suite
     */

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){

        System.out.println("before method");

        System.setProperty("webdriver.chrome.driver" , "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        driver = new ChromeDriver();

//        navigate to etsy.com
        driver.get("https://www.etsy.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
    }

    @Test
    public void test1(){

        System.out.println("test1 is running ");

        String url = driver.getCurrentUrl();

        Assert.assertEquals(url , "https://www.etsy.com/");
    }

    @Test
    public void test2(){

        System.out.println("test2 is running ");

        WebElement input = driver.findElement(By.xpath("//input[@data-id='search-query']"));

        input.sendKeys("teddy bear");

        WebElement searchButton = driver.findElement(By.xpath("//button[@value='Search']"));

        searchButton.click();

        String url = driver.getCurrentUrl();

        Assert.assertEquals(url , "https://www.etsy.com/search?q=teddy%20bear");

    }

    @AfterMethod
    public void afterMethod(){

        System.out.println("After method");
        driver.quit();

    }

}
