package org.selenium.servicenow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class Caller {
	
	public static void main(String[] args) throws InterruptedException {
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
		WebElement caller=dom.findElementByXPath("//input[@id='filter']");
		caller.sendKeys("Callers");
		
		dom2.findElementByXPath("//mark[text()='Callers']").click();
		WebElement iframe = dom2.findElementByXPath("////iframe[@title='Main Content']");
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		WebElement firstname=driver.findElement(By.xpath("//input[@id='sys_user.first_name']"));
		firstname.sendKeys("Abin");
		String create=firstname.getAttribute("value");
		System.out.println("Name to create=="+ create);
		
		driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys(" Bhil");
		driver.findElement(By.xpath("//input[@id='sys_user.title']")).sendKeys("admin");
		driver.findElement(By.id("sys_user.mobile_phone")).sendKeys("044896712");
		driver.findElement(By.id("sys_user.phone")).sendKeys("954327180");
	    driver.findElement(By.id("sys_user.email")).sendKeys("abin@example.com");
	    
	    driver.findElement(By.xpath("//button[text()='Submit']")).click();
	    WebElement select=driver.findElement(By.xpath("//select[@role='listbox']"));
	    Select s=new Select(select);
	    s.selectByVisibleText("First name");
	    
	    driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("abin",Keys.ENTER);
	    String created = driver.findElement(By.xpath("//table//tr[1]/td[4]")).getText();
	    System.out.println("Name created=="+ created);
	    if(create.equals(created)) {
	    	System.out.println("New caller is sucessfully created");}
	    else {System.out.println("New caller is not created");}
	    
	}

}
