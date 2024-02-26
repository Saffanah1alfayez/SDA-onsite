package HomeWork.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3 {

    public static void main(String[] args) throws InterruptedException {

        //path
        System.setProperty("Web driver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        String title = driver.getTitle();
        System.out.println("title = " + title);

        String expectedTitle = "Expected Title";
        System.out.println(" Expected Title = " + title);

         if (title.contains("Google"))
             System.out.println("Test IS Passed... ");
         else
             System.out.println("Test IS Failed... ");

        driver.close();

    }
}
