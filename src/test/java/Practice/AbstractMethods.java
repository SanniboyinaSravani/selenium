
package Practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractMethods {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.flipkart.com");
	    String title = driver.getTitle();
	    System.out.println(title);
	  String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		String window = driver.getWindowHandle();
		System.out.println(window );
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.meesho.com");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK']"));
		int size = list.size();
		System.out.println("list of webelement"+size);
		for (WebElement webElement :list) {
			System.out.println(webElement.getText());
			
			
		}
				
	}

}
