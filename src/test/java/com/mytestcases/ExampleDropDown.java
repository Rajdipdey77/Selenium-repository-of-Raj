package com.mytestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExampleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJDIP\\eclipse-workspace\\Demoproject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Select obj1=new Select(driver.findElement(By.id("dropdown-class-example")));
		
		List<WebElement> lt=obj1.getOptions();
		for(WebElement op:lt)
		{
			System.out.println(op.getText());
		}
		//obj1.selectByVisibleText("Option1"); 
		
		obj1.selectByVisibleText("Option1");
		System.out.println("The select value is" + obj1.getFirstSelectedOption().getText());
		
		
	}

}
