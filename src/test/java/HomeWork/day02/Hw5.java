package HomeWork.day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw5 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3school.com/");

        driver.manage().window().maximize();

        Dimension size = driver.manage().window().getSize();
        System.out.println("size = " + size);

        Point positiion = driver.manage().window().getPosition();
        System.out.println("positiion = " + positiion);

        driver.manage().window().minimize();
        Thread.sleep(7000);

        driver.manage().window().maximize();

        size = driver.manage().window().getSize();
        System.out.println("Size after maximize :  = " + size);

        positiion = driver.manage().window().getPosition();
        System.out.println("Positiion after maximize :  = " + positiion);


        driver.manage().window().fullscreen();

        driver.quit();

    }

}
