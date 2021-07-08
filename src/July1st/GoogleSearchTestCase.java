package July1st;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleSearchTestCase {



    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Matt\\Documents\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();



        // Navigate to google
        driver.get("https://google.com/");
        // Find search field
        WebElement inputBox = driver.findElement(By.name("q"));


        // WebElement interface represents an HTML element

        String searchTerm = "Audi R8";
        // Enter the search term // Hit enter

        inputBox.sendKeys(searchTerm + Keys.ENTER);

        //driver.findElement(By.name("btnk")).click();
        // Verify that the title contains the exact search term
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(searchTerm));

        driver.quit();




    }

}
