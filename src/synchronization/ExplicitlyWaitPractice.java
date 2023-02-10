package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//To wait until title appears
		wait.until(ExpectedConditions.titleContains("actiTIME"));
		
		WebElement username_TF = driver.findElement(By.id("username"));
		//To wait until user name text field appears
		wait.until(ExpectedConditions.visibilityOf(username_TF)).sendKeys("admin");
		
		WebElement password_TF = driver.findElement(By.name("pwd"));
		//To wait until password text field appears
		wait.until(ExpectedConditions.visibilityOf(password_TF)).sendKeys("manager");
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		//To wait until login button appears
		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
		
		//To wait until Home Page appears
		wait.until(ExpectedConditions.titleContains("Enter Time-Track"));

		driver.quit();
	}

}
