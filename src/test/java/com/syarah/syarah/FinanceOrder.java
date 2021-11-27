package com.syarah.syarah;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FinanceOrder extends Main {

	@Test
	public void finance_order () throws InterruptedException {
		
		 
		// scroll down to submit button 
		WebElement lastElement = 
				WD.findElement(By.xpath("//*[@id=\"online_finance_order_form\"]/div[2]/button"));
				int y = lastElement.getLocation().getY();
				JavascriptExecutor js = (JavascriptExecutor)WD;
				js.executeScript("window.scrollTo(0,"+y+")");
				Thread.sleep(1000);		
				WD.findElement(By.xpath("//*[@id=\"online_finance_order_form\"]/div[2]/button")).click();
				Thread.sleep(3000); 
		// scroll up to first elm. button			
				WebElement firstElement = 
						WD.findElement(By.xpath("//*[@id=\"onlinefinanceorder-applicant_name\"]"));
						int f = firstElement.getLocation().getY();
						JavascriptExecutor js2 = (JavascriptExecutor)WD;
						js2.executeScript("window.scrollTo(0,"+f+")");
						Thread.sleep(1000);

	WD.findElement(By.id("onlinefinanceorder-applicant_name")).sendKeys("zaid test"); 	
	Thread.sleep(1000);
	// select Random Gender
	Random rand = new Random();
	int s = rand.nextInt() % 2;	
	
	if (s == 1) {
		WD.findElement(By.xpath("//*[@id=\"onlinefinanceorder-gender\"]/div[1]")).click();
	    Thread.sleep(1000);

	}else {
		WD.findElement(By.xpath("//*[@id=\"onlinefinanceorder-gender\"]/div[2]")).click();
	    Thread.sleep(1000);

	}  	
  	     
  	int n = 10000 + new Random().nextInt(90000);
	
	// 2.The phone number must consist of 10 digits, start with 05 and it must be a valid number.
	WD.findElement(By.id("onlinefinanceorder-id_number")).sendKeys("323"); 
	WD.findElement(By.xpath("/html")).click();Thread.sleep(1000); 
	Assert.assertEquals("ID number should be 10 digits",WD.findElement(By.xpath("//*[@id=\"online_finance_order_form\"]/div[1]/div[3]/div/p")).getText());
	Thread.sleep(1000);
	WD.findElement(By.id("onlinefinanceorder-id_number")).clear(); 
	Thread.sleep(1000);
	WD.findElement(By.id("onlinefinanceorder-id_number")).sendKeys("12432"+n); 		
	Thread.sleep(2000);
	
	

	//3.The National ID must be 10 digits, begin with 1 or 2, and must be an integer number.
	WD.findElement(By.id("onlinefinanceorder-mobile_number")).sendKeys("05434"); 
	WD.findElement(By.xpath("/html")).click();Thread.sleep(1000);
	Assert.assertEquals("The mobile number must consist of ten digits, contain only numbers and start with 05",WD.findElement(By.xpath("//*[@id=\"online_finance_order_form\"]/div[1]/div[4]/div/p")).getText());
	Thread.sleep(1000);
	WD.findElement(By.id("onlinefinanceorder-mobile_number")).clear(); 
	Thread.sleep(1000);
	WD.findElement(By.id("onlinefinanceorder-mobile_number")).sendKeys("05434"+n); 
	Thread.sleep(1000);
	
	
	//adding the workplace and the name 
	WD.findElement(By.xpath("//*[@id=\"online_finance_order_form\"]/div[1]/div[5]/div/div")).click();
  	Thread.sleep(2000);
    WebElement dropdown =  WD.findElement(By.id("onlinefinanceorder-work_sector"));
    dropdown.sendKeys(Keys.ARROW_DOWN);
    dropdown.sendKeys(Keys.ENTER);
    Thread.sleep(2000);  

    WD.findElement(By.id("onlinefinanceorder-employer_name")).sendKeys("test1"); 
	Thread.sleep(1000); 
	
	 WebElement city =  WD.findElement(By.id("onlinefinanceorder-city_id"));
     city.sendKeys(Keys.ARROW_DOWN);
     city.sendKeys(Keys.ENTER);
     Thread.sleep(2000);   
     
     WebElement lastElement1 = 
				WD.findElement(By.xpath("//*[@id=\"online_finance_order_form\"]/div[2]/button"));
				int z = lastElement1.getLocation().getY();
				JavascriptExecutor js1 = (JavascriptExecutor)WD;
				js1.executeScript("window.scrollTo(0,"+z+")");
				Thread.sleep(1000);
		
		
				int salary = 1000 + new Random().nextInt(9000);
				WD.findElement(By.id("onlinefinanceorder-salary")).sendKeys(""+salary); 
		    	Thread.sleep(1000);
		

		    	
		        WebElement payment =  WD.findElement(By.id("onlinefinanceorder-salary_transfer_method"));
		        payment.sendKeys(Keys.ARROW_DOWN);
		        payment.sendKeys(Keys.ENTER);
		        Thread.sleep(2000);  
		        
  
		        
		        Random rand2 = new Random();
				int s1 = rand2.nextInt() % 2;	
				
				if (s1 == 1) {
					 WD.findElement(By.xpath("//*[@id=\"onlinefinanceorder-simah_issue\"]/div[2]")).click();
				      	Thread.sleep(2000);
				      	WD.findElement(By.xpath("//*[@id=\"onlinefinanceorder-traffic_fine\"]/div[1]")).click();
				      	Thread.sleep(2000);
			
				      	WD.findElement(By.id("onlinefinanceorder-traffic_fine_value")).sendKeys("2532"); 
				    	Thread.sleep(1000);
				    	
			
				   	 WD.findElement(By.xpath("//*[@id=\"onlinefinanceorder-realestate_loan\"]/div[2]")).click();
				      	Thread.sleep(2000);
			
				      	 WD.findElement(By.xpath("//*[@id=\"onlinefinanceorder-other_financial_liabilities\"]/div[1]")).click();
					      	Thread.sleep(2000);
				
					      	WD.findElement(By.id("onlinefinanceorder-total_financial_liabilities")).sendKeys("1522"); 
					    	Thread.sleep(1000);

				}else {
					
					 
						 WD.findElement(By.xpath("//*[@id=\"onlinefinanceorder-simah_issue\"]/div[1]")).click();
					      	Thread.sleep(2000);
					      	WD.findElement(By.xpath("//*[@id=\"onlinefinanceorder-traffic_fine\"]/div[2]")).click();
					      	Thread.sleep(2000);
				
				
					   	 WD.findElement(By.xpath("//*[@id=\"onlinefinanceorder-realestate_loan\"]/div[1]")).click();
					      	Thread.sleep(2000);
				
					      	 WD.findElement(By.xpath("//*[@id=\"onlinefinanceorder-other_financial_liabilities\"]/div[2]")).click();
						      	Thread.sleep(2000);
					
						      	
				}
		
	
			    	WD.findElement(By.xpath("//*[@id=\"online_finance_order_form\"]/div[2]/button")).click();
			    	Thread.sleep(3000);
					Boolean isPresent =	WD.findElements(By.xpath("//*[@id=\"accordion\"]")).size() != 0;
					if (isPresent ==false) {	
						System.out.println("Order Rejected");
					}
					else {
						System.out.println("Order Approved");
					}

	}
}
