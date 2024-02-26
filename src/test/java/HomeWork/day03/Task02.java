package HomeWork.day03;

import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task02 {
     /*
    Navigate to website  https://testpages.herokuapp.com/styled/index.html
Under the Examples
Click on Locators - Find By Playground Test Page
Print the URL
Navigate back
Print the URL
Click on WebDriver Example Page
Print the URL
Enter value 🡪 20 and Enter to "Enter Some Numbers inputBox"
And then verify 'two, zero' message is displayed on page
Close driver.
      */
    static WebDriver driver;

    @BeforeClass
    static public void  setUp() {
        driver = new ChromeDriver();
        //driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


    }


    @BeforeClass
    public static void taerdown () {
        //driver.quit();
    }
    @Test
    public void teat() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.partialLinkText("Locators - Find")).click();
        String url1 = driver.getCurrentUrl();
        System.out.println( "url1 : "+ url1);
        driver.navigate().back();
        String url2 = driver.getCurrentUrl();
        System.out.println(url2);
        System.out.println( "url2 : "+ url1);
        driver.findElement(By.id("webdriverexamplepage")).click();
       String url3 =  driver.getCurrentUrl();
        System.out.println( "url3 : "+ url1);
        System.out.println(url3);
        driver.findElement(By.xpath("//input[@name]")).sendKeys("20" + Keys.ENTER);

        boolean isMassegeDisplayed = driver.findElement(By.id("message")).isDisplayed();
        Assert.assertTrue(isMassegeDisplayed);

    }


}

