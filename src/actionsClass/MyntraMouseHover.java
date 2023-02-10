package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraMouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement kids = driver.findElement(By.xpath("//a[text()='Kids' and @data-group='kids']"));
		Actions a = new Actions(driver);
		a.moveToElement(kids).perform();
		
		driver.findElement(By.xpath("//a[text()='Learning & Development']")).click();
	
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.xpath("//div[@class='filter-summary-filter']"));
		String text = wait.until(ExpectedConditions.visibilityOf(element)).getText();
		if(text.contains("Learning"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		driver.quit();
	}

}
