package Project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P3_FirefoxBrowserTesting {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //Launch driver
        driver.get(baseUrl);

        //Print the title of the page
        System.out.println("The title of the page: " + driver.getTitle());

        //Print the current Url
        System.out.println("Current Url is: " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("The page sourse is: " + driver.getPageSource());

        //Enter the email to email field
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("admin@gmail.com");

        //Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //Close the browser
        //driver.quit();

    }
}
