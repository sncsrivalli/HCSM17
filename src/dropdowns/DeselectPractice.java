package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		Select s = new Select(dropdown);
		
		if(s.isMultiple()) {
			s.selectByIndex(0);
			Thread.sleep(2000);
			s.selectByValue("99");
			Thread.sleep(2000);
			s.selectByVisibleText("INR 100 - INR 199 ( 16 )");
			Thread.sleep(2000);
			
			s.deselectByIndex(0);
			Thread.sleep(2000);
			s.deselectByValue("99");
			Thread.sleep(2000);
			s.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
//			Thread.sleep(2000);
			//s.deselectAll();
		}
		else
			System.out.println("Single select");
		
		driver.quit();

	}

}
