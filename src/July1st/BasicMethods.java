package July1st;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;

public class BasicMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Matt\\Documents\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // launches a new browser session

        driver.get("https://www.duotech.io/"); // navigates to a URL

        String currentUrl = driver.getCurrentUrl();

        String expectedUrl = "https://www.duotech.io/"; // retrieves the current URL


        //  Assert.assertEquals(currentUrl,expectedUrl);
        //  Assert.assertTrue(true);
        assertEquals(currentUrl,expectedUrl);

        String expectedTitle = "Duotech Academy";
        String actualTitle = driver.getTitle();

        assertTrue(actualTitle.contains(expectedTitle));

        String HTMLCode = driver.getPageSource();
        assertTrue(HTMLCode.contains("Start New IT&nbsp;Career"));

        driver.get("https://033fc6b.netsolstores.com/store.aspx");
       // driver.findElement(By.xpath("")).click();
        Thread.sleep(2000);

        driver.quit(); // Quits this driver, closing every associated window.
        //driver.close(); // Closes the current window, quitting the browser if it's the last window currently open.
        driver.navigate().to("https://amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

}
