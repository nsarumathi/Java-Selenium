package org.selenium.salesforce;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Create_accnt {
	public static void main(String[] args) throws InterruptedException {
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
		
		WebElement App=driver.findElement(By.xpath("//span/p[text()='Sales']"));
		driver.executeScript("arguments[0].click();",App);
		
		WebElement acc = driver.findElement(By.xpath("//a[@title='Accounts']"));
		driver.executeScript("arguments[0].click();",acc);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Mathi");
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String acctitle = driver.findElement(By.xpath("//lightning-formatted-text[@class='custom-truncate']")).getText();
		
		System.out.println("Accnt title is="+acctitle);
		if(acctitle.contains("Mathi")) {System.out.println("Accnt is created successfully");}
		   else {System.out.println("Accnt is not created");}
		
		String pageSource = driver.getPageSource();
		if(pageSource.contains("view")) {System.out.println("Accnt is created successfully");}
		   else {System.out.println("Accnt is not created");}
		
		
	   }}  
