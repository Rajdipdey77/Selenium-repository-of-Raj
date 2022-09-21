package com.mytestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJDIP\\eclipse-workspace\\Demoproject\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
    driver.manage().window().maximize();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    System.out.println( driver.findElements(By.tagName("a")).size());
   
    WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
    System.out.println(footerdriver.findElements(By.tagName("a")).size());
    
   WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
   System.out.println(columndriver.findElements(By.tagName("a")).size());
   
   for(int i=1; i<columndriver.findElements(By.tagName("a")).size(); i++)
   {
	   String clickonlinks=Keys.chord(Keys.CONTROL,Keys.ENTER);
	   columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinks);
	   Thread.sleep(4000);
   }
   
   
	}

}
