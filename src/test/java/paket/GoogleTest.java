package paket;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleTest {
    public static void main(String[] args) {
        Logger logger= Logger.getLogger("Google");
        PropertyConfigurator.configure("log4j.properties");

        WebDriver driver = new ChromeDriver();
        logger.info("Browser Opened");


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("Implicit wait given");



        driver.get("https://www.google.com/");
        logger.info("Url opened");



        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("q")).submit();
        logger.info("keyword type");

        driver.quit();

    }
}
