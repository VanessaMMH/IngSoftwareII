package com.percentage.calculator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverdemo {

	private WebDriver driver;
	
	@Before
	public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net");
		driver.manage().window().maximize();			 
	}
	
	
	@Test
	public void testGoogleTitle() {
		// Use assert to verify Title
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science");
		assertNotNull(verifyTitle);
		assertTrue(verifyTitle);		
	}
	

	@Test
	public void testGoogleOperations() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  // Click on Math Calculators
	      driver.findElement(By.xpath("//*[@id=\"contentout\"]/table/tbody/tr/td[3]/div[2]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 100 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("100");	      
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();	
	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
	      
	      // Verify the result  
	      String ExpectedResult = "10";
	      Assert.assertEquals(ExpectedResult, result);	 
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/span[3]/a")).click();
	      
	      // Enter value 30 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 100 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("-100");	      
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();	
	      
	      // Get the Result Text based on its xpath
	      String result_ =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
	      
	      // Verify the result  
	      String ExpectedResult_ = "-10";
	      Assert.assertEquals(ExpectedResult_, result_);	
	      
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}
}