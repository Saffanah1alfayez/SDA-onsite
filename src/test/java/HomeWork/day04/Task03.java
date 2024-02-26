package HomeWork.day04;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Task03 {

   /* Go to https://id.heroku.com/login.
    Enter an e-mail address.
    Enter a password.
    Click on the Login button.
    There was a problem with your login.
    If text is visible, print "Registration Failed".
    If the text is not visible, print "Registered".
    Close all pages. */

      WebDriver driver;
      @Test
    public void test() {

          driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
          Assert.assertNotNull(driver);

          //Go to https://id.heroku.com/login.

          driver.get("https://id.heroku.com/login");
          String expectedUr = "https://id.heroku.com/login";
          String actualUrl = driver.getCurrentUrl();
          assertEquals( expectedUr , actualUrl);

          //Enter an e-mail address.

          driver.findElement(By.id("email")).sendKeys("safanhothman@gmail.com");

          //Enter a password.

          driver.findElement(By.id("password")).sendKeys("123");

          //Click on the Login button.

          driver.findElement(By.xpath("//button[text()='Log In']")).click();

            //There was a problem with your login. If text is visible, print "Registration Failed".
                    //If the text is not visible, print "Registered"

          boolean isMassegeDisplayed = driver.findElement(By.xpath("//div[text()='There was a problem with your login.']")).isDisplayed();
          Assert.assertTrue(isMassegeDisplayed);

          // System.out.println("Registration Failed");

          // Check if the error message is visible
            /*WebElement errorMessage = driver.findElement(By.xpath("//div[text()='There was a problem with your login.']"));
            if(errorMessage.isDisplayed()) {
                  System.out.println("Registration Failed");
            }
            else
            {
                System.out.println("Registered");
            }*/

            //Close all pages
            driver.quit();
      }
}
