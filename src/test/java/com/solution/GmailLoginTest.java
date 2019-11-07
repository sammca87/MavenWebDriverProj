package com.solution;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailLoginTest extends Base{
	
	@Test
	public void loginTest() {
		
		//driver.findElement(By.xpath("")).click();
		
		String expected = "Wrong password. Try again or click Forgot password to reset it.";
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sammca87" + Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sdfsdf2342" + Keys.ENTER);
		
		String actual = driver.findElement(By.xpath("//span[contains(text(),'Wrong password. Try again or click Forgot password')]")).getText();
		
		Assert.assertEquals(actual, expected);
		
	}

}
