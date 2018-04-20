package GridParallelTests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridParallelTest1 {

	// RemoteWebDiver instance
	public static RemoteWebDriver driver;

	@BeforeTest
	@Parameters({ "platform", "browserName", "remoteURL" })

	public void setup(String platform, String browserName, String remoteURL) throws MalformedURLException {

		DesiredCapabilities cap = null;

		if (browserName.equals("firefox")) {
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		if (browserName.equalsIgnoreCase("chrome")) {
			cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}

		driver = new RemoteWebDriver(new URL(remoteURL), cap);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com");
	}

	@Test
	public void googleSearch() {
		System.out.println(driver.getTitle());
	}

	@Test
	public void clickExecuteAutomation() {
		System.out.println(driver.getTitle());
	}

}
