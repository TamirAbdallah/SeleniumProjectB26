package com.cydeo.test.day13_configration_reader;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators66 {


        public static void main(String[] args) {

//1- set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();

//2- navigate to https://app.vytrack.com/user/login
            driver.get("https://app.vytrack.com/user/login");


// 3- Enter Username provided : "abcd"
            WebElement Username = driver.findElement(By.id("prependedInput"));
            Username.sendKeys("abcd");

// 4- Enter password provided : "abcd"
            WebElement password = driver.findElement(By.id("prependedInput2"));
            password.sendKeys("abcd");

// 5- Click on Login button
            WebElement LoginBtn = driver.findElement(By.id("_submit"));
            LoginBtn.click();


// 6- verify the message "Invalid username or password."
            WebElement alert = driver.findElement(By.className("alert"));

            if (alert.getText().equals("Invalid user name or password.")) {
                System.out.println("Message is Passed ");
            } else {
                System.out.println("Message is Failed ");
            }

// 7- Verify URL contains "vytrack"
            String actualURL = driver.getCurrentUrl();
            if (actualURL.contains("vytrack")) {
                System.out.println("URL is Passed");
            } else {
                System.out.println("URL is Failed");
            }

// 8- click "Forget your password? " link
            driver.findElement(By.partialLinkText("Forgot")).click();

// 9- verify title is "Forget Password"
            if (driver.getTitle().equals("Forget Password")) {
                System.out.println("Title is correct");
            } else {

                System.out.println("Title is not correct");
            }}}


