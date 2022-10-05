package automated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver","E:\\chrome connector/chromedriver.exe");
		String driverPath="E:\\chrome connector/chromedriver.exe";
		WebDriver driver ;
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Saksham@123");
		driver.findElement(By.id("pass")).sendKeys("hello@123");
		driver.findElement(By.name("login")).click();
		 
		
	

	}
	


}
