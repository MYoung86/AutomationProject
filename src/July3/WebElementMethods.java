package July3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebElementMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.webdriver","C:\\Users\\Matt\\Documents\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        WebElement usernameInputBox = driver.findElement(By.name("ctl00$MainContent$username"));

        System.out.println( usernameInputBox.getAttribute("type"));
        System.out.println( usernameInputBox.getAttribute("class"));
        System.out.println( usernameInputBox.getAttribute("style"));

        String wrongAtt = usernameInputBox.getAttribute("lang");
        System.out.println(wrongAtt);


    }
}
