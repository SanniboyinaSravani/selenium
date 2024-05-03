package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	//driver.get(By.xpath("(//a[@class='gb_H'])[1]"));
		Thread.sleep(4000);
WebElement	gmail	=driver.findElement(By.xpath("//div[@class='gb_Cd gb_gb gb_rd']"));
Actions a=new Actions(driver);
a.moveToElement(gmail).perform();

		
		// TODO Auto-generated method stub

	}


}
