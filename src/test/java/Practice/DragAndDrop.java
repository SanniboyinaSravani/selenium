package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		WebElement srceleElement=driver.findElement(By.xpath("//div[@id='div1']"));
		WebElement desteleElement=driver.findElement(By.xpath("//div[@id='div2']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(srceleElement, desteleElement).perform();
		System.out.println(" this a drag and drop");
		
		

	}


}
