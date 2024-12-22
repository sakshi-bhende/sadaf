package com.cdac.acts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	WebDriver driver;
	@BeforeTest
    public void profileSetup()
    {	
		 driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/search");
        driver.manage().window().maximize();
        
        
    }
	@Test
    public void textBoxTest1() throws InterruptedException
    {
		driver.get("https://testpages.eviltester.com/styled/search");
		 driver.findElement(By.xpath("//input[@name='q']")).clear();
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium-RC");
		
	     driver.findElement(By.xpath("//input[@name='q']")).submit();
	     String firstResultText = driver.findElement(By.cssSelector("#resultList li.resultlistitem a")).getText();
	        System.out.println("First result: " + firstResultText);  

	        
	        if (firstResultText.contains("seleniumhq.org")) {
	            System.out.println("Test Passed: First result matches 'seleniumhq.org'");
	        } else {
	            System.out.println("Test Failed: First result does not match 'seleniumhq.org'");
	        }

	        assert firstResultText.contains("seleniumhq.org") : "First result is incorrect!";
	        
	   

    }
	 @AfterTest
	    public void tearDown() {
	       
	        if (driver != null) {
	            driver.quit();
	        }
	    }
}
