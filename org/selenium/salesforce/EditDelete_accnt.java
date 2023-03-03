package org.selenium.salesforce;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditDelete_accnt {
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role='combobox']//button")).click();
		System.out.println("New screen url =="+driver.getCurrentUrl());

		WebElement App=driver.findElement(By.xpath("//span/p[text()='Sales']"));
		driver.executeScript("arguments[0].click();",App);

		WebElement acc = driver.findElement(By.xpath("//a[@title='Accounts']"));
		driver.executeScript("arguments[0].click();",acc);

		WebElement deleteicon = driver.findElement(By.xpath("//a[contains(@class,'slds-button slds-button--icon-x-small')]"));
		driver.executeScript("arguments[0].click();",deleteicon);


		//Delete option-->cancel given
		driver.findElement(By.xpath("(//li[@class='uiMenuItem']//a)[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Cancel'])[2]")).click();
		//driver.findElement(By.xpath("//span[text()='Delete']")).click();
		String accnt_name = driver.findElement(By.xpath("//a[@data-refid='recordId']")).getText();
		String accnt_edited = driver.findElement(By.xpath("//a[@data-refid='recordId']")).getText();
        if(accnt_edited.contains(accnt_name)) {System.out.println(">>>Accnt is not deleted");
        System.out.println(">>>Account deletion is cancelled as per our code");}
        else {System.out.println(">>>accnt is deleted");}
		

		//Edit option-->Ownership given
		WebElement icon = driver.findElement(By.xpath("//a[contains(@class,'slds-button slds-button--icon-x-small')]"));
		driver.executeScript("arguments[0].click();",icon);

		WebElement edit = driver.findElement(By.xpath("//div[@title='Edit']"));
		driver.executeScript("arguments[0].click();",edit);

		String accntname = driver.findElement(By.xpath("//a[@data-refid='recordId']")).getText();
		System.out.println("bfr editing=="+ accntname);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Mathiedited");
		driver.findElement(By.xpath("//button[contains(@aria-label,'Ownership')]")).click();
		driver.findElement(By.xpath("//span[text()='Private']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		
		String accntedited = driver.findElement(By.xpath("//a[@data-refid='recordId']")).getText();
		System.out.println("aftr editing=="+ accntedited);
        if(accntedited.contains(accntname)) {System.out.println("----->Accnt is not edited");}
        else {System.out.println("----->accnt is not edited");}



	}}  
