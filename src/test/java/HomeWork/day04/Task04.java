package HomeWork.day04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task04 {

   /* Navigate to https://testpages.herokuapp.com/styled/index.html
    Click on Simple Calculator under Micro Apps.
    Type any number in the first input.
    Type any number in the second input.
    Click on Calculate.
    Get the result.
    Print the result. */

    WebDriver driver;


    @Test
    public void test() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        //Click on Simple Calculator under Micro Apps.
        driver.findElement(By.id("calculatetest")).click();

        //Type any number in the first input.
        driver.findElement(By.id("number1")).sendKeys("1");

        //Type any number in the second input.
        driver.findElement(By.id("number2")).sendKeys("1");

        //Click on Calculate
        driver.findElement(By.id("calculate")).click();

        //Get the result.

        By results = By.xpath("//*[text()='Answer : ']");
       String calculateRes =  driver.findElement(By.xpath("//*[text()='Answer : ']")).getText();

       //Print the result.

        System.out.println("calculateRes = " + calculateRes);

    }

}
