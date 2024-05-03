package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabs {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
	}
	
	
	

}
