package actions_Keyboardmose;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		/*driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		WebElement clickable = driver.findElement(By.xpath("//span[text()='Click']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		clickable.click();
		wait.until(ExpectedConditions.elementToBeClickable(clickable));
		
		WebElement check=driver.findElement(By.xpath("//span[text()='I am here']"));
		System.out.println(check.getText());
		
		WebElement click2 = driver.findElement(By.xpath("(//span[text()='Click'])[2]"));
		click2.click();
		WebElement invisible=driver.findElement(By.xpath("//span[text()='I am about to hide']"));
		System.out.println(invisible.getText());
		wait.until(ExpectedConditions.invisibilityOf(invisible));*/
		
		
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement window=driver.findElement(By.xpath("//span[text()='Open with delay']"));
		window.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		driver.close();
		
		
		
		
		
		
	}

}
