package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPathByVisableText {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sravs1234");
		// TODO Auto-generated method stub
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sra1234");
	}


}
