package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test6 {

	public static void main(String[] args) {
//chrome browser
ChromeOptions options=new ChromeOptions();
options.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(options);


//firefoxBrowser
FirefoxOptions option=new FirefoxOptions();
option.addArguments("--disable-notifications");
WebDriver driver1=new FirefoxDriver(option);


driver.manage().window().maximize();
driver.get("https://www.olx.in/");



	}

}
