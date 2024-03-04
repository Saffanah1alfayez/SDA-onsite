package HomeWork.day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.time.Duration;

public class Task02 extends TestBase {

    @Test
    public void test() {

        By scroll = By.xpath("//div[@class='rangeslider__handle'][1]");


        driver.get("https://rangeslider.js.org/");
        WebElement scrollbtn = driver.findElement(scroll);

        actions
                .dragAndDropBy(scrollbtn, -100 , 0)
                .pause(Duration.ofSeconds(2))
                .dragAndDropBy(scrollbtn, 100 , 0)
                .build()
                .perform();

    }
}
