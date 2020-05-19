package ScroolDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolDownToElement {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

//        navigate to hotels.com
        driver.get("https://www.hotels.com/search.do?resolved-location=NEIGHBORHOOD%3A1535616%3AUNKNOWN%3AUNKNOWN&destination-id=1535616&q-destination=Manhattan,%20New%20York,%20New%20York,%20United%20States%20of%20America&q-check-in=2020-05-07&q-check-out=2020-05-08&q-rooms=1&q-room-0-adults=2&q-room-0-children=0");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement elementName = driver.findElement(By.xpath("//h3[text()='Accessibility Features']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView();", elementName);

        Thread.sleep(2000);

        WebElement starRating = driver.findElement(By.xpath("//a[text()='Star rating']"));

        js.executeScript("arguments[0].scrollIntoView();", starRating);

    }
}
