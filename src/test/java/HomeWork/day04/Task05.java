package HomeWork.day04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task05 {

    //Go to URL: https://www.linkedin.com/
    //Locate the "Email or phone", "password", "Sign in" button using absolute xpath and relative xpath.

    WebDriver driver;

    @Test
    public void test() {

        driver=new ChromeDriver();
        driver.manage().window().maximize();

        //Go to URL: https://www.linkedin.com/

        driver.get("https://www.linkedin.com/ ");

        //Locate the "Email or phone", "password", "Sign in" button using absolute xpath and relative xpath

        // Locate the "Email or phone" field using absolute XPath
        WebElement emailFieldAbsolute = driver.findElement(By.xpath("/html/body/nav/div/a[2]"));
        // Locate the "password" field using absolute XPath
        WebElement passwordFieldAbsolute = driver.findElement(By.xpath("/html/body/nav/div/a[3]"));
        // Locate the "Sign in" button using absolute XPath
        WebElement signInButtonAbsolute = driver.findElement(By.xpath("/html/body/nav/div/a[1]"));

        // Print the located elements using absolute XPath
        System.out.println("Email or phone (Absolute XPath): " + emailFieldAbsolute.getAttribute("outerHTML"));
        System.out.println("Password (Absolute XPath): " + passwordFieldAbsolute.getAttribute("outerHTML"));
        System.out.println("Sign in button (Absolute XPath): " + signInButtonAbsolute.getAttribute("outerHTML"));



        // Locate the "Email or phone" field using relative XPath
        WebElement emailFieldRelative = driver.findElement(By.xpath("//input[@id='username']"));
        // Locate the "password" field using relative XPath
        WebElement passwordFieldRelative = driver.findElement(By.xpath("//input[@id='password']"));
        // Locate the "Sign in" button using relative XPath
        WebElement signInButtonRelative = driver.findElement(By.xpath("//button[@type='submit']"));

        // Print the located elements using relative XPath
        System.out.println("Email or phone (Relative XPath): " + emailFieldRelative.getAttribute("outerHTML"));
        System.out.println("Password (Relative XPath): " + passwordFieldRelative.getAttribute("outerHTML"));
        System.out.println("Sign in button (Relative XPath): " + signInButtonRelative.getAttribute("outerHTML"));


    }
}
