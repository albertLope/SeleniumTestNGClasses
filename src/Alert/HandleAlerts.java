package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandleAlerts {

    public static void main(String[] args) {

        /*
            How do you handle Alerts in selenium?

            driver.switchTo().alert.
                 accept    --> ok
                 dismiss   --> cancel
                 getText   --> get the text from alert
                 sendkeys  --> type in the alert

         */
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

//      open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/delete_customer.php");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        WebElement inputCustomerID = driver.findElement(By.xpath("//input[@name='cusid']"));

        inputCustomerID.sendKeys("11234");

        WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));

        submitButton.click();

        String alertText = driver.switchTo().alert().getText();

        System.out.println(alertText);

//        clicking ok on the alert
//        driver.switchTo().alert().accept();

        driver.switchTo().alert().dismiss();

        driver.switchTo().alert().sendKeys("I am in the alert");
    }

}
