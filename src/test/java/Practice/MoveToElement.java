package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement gmail = driver.findElement(By.xpath("//a[@class='gb_J']"));
		Actions a=new Actions(driver);
		a.moveToElement(gmail).perform();
		
		// TODO Auto-generated method stub

	}

}
