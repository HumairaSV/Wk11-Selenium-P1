package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Launching the url
        driver.get(baseUrl);
        //Maximise window
        driver.manage().window().maximize();
        //giving implicit wait time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Printing the page title
        System.out.println("Page title: "+ driver.getTitle());
        //Printing the current url
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //Printing the page source
        System.out.println("Page Source: " + driver.getPageSource());


        //Finding the email field and input email in the field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("test123@gmail.com");

        //Find the password field element and input the password
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("password123");

        //Close the browser
        driver.quit();
    }
}
