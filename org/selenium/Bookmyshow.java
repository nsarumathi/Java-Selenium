package org.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bookmyshow {
public static void main(String[] args) throws IOException, InterruptedException {

	Date now=new Date();
	String date=now.toString().replace(" ", "-").replace(":","-")+".png";
	System.out.println(date);
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://in.bookmyshow.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	driver.findElement(By.xpath("//ul//span[text()='Chennai']")).click();
	String currenturl=driver.getCurrentUrl();
	System.out.println("Current Url=="+currenturl);
	if(currenturl.contains("chennai")) {
		System.out.println("Url is loaded with Chennai is confirmed");}
	else{System.out.println("Url is not loaded with Chennai");}
	
	WebElement Search=driver.findElement(By.xpath("//span[contains(text(),'Search for Movies')]/parent::div"));
	driver.executeScript("arguments[0].click();", Search);
	
    driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Movies')]")).sendKeys("Baba");
    driver.findElement(By.xpath("//ul//span[text()=' (Tamil)']")).click();
    driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
    WebElement theatre=driver.findElement(By.xpath("(//a[@class='__venue-name'])"));
    System.out.println("theatre displayed in first=="+theatre.getText());
    driver.findElement(By.xpath("//div[text()='INFO']")).click();
    WebElement info = driver.findElement(By.xpath("//div[contains(text(),'Parking Facility')]"));
    System.out.println("Availability=="+info.getText());
    
    driver.findElement(By.xpath("//div[@class='cross-container']")).click();
    driver.findElement(By.xpath("//div[@class='showtime-pill-container _available']")).click();
    driver.findElement(By.xpath("//div[text()='Accept']")).click();
    driver.findElement(By.xpath("//li[@id='pop_1']")).click();
    driver.findElement(By.xpath("//div[contains(text(),'Select Seats')]")).click();
    driver.findElement(By.xpath("(//div/a[@class='_available'])[10]")).click();
    driver.findElement(By.xpath("//a[text()='Pay ']")).click();
    
    Thread.sleep(2000);
    WebElement total = driver.findElement(By.xpath("//div//span[@id='subTT']"));
    String sub=total.getText();
    sub.replace("[Rs..]", " ");
    System.out.println("total price=="+ sub );
   System.out.println("Url="+driver.getCurrentUrl());
    
    Thread.sleep(2000);
    //take screenshot
    File Source=driver.getScreenshotAs(OutputType.FILE);
    File Dest=new File(".//screenshots/seatlayout"+date);
    FileUtils.copyFile(Source, Dest);

}
}
