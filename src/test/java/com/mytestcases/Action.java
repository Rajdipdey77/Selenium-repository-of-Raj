package com.mytestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJDIP\\eclipse-workspace\\Demoproject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;// type casting
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement Element = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		Actions action = new Actions(driver); 
		WebElement live= driver.findElement(By.id("mousehover"));
		
		//Thread.sleep(4000);
		
		action.moveToElement(live).build().perform();
		driver.findElement(By.xpath("//a[text()='Top']")).click();
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement Elementse = driver.findElement(By.id("mousehover"));
		jse.executeScript("arguments[0].scrollIntoView();", Elementse);
		
		Actions action1 = new Actions(driver); 
		WebElement live1= driver.findElement(By.id("mousehover"));
		//Thread.sleep(4000);
		
		action1.moveToElement(live1).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Reload']")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
