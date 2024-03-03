package HomeWork.day08;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class challenge01 extends TestBase {

    @Test
    public void test() throws InterruptedException {

        driver.get("https://clarusway.getlearnworlds.com/sda-test-registration-form");

        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@complink='Name_First']")).sendKeys("Saffanh");
        driver.findElement(By.xpath("//input[@complink='Name_Last']")).sendKeys("Alfayez");

        Thread.sleep(2000);
        List<WebElement> radio  = driver.findElements(By.xpath("//*[@role='radiogroup']"));
        radio.get(0).findElement(By.xpath("//*[@for='Radio_1']")).click();
        Thread.sleep(2000);
        Assert.assertTrue(radio.get(0).isSelected());
        radio.get(1).findElement(By.xpath("//*[@for='Radio_2']")).click();
        Assert.assertTrue(radio.get(1).isSelected());



        WebElement dropdown = driver.findElement(By.name("Dropdown"));
        Select select = new Select(dropdown);
        select.selectByIndex(2);


        WebElement singleline = driver.findElement(By.name("SingleLine"));
        Assert.assertFalse(singleline.isEnabled());


    }
}
