package com.cydeo.test.Practice;
/*
- set up chrome and create webdriver instance
1- navigate to goole.com
2- Search for Sydeo
3- verify Cydeo is appeared in the results
close the browser

 */
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TamirPractice {
    public static void login(String username , String password){
 //1- navigate to goole.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();




}}
