package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPathByContains {
	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("sra1234");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("srav4321");
		// TODO Auto-generated method stub

	}


}
