package com.solution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	
	@BeforeSuite
	public void setUp() {
		
		if(driver == null) {
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
			driver.get("https://www.gmail.com");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			wait = new WebDriverWait(driver, 20);
			
		}
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}

}
