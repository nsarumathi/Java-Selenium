package org.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver( options);
		driver.get("https://www.redbus.in");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("src")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div//li[@class='selected']")).click();
		
		driver.findElement(By.id("dest")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//div//li[@class='selected']")).click();
		
		driver.findElement(By.xpath("(//input[@class='db'])[3]")).click();
		driver.findElement(By.xpath("//div//td[@class='wd day'][1]")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		
		WebElement NoofBuses=driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
		System.out.println("No of Buses==="+NoofBuses.getText());
		
		Thread.sleep(2000);
		WebElement Checkbox = driver.findElement(By.xpath("//li/label[@title='SLEEPER']"));
		driver.executeScript("arguments[0].scrollIntoView();",Checkbox);
		Checkbox.click();
		System.out.println("No of  Sleeper Buses==="+NoofBuses.getText());
		
		WebElement Bustitle = driver.findElement(By.xpath("(//div[contains(@class,'travels')])[2]"));
		System.out.println("Second Bus title=="+Bustitle.getText());
		
		Thread.sleep(2000);
		WebElement seats=driver.findElement(By.xpath("(//div[text()='View Seats'])[2]"));
		driver.executeScript("arguments[0].click();",seats);
	
	}

}
