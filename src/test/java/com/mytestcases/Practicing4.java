package com.mytestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practicing4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJDIP\\eclipse-workspace\\Demoproject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.id("dropdown-class-example")).click();
		Select oSelect=new Select(driver.findElement(By.id("dropdown-class-example")));
		oSelect.selectByVisibleText("Option1");
		System.out.println("The Selected Text is"+oSelect.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		List <WebElement> op=oSelect.getOptions();
		for(WebElement x:op)
		{
			System.out.println(x.getText());
		}
		
		
		 
	}

}
