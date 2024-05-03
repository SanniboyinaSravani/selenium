package Practice;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetPosition {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
	    driver.get("https://www.facebook.com");
		Point p = new Point(100, 200);
		driver.manage().window().setPosition(p);
		// TODO Auto-generated method stub

	}

}
