package TestNG.CrossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchItemCrossBrowser {

    WebDriver driver;

    @BeforeMethod
    @Parameters ({"browser"})
    public void beforeMethod(String browser){

        if(browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

            driver = new ChromeDriver();

        }else if(browser.equals("firefox")){
//            download firefox driver -->>> https://github.com/mozilla/geckodriver/releases

            System.setProperty("webdriver.gecko.driver" , "D:\\Selenium dependency\\drivers\\geckodriver.exe");

            driver = new FirefoxDriver();

        }

        driver.get("https://www.etsy.com/");

        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);

        driver.manage().window().maximize();

    }

    @Test
    @Parameters ({"searchItem"})
    public void test1(String searchItem){

        WebElement search = driver.findElement(By.xpath("//input[@data-id='search-query']"));

        search.sendKeys(searchItem);

        WebElement elementSearch = driver.findElement(By.xpath("//button[@value='Search']"));

        elementSearch.click();

        String url = driver.getCurrentUrl();

        Assert.assertTrue(url.contains(searchItem));

    }


    @AfterMethod
    public void afterMethod(){

        driver.quit();

    }
}
