package org.selenium.salesforce;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Create_Content {
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
	   driver.executeScript("arguments[0].value='Content';",all);
	   driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
	   
	   WebElement chatter = driver.findElement(By.xpath("//a[@title='Chatter']"));
	   driver.executeScript("arguments[0].click();",chatter);
	   driver.findElement(By.xpath("(//span[@class='title'])[3]")).click();
	   
	   WebElement qn = driver.findElement(By.xpath("//textarea[@role='textbox']"));
	   qn.sendKeys("How to post qns");
	   
	   WebElement details = driver.findElement(By.xpath("//div[contains(@class,'ql-editor ql-blank')]"));
	   details.sendKeys("give details abot it");
	   
	   driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button_brand')]")).click();
	   
	   List<WebElement> fulldetails = driver.findElements(By.xpath("//span[@class='uiOutputText']"));
	   System.out.println(">>Questioner details<<");
	   for(WebElement d2:fulldetails) {
		   String check=d2.getText();
		   System.out.println(check);}
	   
	   String Qn = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[3]")).getText();
	   if (Qn.contains("How to post qns")) {System.out.println(">>>>>>>>>>>>Check::question is succesfully is posted");}
	   else {System.out.println("question is not posted");  }
	   
	   
	   
	   /*  for(int i=1;i<=4;i++) {
		   String text = driver.findElements(By.xpath("//span[@class='uiOutputText']")).get(i).getText();
		   System.out.println(text);  }*/
	   
		
}}
