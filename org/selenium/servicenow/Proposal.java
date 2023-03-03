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
import io.github.sukgu.Shadow;

public class Proposal {
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
		dom.setImplicitWait(30);
		
		WebElement all=dom.findElementByXPath("//div[text()='All']");
        all.click();
	
		Shadow dom2=new Shadow(driver); 
		dom2.setImplicitWait(10);
		dom.findElementByXPath("//input[@id='filter']").sendKeys("My Proposal");
		dom2.findElementByXPath("//mark[@class='filter-match']").click();
		
		WebElement iframe = dom.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(iframe);
		WebElement create=driver.findElement(By.xpath("//button[text()='New']"));
		driver.executeScript("arguments[0].click();", create);
		
		WebElement template = driver.findElement(By.xpath("//input[@aria-label='Template description']"));
		template.sendKeys("Sample");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		 Thread.sleep(5000);
		    //take screenshot
		    File Source=driver.getScreenshotAs(OutputType.FILE);
		    File Dest=new File(".//screenshots/proposal.png");
		    FileUtils.copyFile(Source, Dest);
			
}}

