package HandleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class switchParentPart2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

//      open the browser
        WebDriver driver = new ChromeDriver();

//      navigate to etsy.com
        driver.get("https://www.etsy.com/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        WebElement searchInput = driver.findElement(By.cssSelector("input[data-id='search-query']"));

        searchInput.sendKeys("Teddy Bear");

        WebElement searchButton = driver.findElement(By.cssSelector("button[aria-label='Search']"));

        searchButton.click();

        System.out.println("First URL " + driver.getCurrentUrl());

        String parentWindow = driver.getWindowHandle();

        WebElement firstItem = driver.findElement(By.xpath("(//h2[@class='text-gray text-truncate mb-xs-0 text-body'])[1]"));

        firstItem.click();

        Set<String> AllWindows = driver.getWindowHandles();

        for(String handle:AllWindows){
            driver.switchTo().window(handle);
        }

        System.out.println("Second URL  "+ driver.getCurrentUrl());

        driver.switchTo().window(parentWindow);

        System.out.println("Third URL" + driver.getCurrentUrl());

        /*
        Driver close vs driver quit

            close is closing the current page (where is my driver)

            quit is closing the browser

         */

        driver.quit();

    }

}
