package com.cydeo.test.Practice;

//import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextBase_M {
    public static void main(String[] args) {


       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       //  1- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

       //  2- Verify “Log in” button text is as expected:
        WebElement Login = driver.findElement(By.name("Login"));

      //  3- Enter incorrect password: “incorrect”
        WebElement password = driver.findElement(By.name("PASSWORD"));

        // 4- enter  Wrong Password
        password.sendKeys("incorrect");


        // 5- Click to login button.
        WebElement loginBtn = driver.findElement(By.name("login-btn"));
        loginBtn.click();





    }
    public static void login(String username , String password){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    //  1- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

    //  2- Verify “Log in” button text is as expected:
    WebElement Login = driver.findElement(By.name("Login"));

    //  3- Enter incorrect password: “incorrect”
    WebElement Password = driver.findElement(By.name("PASSWORD"));

}}
