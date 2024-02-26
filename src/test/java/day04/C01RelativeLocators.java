package day04;

import org.checkerframework.checker.units.qual.C;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class C01RelativeLocators {
//35
    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.linkedin.com/");
        By emailFiled = RelativeLocator.with(By.id("session_key")).above(By.id("session_password"));
        driver.findElement(emailFiled).sendKeys("i did it :) ");




    }
}
