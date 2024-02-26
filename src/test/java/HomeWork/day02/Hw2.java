package HomeWork.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("www.yahoo.com");
        driver.manage().window().maximize();
        driver.get("www.amazon.com");
        driver.manage().window().maximize();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


    }
}
