
package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUPS {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("srav31");
		
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(5000);
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//Alert alt = driver.switchTo().alert();
	//	alt.accept();
		//System.out.println(alt.getText());
		
	}

}
