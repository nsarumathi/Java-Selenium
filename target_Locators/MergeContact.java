package target_Locators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		WebElement from=driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::a"));
		from.click();
		Set<String> a=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(a);
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		driver.switchTo().window(list.get(0));
		
		Thread.sleep(2000);
		WebElement to=driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[2]"));
		to.click();
		Set<String> b=driver.getWindowHandles();
		List<String> list1=new ArrayList<String>(b);
		driver.switchTo().window(list1.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[9]")).click();
		driver.switchTo().window(list.get(0));
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println("alert text=="+ alert.getText());
		alert.accept();
		
		System.out.println("Title==="+driver.getTitle());
		
	}

}
