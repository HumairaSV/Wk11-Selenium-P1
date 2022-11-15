package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser = "Edge";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {

        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.ghecko.driver", "drivers/geckodriver.exe");
        }else {
            System.out.println("Incorrect browser name-Select from Chrome or Edge or Firefox");
        }
        //Launch the url in selected browser
        driver.get(baseUrl);
        //maximise window
        driver.manage().window().maximize();
        //giving implicit wait time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print title of the page
        System.out.println("Page Title is: " + driver.getTitle());
        //Print the current url
        System.out.println("Current url is: " + driver.getCurrentUrl());
        //print the page source
        System.out.println("Page source is: " + driver.getPageSource());

        //Finding the email field and inputting the email in the field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("testing123@gmail.com");

        //Finding the password field and inputting the password in the field
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("password123");

        //closing the browser
        driver.quit();

    }

}
