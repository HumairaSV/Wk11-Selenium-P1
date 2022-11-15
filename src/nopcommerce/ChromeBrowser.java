package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class ChromeBrowser {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        //creating object for the Chrome browser
        WebDriver driver = new EdgeDriver();

        //Launching the url
        driver.get(baseUrl);
        //Maximise the browser window
        driver.manage().window().maximize();
        //giving implicit wait time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //get the title of the page
        String pageTitle= driver.getTitle();
        //print page title
        System.out.println("Title of the page is: " + pageTitle);
        //Print the current url
        System.out.println("Current Url is: " + driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page source: " + driver.getPageSource());

        //Find the email field element and input the email
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("test123@gmail.com");

        //Find the password field element and input the password
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("password123");

        //Close the browser
        driver.quit();

    }

}
