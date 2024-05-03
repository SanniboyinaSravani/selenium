package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TASK {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com");
		driver.manage().window().maximize();
		
		
	}

}
