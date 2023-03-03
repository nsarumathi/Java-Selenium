package org.selenium.salesforce;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Create_Individual {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("saru.mathi@dell.com");
		driver.findElement(By.id("password")).sendKeys("Mathi@4321");
		driver.findElement(By.name("Login")).click();
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//div[@role='combobox']//button")).click();
	   System.out.println("New screen url =="+driver.getCurrentUrl());
		Thread.sleep(3000);
		
	   WebElement all = driver.findElement(By.xpath("//input[@class='slds-input']"));
	   driver.executeScript("arguments[0].value='individual';",all);
	   driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
	   
	   driver.findElement(By.xpath("//div[@title='New']")).click();
	   driver.findElement(By.xpath("//div[@class='uiPopupTrigger']")).click();
	   driver.findElement(By.xpath("(//a[@role='menuitemradio'])[3]")).click();
	   
	   driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mathi");
	   driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	   
	   String title = driver.findElement(By.xpath("//span[@class='uiOutputText']")).getText();
	   System.out.println("individ title="+title);
	   if(title.contains("Mathi")) {System.out.println("Individual is created successfully");}
	   else {System.out.println("Individual is not created");}
	   }
	   
		
	   }
