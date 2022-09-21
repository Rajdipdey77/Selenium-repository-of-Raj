package com.mytestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practicing3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJDIP\\eclipse-workspace\\Demoproject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		Actions action=new Actions(driver);
		WebElement language= driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
		action.moveToElement(language).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='বাংলা']")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//span[text()='English']")).click();
		
		

	}

}
