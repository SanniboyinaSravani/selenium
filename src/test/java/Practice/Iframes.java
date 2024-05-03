package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		//switch to iframe using iframe in div class
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		
           
            
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Sravani");
		Thread.sleep(300);
		 
		driver.findElement(By.xpath("//input[@id='lname']")).clear();
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Sanniboyina");
		
		
		


	}


}
