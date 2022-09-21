package com.mytestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJDIP\\eclipse-workspace\\Demoproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       // driver.findElement(By.xpath("//input[@value='radio1']")).click();
        //System.out.println(driver.findElement(By.xpath("//fieldset//input[@value='radio2']")).isSelected());
        //driver.findElement(By.xpath("//fieldset//input[@value='radio2']")).click();
        System.out.println(driver.findElement(By.xpath("//fieldset//input[@value='radio2']")).isSelected());//assertion 
        List<WebElement> options= driver.findElements(By.xpath("//fieldset//input[@class='radioButton']"));
        for(WebElement a:options)
        {
        
       
		a.click();
		}
       
        		
        	
        }

}
