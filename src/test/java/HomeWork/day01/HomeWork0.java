package HomeWork.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork0 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println("title = " + title);
        String url =driver.getCurrentUrl();
        System.out.println("url = " + url);
        driver.close();
        driver.quit();


    }
}

