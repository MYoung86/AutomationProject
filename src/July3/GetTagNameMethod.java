package July3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GetTagNameMethod {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Matt\\Documents\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB, "test", Keys.ENTER);

        List<WebElement> elements = (List<WebElement>) driver.findElement(By.xpath("//*[@id"));

        for (WebElement element : elements){
          element.getTagName();
            System.out.println();
        }

    }
}
