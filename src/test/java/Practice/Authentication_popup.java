package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Authentication_popup {

	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		//admin:admin@
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
