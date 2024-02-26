package HomeWork.day02;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw8 {

    WebDriver driver;

    @Before

    public void beforeEachTest () {

        driver = new ChromeDriver();
        System.out.println(" Tests are starting to run ...");
    }


    @Test

    public void Test1 () {


        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String titleMax = driver.getTitle();
        driver.manage().window().setPosition(new Point(-2000, 0));
        String titleMin = driver.getTitle();
        Assert.assertEquals(titleMax, titleMin);
    }

    @Test

    public  void Test2() {

        driver.get("https://www.google.com/");
        driver.manage().window().fullscreen();
        Assert.assertFalse(driver.getTitle().contains("Video"));

    }

    @Test
    public void Test3() {

        driver.get("https://www.google.com/");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
    }

    @After

    public void afterEverytest() {

        driver = new ChromeDriver();
        System.out.println(" Tests have finished running ...");
    }

}
