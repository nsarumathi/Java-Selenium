package org.selenium.servicenow;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class Create_Article {
	public static void main(String[] args) throws InterruptedException, IOException {
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
		WebElement article=dom.findElementByXPath("//input[@id='filter']");
		article.sendKeys("Knowledge");
		dom2.findElementByXPath("//mark[text()='Knowledge']").click();
		
		String bfr = driver.getTitle();
		System.out.println("Before creating article Title==" + bfr);
		
		WebElement iframe = dom2.findElementByXPath("////iframe[@title='Main Content']");
		driver.switchTo().frame(iframe);
		WebElement create=driver.findElement(By.xpath("//button[@type='button']"));
		driver.executeScript("arguments[0].click();", create);
		
		System.out.println("Before Title==" +driver.getTitle());
		driver.findElement(By.xpath("//button[@data-type='ac_reference_input']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(handles);
		driver.switchTo().window(list.get(1));
		System.out.println("After Knowledge base==" +driver.getTitle());
		driver.findElement(By.xpath("//table/tbody//tr/td[3]/a")).click();
		driver.switchTo().window(list.get(0));
		driver.switchTo().frame(iframe);
		WebElement catgry=driver.findElement(By.xpath("(//span[@class='input-group-btn']/button)[2]"));
		driver.executeScript("arguments[0].click();", catgry);
		driver.findElement(By.xpath("//div[@class='top column']/div[4]")).click();
		driver.findElement(By.xpath("//div[@class='column']/div[4]")).click();
		
		driver.findElement(By.id("ok_button")).click();
		WebElement description = driver.findElement(By.id("kb_knowledge.short_description"));
		description.sendKeys("Java is a Case-Sensitive lang");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		String aftr = driver.getTitle();
		System.out.println("After creating article Title==" + aftr);
		
		driver.switchTo().defaultContent();
		
	    dom.findElementByXPath("//div[text()='All']").click();
	    dom.findElementByXPath("//input[@id='filter']").clear();
		dom.findElementByXPath("//input[@id='filter']").sendKeys("Knowledge Articles");
		dom2.findElementByXPath("//mark[text()='Knowledge Articles']").click();
		

	    Thread.sleep(5000);
	    //take screenshot
	    File Source=driver.getScreenshotAs(OutputType.FILE);
	    File Dest=new File(".//screenshots/article.png");
	    FileUtils.copyFile(Source, Dest);
		
	}}
