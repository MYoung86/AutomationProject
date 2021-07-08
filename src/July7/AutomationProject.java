package July7;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AutomationProject {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Matt\\Documents\\Drivers\\chromedriver.exe" );

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.manage().window().maximize();

      //  Faker fakeData = new Faker();

        String username = "matt" + ran(5);
        System.out.println(username);
        String firstName = "Matt";
        String lastName = "Young";
        String email =  "matt" + ran(3)+ "@abc.com";
        String password = "abc123";



//1
        driver.get("http://duotifyapp.us-east-2.elasticbeanstalk.com/register.php");
        //2
        System.out.print(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Welcome to Duotify!");

        driver.findElement(By.id("hideLogin")).click();

        driver.findElement(By.id("username")).sendKeys((CharSequence) username);

        driver.findElement(By.id("firstName")).sendKeys(firstName);

        driver.findElement(By.id("lastName")).sendKeys(lastName);

        driver.findElement(By.id("email")).sendKeys(email);

        driver.findElement(By.id("email2")).sendKeys(email);

        driver.findElement(By.id("password")).sendKeys(password);

        driver.findElement(By.id("password2")).sendKeys(password);

        driver.findElement(By.name("registerButton")).click();

       Assert.assertEquals("http://duotifyapp.us-east-2.elasticbeanstalk.com/browse.php?",driver.getCurrentUrl());

       Assert.assertEquals(firstName+ " " +lastName, driver.findElement(By.id("nameFirstAndLast")).getText());

       driver.findElement(By.id("nameFirstAndLast")).click();

       driver.findElement(By.id("rafael")).click();

       Thread.sleep(2000);

       Assert.assertEquals("http://duotifyapp.us-east-2.elasticbeanstalk.com/register.php", driver.getCurrentUrl());

       driver.findElement(By.id("loginUsername")).sendKeys(username);

       driver.findElement(By.id("loginPassword")).sendKeys(password);

       driver.findElement(By.name("loginButton")).click();

       Assert.assertEquals(driver.findElement(By.className("pageHeadingBig")).getText(), "You Might Also Like");

       Thread.sleep(2000);

        driver.findElement(By.id("nameFirstAndLast")).click();

        driver.findElement(By.id("rafael")).click();

        Thread.sleep(2000);


        Assert.assertEquals("http://duotifyapp.us-east-2.elasticbeanstalk.com/register.php",driver.getCurrentUrl());






    }


public static String ran(int len){
String ans="";

for (int i = 0; i<len; i++){
    ans  = ans + (int)(Math.random() * 10);

        }

    return ans;
}


}

