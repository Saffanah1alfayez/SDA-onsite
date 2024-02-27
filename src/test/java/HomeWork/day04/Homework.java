package HomeWork.day04;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.security.Key;
import java.time.Duration;

public class Homework {

    /*
1.Go to https://www.temu.com/.
2.Type "iphone" in the search bar and click ENTER.
3.Print the result number.
4.Click on the first product that appears.
5.Add to cart.
6.Click on the cart icon.
7.Print the product price
8.Complete your shopping..
9.Turn off the driver. */


    WebDriver driver;

    @Test
    public void test() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Assert.assertNotNull(driver);

        //1.Go to https://www.temu.com/.
        driver.get("https://www.temu.com/");

        //2.Type "iphone" in the search bar and click ENTER.
        driver.findElement(By.id("searchInput")).sendKeys("iphone" + Keys.ENTER);

        //3.Print the result number.

    }

}
