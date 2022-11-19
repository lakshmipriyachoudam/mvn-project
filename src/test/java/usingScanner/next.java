package usingScanner;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class next {
//	static WebDriver driver;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Category to select:");
		String cat=sc.nextLine();
		System.out.println("Enter product to Search:");
		String prod=sc.nextLine();
		 WebDriverManager.chromedriver().browserVersion("106").setup();
		 WebDriver Driver=new ChromeDriver();
		  Driver.manage().window().maximize();
		  Driver.get("http://ebay.com");
		  WebElement dd=Driver.findElement(By.id("gh-cat"));
		  Select s=new Select(dd);
		  s.selectByVisibleText(cat);
		  Driver.findElement(By.id("gh-ac")).sendKeys(prod);
		  Driver.findElement(By.id("gh-btn")).click();
		  

	}

}
