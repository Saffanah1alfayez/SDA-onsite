package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
       // driver.get("https://www.amazon.com"); just replace google word to amazon word
         driver.get("https://clarusway.com");
    }

}
