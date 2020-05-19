package TestNG.xmlFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExmpleForXMLFileCopy1 {

    /*
        What is the advantage of xml file?
            1) Able to run multiple files in the same time.
            2) We can do parallel testing with xml file.
            3) We can do cross browser testing.
            4) Parameterize the Tests like browser , user name or password

        How to create a xml file?

        Parallel testing in xml file.

     */

    WebDriver driver;

    @Test(priority = 1)
    public void setup() {

        //         Set property
        //         driver = new chromeDriver

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        //          open the browser
        driver = new ChromeDriver();

        //        navigate to orangehrm.com
        driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(priority = 2)
    public void  login() {

        WebElement dropdownLoginAs = driver.findElement(By.xpath("//button[@data-toggle='dropdown']"));

        dropdownLoginAs.click();

        WebElement systemAdmin = driver.findElement(By.xpath("//a[text()='System Administrator']"));

        systemAdmin.click();

        WebElement adminButton = driver.findElement(By.xpath("//span[text()='Admin']"));

        adminButton.click();

        WebElement buttonJob = driver.findElement(By.xpath("//span[text()='Job']"));

        buttonJob.click();

        WebElement jobTitles = driver.findElement(By.xpath("//span[text()='Job Titles']"));

        jobTitles.click();

        String url = driver.getCurrentUrl();

        Assert.assertEquals(url, "https://orangehrm-demo-6x.orangehrmlive.com/client/#/admin/job_titles");
    }

    @Test(priority = 3)
    public void  quit() {

        driver.quit();

    }

}
