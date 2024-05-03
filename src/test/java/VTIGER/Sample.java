package VTIGER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new EdgeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		//click on organization
		driver.findElement(By.xpath("(//td[@class='tabUnSelected'])[3]")).click();
		//click on lookup img
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		//click on organization name
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("magneq software1");
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		Thread.sleep(5000);
		//click on administration button
	WebElement Actions = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	Actions a= new Actions(driver);
	a.moveToElement(Actions).build().perform();
	}

}
