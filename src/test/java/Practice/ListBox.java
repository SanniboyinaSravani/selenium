package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.facebook.com");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sra123");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sra2001");
		//Thread.sleep(2000);
		//create new account
		//driver.findElement(By.xpath("//div[@class='_6ltg']")).click();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
         //Day
	WebElement	day=driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]"));
		Select s = new Select(day);
		s.selectByValue("31");
		//month
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Aug");
		//year
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2001");
		
	}

}



