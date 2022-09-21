package com.mytestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderHandling2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJDIP\\eclipse-workspace\\Demoproject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
	     Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
        for(int i=0; i<3; i++)
        {
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
	     }
        List <WebElement> lt=driver.findElements(By.cssSelector(".DayPicker-Day"));
        for(WebElement op:lt)
        {
        	if(op.getText().equalsIgnoreCase("7")){
        		op.click();
        		break;
        		
        	}
        }
        driver.findElement(By.xpath("//span[text()='Done']")).click();
	}

}
