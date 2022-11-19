package usingdataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dprovider {
  @Test(dataProvider="formdata")
  public void dataproviderexam(String fname) {
	  WebDriverManager.chromedriver().browserVersion("106").setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
//	  driver.get("https://demo.guru99.com/test/delete_customer.php");
	 driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2Fn%2Ferror");
	driver.findElement(By.id("gh-ac")).sendKeys(fname);
	driver.findElement(By.id("gh-btn")).click();
  }

@DataProvider(name="formdata")
	public Object[]formdata()
{
		return new Object[][] {
			{"Hello"},
			{"bujji"}};
	
}}
