package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // some common methods in selenium :-

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        System.out.println(driver.getTitle());
        System.out.println("************************************************");
        System.out.println(driver.getPageSource());
        System.out.println("************************************************");
        System.out.println(driver.getCurrentUrl());
        System.out.println("hiii");
        System.out.println("hello");

        //driver.navigate().to("http://www.facebook.com");
       // driver.navigate().forward();
       // driver.navigate().back();

        Thread.sleep(3000);
        driver.close();
    }
}
