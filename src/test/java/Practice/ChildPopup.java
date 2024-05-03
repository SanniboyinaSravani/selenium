package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		//acess parent browser
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile under 20000");
		//acess child browser
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		String mainwindowit = driver.getTitle();
		System.out.println(mainwindowit);
		Thread.sleep(3000);
		// TODO Auto-generated method stub

	}


}
