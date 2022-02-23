package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
	driver.findElement(By.name("username")).sendKeys("qwerty");	
	driver.findElement(By.name("password")).sendKeys("2435dsetr");
	driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[2]")).click();

	String title = driver.getTitle();
System.out.println(title);
System.out.println(driver.getCurrentUrl());

if(title.equals("Instagram")) {
	System.out.println("Pass:home page is dispalyed");
}
else
{
	System.out.println("Fail:home page is not dispalyed");
}

driver.close();

	}

}
