package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridFF {

	public static RemoteWebDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		
		//System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		
		cap.setPlatform(Platform.XP);

		URL url = new URL("http://192.168.2.17:4444/wd/hub");
		driver = new RemoteWebDriver(url, cap);

		driver.navigate().to("http://gmail.com");

		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("Satish");
		//driver.quit();

	}

}
