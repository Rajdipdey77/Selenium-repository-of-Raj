package com.mytestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJDIP\\eclipse-workspace\\Demoproject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Select obj=new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		List<WebElement>lest=obj.getOptions();
		for(WebElement op:lest)
		{
			System.out.println(op.getText());
		}
		
		obj.selectByVisibleText("Option3");
		System.out.println("The sylect value is"+obj.getFirstSelectedOption().getText());
		//obj.selectByIndex(2);
		//Thread.sleep(4000);
		//obj.selectByValue("2");
		
		
		

	}

}
