package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// step:1 typcasting
		TakesScreenshot ts = (TakesScreenshot) driver;

		// step:2 access the method photo is taken and stored in RAM
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//step:3 location
		File dest=new File("./photo/amazon.png");
		
		//step:4 copy from RAM to location
		FileUtils.copyFile(src, dest);
		
		driver.close();

	}

}
