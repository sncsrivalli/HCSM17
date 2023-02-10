package windows;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToNewWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		driver.close();
		Thread.sleep(2000);
		driver.quit();

	}

}
