package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement ele = driver.findElement(By.id("MTR"));
		Select s=new Select(ele);
		s.selectByIndex(3);
		s.selectByValue("cup");
        s.selectByVisibleText("Coffee");	
        
        
        s.deselectByIndex(1);
        
        s.deselectByValue("cup");
       
        s.deselectByVisibleText("Coffee");
      
        
        driver.close();
		

	}

}
