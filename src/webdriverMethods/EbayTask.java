package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayTask {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String pageSource = driver.getPageSource();
		if(pageSource.contains("More | eBay"))
			System.out.println("Page Displayed");
		else
			System.out.println("Page Not Found");
		driver.manage().window().minimize();

	}

}
