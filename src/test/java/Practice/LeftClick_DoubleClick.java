package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeftClick_DoubleClick {
	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement gmail=driver.findElement(By.xpath("//a[@class='gb_H']"));
		Actions a=new Actions(driver);
		a.moveToElement(gmail).doubleClick().perform();
		
		
		// TODO Auto-generated method stub

	}


}
