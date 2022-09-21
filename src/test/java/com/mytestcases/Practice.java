package com.mytestcases;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJDIP\\eclipse-workspace\\Demoproject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
        //driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
	    System.out.println(driver.findElement(By.xpath("//fieldset//input[@id='checkBoxOption3']")).isSelected());
	    driver.findElement(By.xpath("//fieldset//input[@id='checkBoxOption3']")).click();
	   System.out.println(driver.findElement(By.xpath("//fieldset//input[@id='checkBoxOption3']")).isSelected());         
	}
 }
