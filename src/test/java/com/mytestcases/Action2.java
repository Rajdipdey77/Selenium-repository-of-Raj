package com.mytestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJDIP\\eclipse-workspace\\Demoproject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;// type casting
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement element=driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		WebElement element1=driver.findElement(By.id("mousehover"));
		action.moveToElement(element1).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Top']")).click();
		//code to reload
		JavascriptExecutor js1 = (JavascriptExecutor) driver;// type casting
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement element2=driver.findElement(By.id("mousehover"));
		js1.executeScript("arguments[0].scrollIntoView();", element2);
		
		Actions action1=new Actions(driver);
		Thread.sleep(3000);
		WebElement element3=driver.findElement(By.id("mousehover"));
		action1.moveToElement(element3).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Reload']")).click();
		
		Thread.sleep(5000);
		driver.close();
		

	}

}
