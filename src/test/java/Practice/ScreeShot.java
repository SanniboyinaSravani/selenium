package Practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreeShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("https:/www.google.com");
		driver.manage().window().maximize();
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\Srava\\eclipse-workspace\\SRAVV_SELENIUM\\src\\test\\java\\Practice\\ScreeShot.google.png");
		Files.copy(src, dst);
	}
	
	

}
