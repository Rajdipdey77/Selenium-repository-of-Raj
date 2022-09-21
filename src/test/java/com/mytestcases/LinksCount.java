package com.mytestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJDIP\\eclipse-workspace\\Demoproject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
System.out.println(driver.findElements(By.tagName("a")).size());// whole page link count
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));// reached footer section and identify the links count on footer
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(4000);
		}
	}

}

