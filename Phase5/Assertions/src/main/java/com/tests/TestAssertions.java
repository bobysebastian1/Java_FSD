package com.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertions {

		    SoftAssert soft = new SoftAssert();
		    WebDriver driver;
		
		    @Test
		    public void Launch() {
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        try {
		            Thread.sleep(3000);
		        } 
		        catch (Exception e) {
		            e.printStackTrace();
		        }
		    }

		    @Test(dependsOnMethods = { "Launch" })
		    public void Facebook() {
		        driver.get("https://www.facebook.com");
		        System.out.println(driver.getTitle());
		        soft.assertEquals("FB Title", driver.getTitle());
		        soft.assertAll();
		        try {
		            Thread.sleep(2000);
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		    
		   
		    
		    @Test(dependsOnMethods = { "Launch" })
			public void Check() {
			        driver.get("https://www.bharatbenz.com");
			        System.out.println(driver.getTitle());
			        soft.assertEquals("BharatBenz", driver.getTitle()); 
			        soft.assertAll();
			        try {
			            Thread.sleep(2000);
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
			        driver.quit();
			}
		    
		    
	

}
