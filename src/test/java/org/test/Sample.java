package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement txtUser = driver.findElement(By.id("email"));
	txtUser.sendKeys("vidhya");
	
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys("12345");
	
	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
	
	driver.findElement(null)
}
}
