package SelectClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {


    /*

            How do you handle dropdown in selenium?
                I am using select class while handling the dropdown in selenium.

            What are the different options to handle in select class?
                3 options , 1) selectByIndex
                            2) selectByVisibleText
                            3) selectByValue

            Is there any situation you can not use select class?
                Yes, if the dropdown tag is not a select tag then we can not handle with select class.


     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

//        navigate to google.com
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");

        driver.manage().window().maximize();

        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='userName']"));

        usernameInput.sendKeys("StevenGerrard");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));

        passwordInput.sendKeys("admin");

        WebElement signInButton = driver.findElement(By.xpath("//input[@name='login']"));

        signInButton.click();

//      Create WebElement which I am going to work on
        WebElement departDropdown = driver.findElement(By.xpath("//select[@name='fromPort']"));

//      Select object
        Select select = new Select(departDropdown);

//      Select By Index
        select.selectByIndex(3);

        WebElement onDropdown = driver.findElement(By.xpath("//select[@name='fromMonth']"));

        select = new Select(onDropdown);

//      select by visible text
        select.selectByVisibleText("August");

        WebElement toDropdown = driver.findElement(By.xpath("//select[@name='toMonth']"));

        select = new Select(toDropdown);

        select.selectByValue("6");

 
    }


}
