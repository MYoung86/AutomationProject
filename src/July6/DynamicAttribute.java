package July6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DynamicAttribute {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Matt\\Documents\\Drivers\\chromedriver.exe" );

        WebDriver wd = new ChromeDriver();

        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        wd.get("https://register.rediff.com/register/register.php");

        String xpath = "//input[ starts-wth ( @name, 'name' ) ]";

        wd.findElement(By.xpath(xpath)).sendKeys("Duotech");

        //wd.




    }
}
