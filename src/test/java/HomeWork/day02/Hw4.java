package HomeWork.day02;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw4 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://www.w3schools.com");

        //print position and size
        System.out.println(driver.manage().window().getPosition().toString());
        System.out.println(driver.manage().window().getSize());

        //set new size and position
        Point newPosition = new Point(200 , 200);
        Dimension newSize = new Dimension(400 , 400);

        //test
        driver.manage().window().setSize(newSize);
        Thread.sleep(1000);

        driver.manage().window().setPosition(newPosition);
        Thread.sleep(1000);

        driver.quit();


    }
}
