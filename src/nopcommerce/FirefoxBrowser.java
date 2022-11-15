package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowser {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.ghecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //Launching the url
        driver.get(baseUrl);
        //Maximise the window
        driver.manage().window().maximize();
        //giving implicit wait time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the page
        System.out.println("Page Title: " + driver.getTitle());
        //Print the current url
        System.out.println("Current Url: " + driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page source: " + driver.getPageSource());

        //Finding the email field and inputting the email in the field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("testing123@gmail.com");

        //Finding the password field and inputting the password in the field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("password123");

        //closing the browser
       driver.quit();

    }

}
