package com.qa.NavaigateToWebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebpageNavigation {

	
	@Test
	public void webpageNavigation() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("Tablets")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt=\"HP Banner\"]")).isDisplayed());
		
		driver.quit();
	}
}
