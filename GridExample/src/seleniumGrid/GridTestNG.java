package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridTestNG {

	public static RemoteWebDriver driver;

	@BeforeTest
	@Parameters({"platform", "browserName", "remoteurl"})
	public void beforeTest(String platform,String browserName, String remoteurl) throws MalformedURLException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		DesiredCapabilities cap = null;
		
		
		if (browserName.equals("firefox")) {
		cap = new DesiredCapabilities().firefox();
		cap.setBrowserName("firefox");
		
		}else if(browserName.equals("chrome")) {
			cap = new DesiredCapabilities().chrome();
			cap.setBrowserName("chrome");
		}
		
		cap.setPlatform(Platform.XP);
		//URL url = new URL("http://192.168.2.17:4444/wd/hub");
		
		driver = new RemoteWebDriver(new URL(remoteurl), cap);
		driver.navigate().to("http://gmail.com");
	}

	@Test
	public void login() {

		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("Satish");
		driver.quit();
	}

}
