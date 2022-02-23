package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));	
	
	WebElement username = driver.findElement(By.name("username"));
	wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("admin");
	
	
	driver.findElement(By.name("password")).sendKeys("2435dsetr");
	
	
	WebElement button = driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[2]"));
wait.until(ExpectedConditions.elementToBeClickable(button)).click();
	
	
	String title = driver.getTitle();
System.out.println(title);
System.out.println(driver.getCurrentUrl());

	}

}