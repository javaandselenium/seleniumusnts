package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.id("username"));
		if(username.isDisplayed()) {
			System.out.println("pass:elemet is dispalyed");
			username.sendKeys("qwewrtryui");
		}
		else
		{
			System.out.println("Fail:element is not dispalyed");
		}
		
		Thread.sleep(5000);
		driver.close();

	}

}
