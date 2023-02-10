package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement courseTab = driver.findElement(By.id("course"));
		Actions a = new Actions(driver);
		a.moveToElement(courseTab).perform();
		driver.findElement(By.xpath("//span[@class='wrappers']/child::a[text()='Selenium Training']")).click();
		
		int quantityBefore = Integer.parseInt(driver.findElement(By.id("quantity")).getAttribute("value"));
		WebElement plusButton = driver.findElement(By.cssSelector("i.fa-plus"));
		a.doubleClick(plusButton).perform();
		
		int quantityAfter = Integer.parseInt(driver.findElement(By.id("quantity")).getAttribute("value"));
		if(quantityAfter == quantityBefore+1)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		driver.quit();
	}

}
