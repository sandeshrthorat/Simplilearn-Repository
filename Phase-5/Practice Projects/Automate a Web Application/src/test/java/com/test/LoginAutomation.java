package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAutomation {
	@Test
	public void login() {
		System.getProperty("webdriver.chrome.driver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
		WebElement username = driver.findElement(By.id("user_email_login"));
		WebElement password = driver.findElement(By.id("user_password"));
		WebElement login = driver.findElement(By.name("commit"));
		username.sendKeys("prathmesh@gmail.com");
		password.sendKeys("12345678");
		login.click();
	}
}