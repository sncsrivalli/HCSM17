package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethodPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		checkbox.click();
		Thread.sleep(3000);
		if(checkbox.isSelected())
			System.out.println("Selected");
		else
			System.out.println("Not Selected");
		
		driver.quit();

	}

}
