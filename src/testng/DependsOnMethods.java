package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DependsOnMethods {
	WebDriver driver;
	@Test
	public void navigateToActitime() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dependsOnMethods = "navigateToActitime")
	public void loginToActitime() {
		driver.findElement(By.id("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		WebElement userProfile = driver.findElement(By.className("userProfileLink"));
		if(userProfile.isDisplayed())
			System.out.println("Pass");
		else
			System.out.println("Fail");
		driver.quit();
	}
}
