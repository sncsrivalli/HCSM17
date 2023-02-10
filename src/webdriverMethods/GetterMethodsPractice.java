package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetterMethodsPractice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		//String pageSource = driver.getPageSource();
		
		System.out.println(title);
		System.out.println(url);
		//System.out.println(pageSource);

	}

}
