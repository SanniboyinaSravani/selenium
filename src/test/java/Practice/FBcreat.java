package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBcreat {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//inspect username
		//driver.findElement(By.id("email")).sendKeys("sravani");
		//driver.findElement(By.id("pass")).sendKeys("srav2001");
		
		//create new account
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sravani");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sanniboyina");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8374960671");
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("31");
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Auguest");
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("2001");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		
	}

}
