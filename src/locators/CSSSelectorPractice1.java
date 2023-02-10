package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorPractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[class='initial']")).click();
		Thread.sleep(3000);
		if(driver.getTitle().equals("actiTIME - Enter Time-Track"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		Thread.sleep(3000);
		driver.quit();
	}

}
