package Project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_ChromeBrowserTesting {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Launch Url
        driver.get(baseUrl);

        //Print the title of the page
        System.out.println("The title of the page: " + driver.getTitle());

        //Print the current Url
        System.out.println("The current Url is : " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("The page source is: " + driver.getPageSource());

        //Enter the email to email field
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("admin@gmail.com");

        //Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //Close the browser
      //  driver.quit();

    }
}
