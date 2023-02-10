package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		String title = driver.getTitle();
		String pageSource = driver.getPageSource();
		if(pageSource.contains("Amazon.com"))
			System.out.println("Page Displayed");
		else
			System.out.println("Page Not Found");

	}

}
