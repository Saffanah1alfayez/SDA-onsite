package HomeWork.day02;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw9 {

    static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        driver = new ChromeDriver();
        driver.get("https://w3school.com/");
        driver.manage().window().maximize();
    }


    @Before

    public void beforeEachTest () {

        System.out.println("STARTED");
        System.out.println("Test has started ");

    }

    @Test

    public void Test1 () {

        driver.manage().window().minimize();
        boolean isTitleContain = driver.getTitle().contains("w3Schools");
        Assert.assertTrue(isTitleContain);
        System.out.println("Test Title Contains W3school running");
    }

    @Test

    public void Test2() {


        driver.manage().window().fullscreen();
        Assert.assertFalse(driver.getTitle().contains("boss"));
        System.out.println("test Title Not Contain Boss Fullscreen running");


    }

    @After

    public void afterEverytest() {

        System.out.println("FINISHED");
        System.out.println("Test finished");
    }

        @AfterClass
        public static void afterClass() {
        driver.close();


        }


}
