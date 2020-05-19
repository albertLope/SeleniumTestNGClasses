package GetTitleURL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleURL {

    public static void main(String[] args) {

        /*
            Get title

            Get URL

            Max window
         */

        System.setProperty("webdriver.chrome.driver" , "D:\\Selenium dependency\\drivers\\chromedriver.exe");

// open the browser
        WebDriver driver = new ChromeDriver();

//        navigate to etsy.com
        driver.get("https://www.etsy.com/");

//        maximize the window
        driver.manage().window().maximize();

        String url1 = driver.getCurrentUrl();

        String title1 = driver.getTitle();

        System.out.println(url1);
        System.out.println(title1);

        WebElement searchInput = driver.findElement(By.cssSelector("input[name='search_query']"));

        searchInput.sendKeys("Teddy bear");

        WebElement searchButton = driver.findElement(By.cssSelector("button[aria-label='Search']"));

        searchButton.click();

        String url2 = driver.getCurrentUrl();

        String title2 = driver.getTitle();

        System.out.println(url2);

        System.out.println(title2);

    }

}
