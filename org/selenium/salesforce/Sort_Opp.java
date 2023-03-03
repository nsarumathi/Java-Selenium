package org.selenium.salesforce;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sort_Opp {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get(" https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("saru.mathi@dell.com");
		driver.findElement(By.id("password")).sendKeys("Mathi@4321");
		driver.findElement(By.name("Login")).click();
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//div[@role='combobox']//button")).click();
	   System.out.println("New screen url =="+driver.getCurrentUrl());
		Thread.sleep(3000);
		
		WebElement App=driver.findElement(By.xpath("//span/p[text()='Sales']"));
		driver.executeScript("arguments[0].click();",App);
		WebElement Opp=driver.findElement(By.xpath("//a/span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();",Opp);
		
		driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button--reset')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search lists...']")).sendKeys("All Opportunities");
		driver.findElement(By.xpath("//mark[text()='All Opportunities']")).click();
		
		Thread.sleep(5000);
		File src1=driver.getScreenshotAs(OutputType.FILE);
		File dest1=new File(".//snap/assignment/bfrascendingorder.png");
		FileUtils.copyFile(src1, dest1);
		
		
		WebElement sort = driver.findElement(By.xpath("//a[@class='toggle slds-th__action slds-text-link--reset ']"));
		driver.executeScript("arguments[0].click();",sort);
		
		Thread.sleep(5000);
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//snap/assignment/ascendingorder.png");
		FileUtils.copyFile(src, dest);
		
	   }}  
