package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StaleElementException {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
	WebElement	UN = driver.findElement(By.xpath("//input[@id='email']"));
	//refresh the page
	driver.navigate().refresh();
	//sendkeys 
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("srav");
		
	

	}


}
