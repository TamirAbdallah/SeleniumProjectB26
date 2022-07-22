package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {




    public static void main(String[] args) {         //   first step 1- main method

        WebDriverManager.chromedriver().setup();     //   second step after main method 2- setting up webdriver manager
                                                                // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();       // third step  3 - Create instance of WebDriver
        driver.manage().window().maximize(); // fours Step   34- make the page fullscreen


        driver.get("https://www.yahoo.com/");

        // actual title Comes from selenium
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title is Yahoo: " + actualTitle);



        // expectedTitle comes from requirements
        String expectedTitle = "Yahoo";

        if(actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification is passed!");
        } else{
            System.out.println("Title verification is failed!");


        }

        driver.quit();      // fifth step we have to do this step to close the page after the test

    }

}
