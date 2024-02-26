package HomeWork.day02;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw7 {

    WebDriver driver;

    @Before

    public void beforeEachTest () {

        driver = new ChromeDriver();
        System.out.println("Test is running ....");
    }

    @After

    public void afterEverytest() {

        driver = new ChromeDriver();
        System.out.println("Test finished ...");
    }

    @Test

    public void Test1() {

        driver.get("https://www.youtube.com");
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);
        if (currentURL.contains("youtube"))
            System.out.println(" The url contains youtube : " + currentURL);
        else
            System.out.println("The url does not contains youtube :");

        System.out.println("Test 1 is executed ..");

    }

    @Test
    
    public void Test2() {
        driver.get("https://www.youtube.com");
        String Title = driver.getTitle();
        System.out.println("Title = " + Title);

        if (Title.contains("video"))
            System.out.println(" The title contain video : " + Title);
        else
            System.out.println("The title does not contain Video :  ");
        System.out.println("Test 2 is executed ..");
    }

    @Test

    public void Test3 () {

        driver.get("https://www.youtube.com");
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);
        if (url.contains("youtube"))
            System.out.println("url contains youtube ");
        else
            System.out.println("url does not contains youtube = " );

        System.out.println("Test 3 is executed ..");

    }

    @Test
    public void Test4 () {

        driver.get("https://www.youtube.com");
        String sourcePage = driver.getPageSource();
        System.out.println(" sourcePage = " + sourcePage);
        if (sourcePage.contains("youtube"))
            System.out.println(" The sourcePage contains youtube : " + sourcePage);
        else
            System.out.println("The sourcePage does not contains youtube :");

        System.out.println("Test 1 is executed ..");
        
    }



}
