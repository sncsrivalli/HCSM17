package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropdownSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(dropdown);
		
		if(s.isMultiple()) 
			System.out.println("Multi Select");
		else
			System.out.println("Single Select");
		
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByValue("search-alias=digital-music");
		Thread.sleep(2000);
		s.selectByVisibleText("Movies & TV");
		Thread.sleep(2000);
		driver.quit();
	}

}
