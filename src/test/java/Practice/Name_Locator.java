package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Name_Locator {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.instagram.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sravanis121");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("200131");
	}


}
