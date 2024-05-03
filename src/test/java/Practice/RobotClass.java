package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RobotClass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		//xpath for register
		driver.findElement(By.xpath("//a[@class='nI-gNb-lg-rg__register']")).click();
		
        Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		
		
		

	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}