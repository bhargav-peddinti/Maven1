 package tool.maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maventest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("open ");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
			
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		
		System.out.println("middle ");
		
		Thread.sleep(3000);
		
		driver.get("https://www.youtube.com/");
		
		//driver.findElement(By.id("exec")).click();
		
		System.out.println("close ");
			
		driver.close();
		
		System.out.println("test");


	}

}
