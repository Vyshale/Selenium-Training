package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithRegistration 
{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Vyshale");
		driver.findElement(By.id("LastName")).sendKeys("Sureshbabu");
		driver.findElement(By.id("Email")).sendKeys("demo27@gmail.com");
		driver.findElement(By.xpath("//input[contains(text()='Password')]")).sendKeys("vyshu777");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("vyshu777");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[3]")).click();
		Thread.sleep(3000);
		driver.quit();
}

}
