package findElementVSFindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class findElementVsFindElements {

    public static void main(String[] args) {

        /*
            Find element is finding one WebElement
            Find elements is finding multiple WebElements

            Find element : if we can not find the element it will throw NoSuchElementException
            Find elements : If we can not find the element it will return empty List
         */

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

//      open the browser
        WebDriver driver = new ChromeDriver();

//      navigate to hotels.com
        driver.get("https://www.hotels.com/search.do?resolved-location=NEIGHBORHOOD%3A1535616%3AUNKNOWN%3AUNKNOWN&destination-id=1535616&q-destination=Manhattan,%20New%20York,%20New%20York,%20United%20States%20of%20America&q-check-in=2020-05-07&q-check-out=2020-05-08&q-rooms=1&q-room-0-adults=2&q-room-0-children=0");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        List<WebElement> AllHotels = driver.findElements(By.xpath("//a[@class='property-name-link']"));

        System.out.println("All Hotels size "+AllHotels.size());

        for(int i = 0 ; i<AllHotels.size() ; i++){

            System.out.println(AllHotels.get(i).getText());

        }

        List<WebElement> WrongList =driver.findElements(By.xpath("//a[@class='property-name-linkaaaa']"));

        System.out.println(WrongList.size());

        driver.findElement(By.xpath("//a[@class='property-name-linkaaaa']")).click();
    }

}






