 package tool.maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maventest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("bhargav");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
			
		driver.get("https://www.google.com/");
			
		driver.close();


	}

}
