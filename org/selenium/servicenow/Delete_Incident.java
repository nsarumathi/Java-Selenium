package org.selenium.servicenow;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.sukgu.Shadow;

public class Delete_Incident {
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
		dom.findElementByXPath("//input[@id='filter']").sendKeys("Incidents");
		dom2.findElementByXPath("//mark[@class='filter-match']").click();
		
		
		WebElement iframe = dom.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(iframe);
		
		WebElement incident1 = driver.findElement(By.xpath("//a[@class='linked formlink']"));
		String bfrid = incident1.getText();
	    System.out.println("ID bfr deletion =>"+ bfrid);

		incident1.click();
	    
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();

		WebElement incident = driver.findElement(By.xpath("//a[@class='linked formlink']"));
	    String aftrid = incident.getText();
	    System.out.println("ID aftr deletion =>"+ aftrid);
	    
	    if(bfrid.contains(aftrid)) {System.out.println(">>Incident is not deleted");}
	    else {System.out.println(">>Incident is deleted");}

		
		
}}

