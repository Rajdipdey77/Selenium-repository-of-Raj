package com.mytestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJDIP\\eclipse-workspace\\Demoproject\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://support.oracle.com/portal/");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("");
	//driver.findElement(By.id("sso_username")).sendKeys("rajdipdey77@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
	}
public void test()
{
	System.out.println("simple program");
}
}
