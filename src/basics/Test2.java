package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();

//get is the method which is used to eneter the url 
//and waits till application is loaded
driver.get("https://www.facebook.com/");

	}

}
