package GridParallelTests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridParallelTest {
	WebDriver driver;
	Platform WIN10;
	String nodeURL;

	
	@Parameters({"portNO","appURL","platform"})
	@BeforeTest
	public void setup(String portNO, String appURL, String platform) throws MalformedURLException {

		if (portNO.equalsIgnoreCase("4546")) {
			nodeURL = "http://localhost:4546/wd/hub";
			System.out.println("Chrome Browser Test Environment Created");
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			

			driver = new RemoteWebDriver(new URL(nodeURL), cap);
			driver.manage().window().maximize();
			driver.navigate().to(appURL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} else if (portNO.equalsIgnoreCase("4547")) {
			nodeURL = "http://localhost:4547/wd/hub";
			System.out.println("Firefox Browser Test Environment Created");
			DesiredCapabilities cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);

			driver = new RemoteWebDriver(new URL(nodeURL), cap);
			driver.manage().window().maximize();
			driver.navigate().to(appURL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

		else if (portNO.equalsIgnoreCase("4548")) {
			nodeURL = "http://localhost:4548/wd/hub";
			System.out.println("IE Browser Test Environment Created");
			DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
			cap.setBrowserName("internet explorer");
			cap.setPlatform(Platform.WINDOWS);

			driver = new RemoteWebDriver(new URL(nodeURL), cap);
			driver.manage().window().maximize();
			driver.navigate().to(appURL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} else {
			System.err.println("provide correct port no");
		}

	}

	@Test
	public void facebookLogin() {
		System.out.println(driver.getTitle());

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("closing the browser");
	}
}
