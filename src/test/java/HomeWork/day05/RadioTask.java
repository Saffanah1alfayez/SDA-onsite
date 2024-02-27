package HomeWork.day05;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class RadioTask {


    @Test
    public void radioTest1() {

        //ChromeOptions option = new ChromeOptions();
        //option.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");

        driver.findElement(By.xpath("//*[text()='Yes'] ")).click();
        String firstRad = driver.findElement(By.className("mt-3")).getText();
        System.out.println("firstRad = " + firstRad);

        JavascriptExecutor  js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()" , driver.findElement(By.className("mt-3")));

    }

    @Test
    public void radioTest2() {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");

        driver.findElement(By.id("impressiveRadio")).click();
        String secondRad = driver.findElement(By.className("text-success")).getText();
        System.out.println("secondRad = " + secondRad);

    }

}
