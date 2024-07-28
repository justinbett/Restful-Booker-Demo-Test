package org.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebDriverInstance {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if(driver.get() == null) {
            try {
                driver.set(createDriver());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return driver.get();
    }

    public static WebDriver createDriver() throws IOException {
        WebDriver driver = null;
        Properties prop = new Properties();
        FileInputStream data = new FileInputStream(
                System.getProperty("user.dir") + "//src//main//java//org//example//resources//config.properties");
        prop.load(data);

        if(prop.getProperty("browser").equals("chrome")) {
            System.getProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") + "//drivers//chromedriver");
            driver = new ChromeDriver();
        }

        assert driver != null;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }

    public static void cleanupDriver() {
        driver.get().quit();
        driver.remove();
    }

}
