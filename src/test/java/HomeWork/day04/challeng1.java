package HomeWork.day04;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class challeng1 {

    WebDriver driver;
    @Test


    public void test () {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Assert.assertNotNull(driver);

        driver.get("https://automationexercise.com/");
        String expectedUrl = "https://automationexercise.com/";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl , actualUrl);

        driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();

        String expectedUr2 = "https://automationexercise.com/login";
        String actualUrl2 = driver.getCurrentUrl();
        assertEquals( expectedUr2 , actualUrl2);

        driver.findElement(By.name("email")).sendKeys("sda@test.com" + Keys.ENTER);


        driver.findElement(By.name("password")).sendKeys("sdainclasstask" + Keys.ENTER);

        // driver.findElement(By.xpath("//button[text()='Login']")).click();
        driver.findElement(By.xpath("//button[@type='submit'][.='Login']")).click();

        String expectedUr3 = "https://automationexercise.com/login";
        String actualUrl3 = driver.getCurrentUrl();
        assertEquals( expectedUr2 , actualUrl2);


    }

}
