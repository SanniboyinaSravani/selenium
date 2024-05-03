package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			
			
			
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	
	//Alert box
	
	//System.out.println(driver.findElement(By.id("output")).getText());
	
	//driver.findElement(By.id("alertBox")).click();
	
	//System.out.println(driver.switchTo().alert().getText());
	//driver.switchTo().alert().accept();
	
	//System.out.println(driver.findElement(By.id("output")).getText());
		//	Thread.sleep(2000);
			//driver.quit();
			
			//confirm box accept
			
		//	System.out.println(driver.findElement(By.id("output")).getText());
			
		//	driver.findElement(By.id("confirmBox")).click();
			
		//	System.out.println(driver.switchTo().alert().getText());
			//driver.switchTo().alert().accept();
			
		//System.out.println(driver.findElement(By.id("output")).getText());
					//Thread.sleep(2000);
					// Dissmiss button
					//System.out.println(driver.findElement(By.id("output")).getText());
					
					//driver.findElement(By.id("confirmBox")).click();
					
					//System.out.println(driver.switchTo().alert().getText());
					//driver.switchTo().alert().dismiss();
					
					//System.out.println(driver.findElement(By.id("output")).getText());
							//Thread.sleep(2000);
							//driver.quit();
					
			                //prompt box
							
							//System.out.println(driver.findElement(By.id("output")).getText());
							
							//	driver.findElement(By.id("promptBox")).click();
								
								//System.out.println(driver.switchTo().alert().getText());
								//driver.switchTo().alert().sendKeys("HYR Tutorial");
								//driver.switchTo().alert().accept();
								
							//System.out.println(driver.findElement(By.id("output")).getText());
										//Thread.sleep(2000);
										
										//System.out.println(driver.findElement(By.id("output")).getText());
										
										//driver.findElement(By.id("promptBox")).click();
										
										//System.out.println(driver.switchTo().alert().getText());
										//driver.switchTo().alert().dismiss();
										
										//System.out.println(driver.findElement(By.id("output")).getText());
												//Thread.sleep(2000);
												//driver.quit();
										
							
			
		}


		// TODO Auto-generated method stub

	}


