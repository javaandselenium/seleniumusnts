package navigationApi;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.navigate().to("https://www.facebook.com/");
//back
driver.navigate().back();
Thread.sleep(3000);

//forword
driver.navigate().forward();
Thread.sleep(3000);

//refresh
driver.navigate().refresh();
Thread.sleep(3000);

driver.close();

	}

}
