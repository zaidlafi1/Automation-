package com.syarah.syarah;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Main {
	
	WebDriver WD;

	@BeforeMethod
	public void start() throws InterruptedException {
		
		     // **open the page **
		   String projectpath = System.getProperty("user.dir");
	       System.setProperty("webdriver.chrome.driver",  projectpath+"/Driver/chromedriver.exe" );
	       WD =new ChromeDriver();
	       WD.manage().window().maximize();
	         
	    	  WD.get("https://syarah.com/online/en/finance-order/form?title=%D9%84%D9%83%D8%B2%D8%B3%20ES%20350-CC%20Elite%202021%20%D9%86%D8%B5%20%D9%81%D9%84%20&post_id=71082");
	            Thread.sleep(1000);
	            
	}
	
	@AfterMethod
	public void end() {
		WD.quit();
	}
}

	


