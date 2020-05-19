package ScroolDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDowntoBottomOfThePage {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

//        navigate to hotels.com
        driver.get("https://www.hotels.com/search.do?resolved-location=NEIGHBORHOOD%3A1535616%3AUNKNOWN%3AUNKNOWN&destination-id=1535616&q-destination=Manhattan,%20New%20York,%20New%20York,%20United%20States%20of%20America&q-check-in=2020-05-07&q-check-out=2020-05-08&q-rooms=1&q-room-0-adults=2&q-room-0-children=0");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        /*
            Scroll down in the page

            When you hit the 50th element in the hotels.com

            then Stop scrolling

            And Print the 50th hotel name in the page
         */


    }

}
