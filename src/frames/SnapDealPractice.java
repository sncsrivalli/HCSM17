package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement signIn = driver.findElement(By.className("accountUserName"));
		Actions a = new Actions(driver);
		a.moveToElement(signIn).perform();
		
		driver.findElement(By.xpath("//a[text()='login']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("4654658465");
		driver.findElement(By.xpath("//i[contains(@class,'delete')]")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.name("keyword")).sendKeys("dresses");
		driver.findElement(By.className("searchTextSpan")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
