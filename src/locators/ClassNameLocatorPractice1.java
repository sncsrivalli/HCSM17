package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocatorPractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.className("textField")).sendKeys("admin");
		driver.findElement(By.className("pwdfield")).sendKeys("manager");
		driver.findElement(By.className("initial")).click();
		
		Thread.sleep(5000);
		if(driver.getTitle().equals("actiTIME - Enter Time-Track"))
			System.out.println("Test Pass");
		else
			System.out.println("Test Fail");
		driver.quit();

	}

}
