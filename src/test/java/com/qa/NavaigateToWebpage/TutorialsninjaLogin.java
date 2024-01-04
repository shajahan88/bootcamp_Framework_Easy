package com.qa.NavaigateToWebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class TutorialsninjaLogin {
	
	@Test
	public void loginWithValidCredentials() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("testingid1980@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("testing1980");
		driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).submit();
		
		String actualEditAccountInfoLink = driver.findElement(By.linkText("Edit your account information")).getText();
		String expectededitAccountInfoLink = "Edit your account information";
		
		System.out.println(actualEditAccountInfoLink.equals(expectededitAccountInfoLink));
		
		driver.quit();
	}

}
