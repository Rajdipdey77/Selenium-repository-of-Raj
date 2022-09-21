package com.mytestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practicing5 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJDIP\\eclipse-workspace\\Demoproject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    Select obj=new Select(driver.findElement(By.id("dropdown-class-example")));
	    List<WebElement> element=obj.getOptions();
	    for(WebElement op:element)
	    {
	    	System.out.println(op.getText());
	    }
	  	obj.selectByVisibleText("Option1");
	  	System.out.println("The selected value is"+ obj.getFirstSelectedOption().getText());
				
		
				
	}
	
}
