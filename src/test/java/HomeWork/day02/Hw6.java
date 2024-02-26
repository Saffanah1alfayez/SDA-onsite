package HomeWork.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw6 {
    public static void main(String[] args) {

        // I only have chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com");

        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println("The Title : = " + title);

        if (title.contains("video"))
            System.out.println("True , it is contains word video ... ");
        else
            System.out.println("false , it is not  contains word video ... ");

        driver.manage().window().minimize();

        title = driver.getTitle();
        System.out.println("The Title : = " + title);

        if (title.contains("video"))
            System.out.println("True , it is contains word video ... ");
        else
            System.out.println("false , it is not contains word video ... ");

        driver.manage().window().fullscreen();

        driver.quit();

    }
}
