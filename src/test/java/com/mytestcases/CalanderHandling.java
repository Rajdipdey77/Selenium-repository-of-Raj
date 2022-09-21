package com.mytestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJDIP\\eclipse-workspace\\Demoproject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div//span[text()='Departure']")).click();
		Thread.sleep(2000);
		for(int i=0;i<4;i++)
		{
		  driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		
		}
		Thread.sleep(2000);
		List <WebElement> cal =driver.findElements(By.cssSelector(".DayPicker-Day"));
		 
		 for(WebElement op:cal)
		 {
			
			 if(op.getText().equalsIgnoreCase("25"))
			 {
				 op.click();
				 break;
			 }
			 
		 }
		 
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		
	}

	}


