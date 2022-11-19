package fileupload;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class file123 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","D:\\chrome driver\\")
//		WebDriverManager.chromedriver().browserVersion("106").setup();
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		 driver.get("https://www.filemail.com/share/upload-file");
		 driver.findElement(By.xpath("//*[@id=\"addBtn\"]/span"));
		 StringSelection path=new StringSelection("E:\\QA 25\\ss");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path,null);
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);)
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
