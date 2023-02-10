package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XMLConversionPractice extends BaseClass{
	
	@Test
	public void googleTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if(driver.getTitle().contains("Google"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		driver.quit();
	}
	
	@Test
	public void facebookTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if(driver.getTitle().contains("Facebook"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		driver.quit();
	}

}
