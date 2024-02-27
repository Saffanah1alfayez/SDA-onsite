package day05;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01ChromeOptions {

    /*
         ChromeOptions Class

        It is a concept used in Selenium WebDriver to modify various properties of the Chrome driver.
        start-maximized: Opens Chrome in maximize mode.
        incognito: Opens Chrome in incognito mode.
        headless: Runs Chrome in headless mode (without displaying).
        disable-extensions: Disables existing extensions in the Chrome browser.
        disable-popup-blocking: Disables pop-up blocking in the Chrome browser.
        make-default-browser: Sets Chrome as the default browser.
        version: Prints the Chrome browser version.
        disable-infobars: Prevents Chrome from displaying the "Chrome is being controlled by automated software" notification.
        */
    static WebDriver driver;

    @Test
    public void test() {

        //change sitting of chrome if it is needede

        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        option.addArguments("incognito");
        option.addArguments("--lang='en'"); //check , to set the language of the browser to English.
        option.addArguments("--lang=en"); // i think this is coorect way
        option.addArguments("headless");
        option.addArguments(" disable-popup-blocking");
        option.addArguments("disable-infobars");

        //*[@id='checkboxes']/input[1]
        //input[@type='checkbox'][1] two ways to write checkbox



        driver = new ChromeDriver(option);
        driver.get("https://google.com");

    }

    @AfterClass
    public static void tearDown(){
        //driver.close();
        //driver.quit();
    }
}

