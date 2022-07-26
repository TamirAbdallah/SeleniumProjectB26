package com.cydeo.test.day10_utilities_windows;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class T3_Windows_Handle extends TestBase {

 @Test
 public void windowHandletest() {
  /*
1. Open a chrome browser
2. Go to : https://practice.cydeo.com/windows
3. Assert: Title is “Windows”
4. Click to: “Click Here” link
5. Switch to new Window.
6. Assert: Title is “New Window”
   */

//     2. Go to : https://practice.cydeo.com/windows
  driver.get("https://practice.cydeo.com/windows");

//     3. Assert: Title is “Windows”
  String actualTitle = driver.getTitle();
  String expectingTitle = "Windows";
  Assert.assertEquals(actualTitle, expectingTitle, "Main widow title verification failed");

//     4. Click to: “Click Here” link
  WebElement clickHerLink = driver.findElement(By.linkText("Click Here"));
  clickHerLink.click();

//     5. Switch to new Window.
  Set<String> allWindowHandles = driver.getWindowHandles();

  for (String each : allWindowHandles) {
   driver.switchTo().window(each);
   // window handle1 - main window
   // window handle2 - 2nd window
   System.out.println("driver.getTitle() = " + driver.getTitle());
  }

//     6. Assert: Title is “New Window”
String  expectTitleAfterClicking = "New Window";
actualTitle = driver.getTitle();
Assert.assertEquals(actualTitle, expectTitleAfterClicking, "New widow title verification failed");



 }
}
