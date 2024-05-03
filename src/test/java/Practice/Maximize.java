package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Maximize {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		// TODO Auto-generated method st
	}

}
