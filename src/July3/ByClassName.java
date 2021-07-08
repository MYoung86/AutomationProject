package July3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ByClassName {

    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Matt\\Documents\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // launches a new browser session


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.duotech.io/"); // navigates to a URL

        driver.manage().window().maximize(); // maximizes the window

        driver.findElement(By.className("scroll-down-link")).click(); // className can only accept on class attribute value.
        //it will not work for multiple classes
        driver.findElement(By.xpath("//a[@href='/about-us]")).click();

        driver.findElement(By.xpath("//input[@value='Submit Messag'")).click();


    }
}
