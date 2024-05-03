package Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//typecastig
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		//scrool down
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(10000);
		//scrool up
		js.executeScript("window.scrollBy(0,1000)");
		
	}

}
