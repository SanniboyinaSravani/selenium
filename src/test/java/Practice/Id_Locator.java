package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Id_Locator {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sravani.s");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sravanai1234");
			// TODO Auto-generated method stub

		}


}
