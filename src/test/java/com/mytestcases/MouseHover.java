package com.mytestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJDIP\\eclipse-workspace\\Demoproject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(4000);
		WebElement element=driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView();",element);
		
		Thread.sleep(4000);
		Actions action=new Actions(driver);
		WebElement element1=driver.findElement(By.id("mousehover"));	
		action.moveToElement(element1).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Top']")).click();
		
		Thread.sleep(4000);
		JavascriptExecutor jsa=(JavascriptExecutor) driver;//typecasting
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(4000);
		WebElement element2=driver.findElement(By.id("mousehover"));
		jsa.executeScript("arguments[0].scrollIntoView();",element2 );
		
		Thread.sleep(4000);
		Actions action1=new Actions(driver);
	    WebElement element3=driver.findElement(By.id("mousehover"));
	    action1.moveToElement(element3).build().perform();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//a[text()='Reload']")).click();
	    
	    
	    Thread.sleep(5000);
		driver.close();		
		
	
	}	

}
