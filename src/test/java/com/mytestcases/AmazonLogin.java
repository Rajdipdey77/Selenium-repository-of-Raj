package com.mytestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJDIP\\eclipse-workspace\\Demoproject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Actions action=new Actions(driver);
		
		WebElement element=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		action.moveToElement(element).build().perform();
		//driver.findElement(By.xpath("//a[text()='Start here.']")).click();
//		WebElement headerdriver=driver.findElements(By.id("nav-al-container"));
//		headerdriver.findElements(By.xpath("//div[@class='nav-title']"));
	//	System.out.println( driver.findElements(By.xpath("//span[@class='nav-text']")).size());
		WebElement element2=driver.findElement(By.id("nav-al-container"));
		System.out.println(element2.findElements(By.tagName("a")).size());
		for(int i=1; i<element2.findElements(By.tagName("a")).size(); i++)
		{
			String clicking=Keys.chord(Keys.CONTROL,Keys.ENTER);
			element2.findElements(By.tagName("a")).get(i).sendKeys(clicking);
			Thread.sleep(4000);
			
		
		}
		
		
		
	}

}
