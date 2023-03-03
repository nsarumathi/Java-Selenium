package org.selenium.servicenow;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.sukgu.Shadow;

public class Delete_MobileOrder {
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
		
		driver.findElement(By.xpath("(//table[@role='presentation']//div/a)[5]")).click();
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		
		List<WebElement> labels = driver.findElements(By.xpath("//div[@class='order_summary']//dt"));
		System.out.println("<<Order details>>>");
		for(WebElement label: labels) {
			String details=label.getText();
			System.out.println( details);}
		
		List<WebElement> infos = driver.findElements(By.xpath("//div[@class='order_summary']//dd"));
		System.out.println("<<Order details>>>");
		for(WebElement info: infos) {
			String details=info.getText();
			System.out.println( details);}
		

		boolean reqno = driver.findElement(By.xpath("//a[@class='linked requestItemUrl']")).isDisplayed();
		if(reqno) {System.out.println("order is placed");}
		else {System.out.println("order is not placed");}
		
		driver.findElement(By.xpath("//a[@class='linked requestItemUrl']")).click();
		driver.findElement(By.xpath("//button[@id='sysverb_delete']")).click();
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();
		driver.findElement(By.xpath("//button[@id='cancel_button']")).click();
		
		String status = driver.findElement(By.xpath("//div[@class='notification notification-warning']")).getText();
		System.out.println("order status==>"+status);
		
		 Thread.sleep(5000);
		    //take screenshot
		    File Source=driver.getScreenshotAs(OutputType.FILE);
		    File Dest=new File(".//screenshots/deletemobileorder.png");
		    FileUtils.copyFile(Source, Dest);
			
}}

