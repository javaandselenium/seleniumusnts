package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        
        //it is used to get the title from the application
        System.out.println(driver.getTitle());
        
        //it is used to get the url from the application
        System.out.println(driver.getCurrentUrl());
        
        
        driver.close();

	}

}
