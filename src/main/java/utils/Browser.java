package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Browser {

    public static WebDriver driver;

    /**
     * Sets the Browser up, then maximizes the window and sets an implicit wait.
     */
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    /**
     * Quits the Browser
     */
    public static void quit() {
        driver.quit();
    }
}
