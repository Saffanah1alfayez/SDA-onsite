package HomeWork.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String expectedUrl = "https://www.facebook.com1/";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)){
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }

        String pageSource = driver.getPageSource();

        // Verify if the page source contains "Facebook"
        if (pageSource.contains("Facebook")) {
            System.out.println("Page source of Facebook contains 'Facebook'.");
        } else {
            System.out.println("Page source of Facebook does not contain 'Facebook'.");
        }

        driver.quit();
    }
}

