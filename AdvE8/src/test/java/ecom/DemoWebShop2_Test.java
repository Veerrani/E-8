package ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoWebShop2_Test {

	@Test
	
	public void launch() throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("window is maximized",true);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		Reporter.log("user clicked on Books Page",true);
		Thread.sleep(2000);
		driver.quit();
		
		
	}
		

}
