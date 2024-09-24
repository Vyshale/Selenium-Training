package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithBrowser {

	public static void main(String[] args) throws InterruptedException {
  
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
		
		driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
