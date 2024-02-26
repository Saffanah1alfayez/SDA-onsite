package HomeWork.day03;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 {

   /* Go to https://id.heroku.com/login.
    Enter an e-mail address.
    Enter a password.
    Click on the Login button.
    There was a problem with your login.
    If text is visible, print "Registration Failed".
    If the text is not visible, print "Registered".
    Close all pages. */

    @Test
    public void test1 () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://id.heroku.com/login");

    }

}
