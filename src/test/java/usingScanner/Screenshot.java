package usingScanner;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().browserVersion("106").setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
//File=fsource=((TakeScreenshot)driver).getscreenshotAs(OutputType.FILE);
//	File=fdes=new file("C:\\Users\\DELL\\Desktop\\01-11-22\\errorpic.png");
//	FileHandler.copy(fsource, fdes);
	

	
	}
}
