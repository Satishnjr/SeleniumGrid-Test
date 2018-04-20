package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridChrome {

	public static RemoteWebDriver driver;

	@Test
	public void test() throws MalformedURLException {

		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.XP);

		URL url = new URL("http://192.168.2.17:4444/wd/hub");
		driver = new RemoteWebDriver(url, cap);

		driver.navigate().to("http://gmail.com");

		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("Satish");
		driver.quit();

	}

}
