package July6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class July6WarmUp {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Matt\\Documents\\Drivers\\chromedriver.exe" );

        WebDriver wd = new ChromeDriver();

        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        wd.get("https://www.dice.com/");

        wd.findElement(By.id("typeaheadInput")).sendKeys("SDET");





    }
}
