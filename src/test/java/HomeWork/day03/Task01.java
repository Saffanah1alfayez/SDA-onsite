package HomeWork.day03;

import org.checkerframework.checker.units.qual.C;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.PanelUI;
import java.time.Duration;

public class Task01 {

        /*
Create the driver with BeforeClass and make it static inside the class.
Go to http://www.google.com
Type "Green Mile" in the search box and print the number of results.
Type "Premonition" in the search box and print the number of results.
Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
Close with AfterClass.
 */

    static WebDriver driver;
    By searchBox =By.name("q");
    By results = By.id("result-stats");


    @BeforeClass
    public static void setUp() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //driver.get("http://www.google.com");

    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }


    //Type "Green Mile" in the search box and print the number of results.
    @Test
    public void greenMiletest() {
        driver.get("http://www.google.com");
        driver.findElement(searchBox).sendKeys("Green Mile" + Keys.ENTER);
        String totalResult = driver.findElement(results).getText();
        System.out.println("totalResult = " + totalResult);
        //WebDriver driver.findElement(results);

    }

    @Test
    public void premonition () {
        driver.get("http://www.google.com");
        driver.findElement(searchBox).sendKeys("Premonition" + Keys.ENTER);
        String totalResult = driver.findElement(results).getText();
        System.out.println("totalResult = " + totalResult);
        //WebDriver driver.findElement(results);

    }

    //Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
    //Close with AfterClass.

    @Test
    public void benjamin () {
        driver.get("http://www.google.com");
        driver.findElement(searchBox).sendKeys("The Curious Case of Benjamin Button" + Keys.ENTER);
        String totalResult = driver.findElement(results).getText();
        System.out.println("totalResult = " + totalResult);
        //WebDriver driver.findElement(results);

    }

}
