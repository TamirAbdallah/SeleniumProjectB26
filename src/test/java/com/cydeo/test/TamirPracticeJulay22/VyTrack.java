package com.cydeo.test.TamirPracticeJulay22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VyTrack {
    public static void main(String[] args) {

/*
//1- set up  chrome and creat Webdriver().setup().
//2- Navigate to    https://app.vytrack.com/user/login/
//3- Enter username provided “abcd”
//4- Enter password provided “abcd”
//5- Click on login button.
//6- Verify  message "Invalid username or password"
//7- Verify URL contains "VyTrack"
//8-click "forget Your Password?" link
//9-verify title is " Forgot Password "
    */
//1- set up  chrome and creat Webdriver().setup().
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//2- Navigate to    "https://app.vytrack.com/user/login"
        driver.get("https://app.vytrack.com/user/login");

//3- Enter username provided “abcd”
        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("abcd");

//4- Enter password provided “abcd”
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("abcd");

//5- Click on login button.
        WebElement loginBtn = driver.findElement(By.id("_submit"));
        loginBtn.click();

//6- Verify  message "Invalid username or password"
        WebElement alert = driver.findElement(By.className("alert"));
        if (alert.getText().equals("Invalid user name or password")) {
            System.out.println("Message is Passed");
        }else{
            System.out.println("Message is Failed");
        }
//7- Verify URL contains "VyTrack"
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains("vytrack")) {

        System.out.println("URL is Passed");
    }else {
            System.out.println("URL is Failed");
        }
//8-click "Forgot Your Password?" link
driver.findElement(By.partialLinkText("Forgot")).click();


//9-verify title is " Forgot Password "

if (driver.getTitle().equals("Forgot Password")) {
    System.out.println("Title is Correct");
}else {
    System.out.println("Title is Failed");

    }}}