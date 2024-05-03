package VTIGER;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FetchingDataIntoNotepad {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fisp= new FileInputStream("C:\\Users\\Srava\\OneDrive\\Documents\\CommonData.properties.txt");
		Properties p = new Properties();
		p.load(fisp);
		String urL = p.getProperty("url");
		String uN = p.getProperty("un");
		 String pW = p.getProperty("pw");
		String browseR = p.getProperty("browser");
		System.out.println(uN);
		System.out.println(pW);
		System.out.println(browseR);
		System.out.println(urL);
		
		//vtiger page open
		WebDriver driver = new EdgeDriver();
		driver.get(urL);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(uN);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(pW);
		driver.findElement(By.id("submitButton")).click();
		
		//click on organization button
				driver.findElement(By.xpath("(//td[@class='tabUnSelected'])[3]")).click();
				//click on lookup img
				driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
				//click on organization name every time change the name
				driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("magneq software3");
				driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
				Thread.sleep(5000);
				//click on administration button
			WebElement Actions = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			Actions a= new Actions(driver);
			a.moveToElement(Actions).build().perform();
		
	}

}
