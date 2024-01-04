package com.qa.NavaigateToWebpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LandingPage {

	
	@Test
	public void navigateToWebpage() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		System.out.println(driver.getTitle());
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Your Store";
		
		if(driver.getTitle().equals(expectedTitle)) {
			System.out.println("Webpage title is correct");
		}else {
			System.out.println("Webpage title is incorrect");
		}
		
		driver.quit();
		
	}
}
