package TestNG.TestNGIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNGIntroductionCopy1 {

    /*
        What is TestNG?
          TestNG is a testing framework for Java programming language inspired by JUnit.

        Advantages of TestNG
          We can generate a proper report.
          Easy to know passed, failed scenarios.
          Multiple test cases can be grouped more easily by converting them into testng.xml file.
          In which you can make priorities which test case should be executed first.
          Using testng, we can execute multiple test cases on multiple browsers, i.e., cross browser testing.

        Annotations
                    @Test
                    @BeforeTest  @AfterTest
                    @BeforeSuite @AfterSuite
                    @BeforeMethod @AfterMethod
                    @BeforeClass @AfterClass

          Download the TestNG jar file

          Create first class

          https://orangehrm-demo-6x.orangehrmlive.com/auth/login

     */

    /*
    Interview Question:
        What is the advantage of TestNG?
        How do you do priority in TestNG?
        What kind of annotations do you use in TestNG?
     */


    WebDriver driver;

    @Test(priority = 1)
    public void setup(){

       System.setProperty("webdriver.chrome.driver" , "D:\\Selenium dependency\\drivers\\chromedriver.exe");

       // open the browser
        driver = new ChromeDriver();

//        navigate to hotels.com
       driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");

       driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);

   }

   @Test(priority = 2)
    public void login(){

        WebElement LoginAsDropdown= driver.findElement(By.xpath("//button[@data-toggle='dropdown']"));

       LoginAsDropdown.click();

       WebElement systemAdminButton = driver.findElement(By.xpath("//a[text()='System Administrator']"));

       systemAdminButton.click();

        String url = driver.getCurrentUrl();

       Assert.assertEquals( url , "https://orangehrm-demo-6x.orangehrmlive.com/client/#/dashboard");

     }

    @Test(priority = 3)
    public void afterClass(){

        driver.quit();
   }

}
