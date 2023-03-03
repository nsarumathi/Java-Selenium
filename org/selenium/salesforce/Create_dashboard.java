package org.selenium.salesforce;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Create_dashboard {
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
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
	   System.out.println("New screen url =="+driver.getCurrentUrl());
	   
	   WebElement App=driver.findElement(By.xpath("//span/p[text()='Sales']"));
		driver.executeScript("arguments[0].click();",App);
		
		WebElement dashboard= driver.findElement(By.xpath("//span[text()='Dashboards']"));
		driver.executeScript("arguments[0].click();",dashboard);

		
		driver.findElement(By.xpath("//div[@title='New Dashboard']")).click();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		driver.switchTo().frame(frame);
		
		WebElement name = driver.findElement(By.xpath("//input[@id='dashboardNameInput']"));
		name.sendKeys("Salesforce Automation by Saru");
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@class='slds-button doneEditing']")).click();
		
     	 String title = driver.findElement(By.xpath("//span[@class='slds-page-header__title slds-truncate']")).getText();
		 System.out.println("Dasboard title="+ title);

		if(title.contains("Salesforce Automation by Saru")) {System.out.println("Dashboard is created successfully");}
		   else {System.out.println("Dashboard is not created");}
	   }}  
