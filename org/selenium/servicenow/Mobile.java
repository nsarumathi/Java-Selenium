package org.selenium.servicenow;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class Mobile {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://dev37469.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("ZffB4^Q/2Opz");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		
		Shadow dom=new Shadow(driver); 
		dom.setImplicitWait(40);
		dom.findElementByXPath("//div[text()='All']").click();
	
		Shadow dom2=new Shadow(driver); 
		dom2.setImplicitWait(10);
		dom.findElementByXPath("//input[@id='filter']").sendKeys("Service catalog");
		dom2.findElementByXPath("//mark[@class='filter-match']").click();
		
		WebElement iframe = dom.findElementByXPath("////iframe[@title='Main Content']");
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
		driver.findElement(By.xpath("//table[@role='presentation']//div/a")).click();
		driver.findElement(By.xpath("((//td[@class='iotd'])[4]//label)[2]")).click();
		driver.findElement(By.xpath("((//td[@class='iotd'])[5]//label)[3]")).click();
		
		driver.findElement(By.xpath("(//div[@class='sc-radio']//label)[2]")).click();
		WebElement allowance = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select s=new Select(allowance);
		s.selectByValue("Unlimited");
		
		driver.findElement(By.id("oi_order_now_button")).click();
		
		String title=driver.getTitle();
		System.out.println("Title="+title);
		
		 Thread.sleep(5000);
		    //take screenshot
		    File Source=driver.getScreenshotAs(OutputType.FILE);
		    File Dest=new File(".//screenshots/mobile.png");
		    FileUtils.copyFile(Source, Dest);
			
}}


/*
4. Click on  mobiles
5.Select Apple iphone6s
6.Update color field to rose gold and storage field to 128GB
7.Select  Order now option
8.Verify order is placed and copy the request number"*/
