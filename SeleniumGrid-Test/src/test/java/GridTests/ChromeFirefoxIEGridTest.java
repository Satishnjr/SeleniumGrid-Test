package GridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeFirefoxIEGridTest {

	@Test
	public void chromeTest() throws MalformedURLException {

		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);

		ChromeOptions options = new ChromeOptions();
		options.merge(cap);

		String hubUrl = "http://localhost:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), options);

		driver.get("http://freecrm.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

	@Test
	public void firefoxTest() throws MalformedURLException {

		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("firefox");

		FirefoxOptions options = new FirefoxOptions();
		options.merge(cap);

		String hubUrl = "http://localhost:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), cap);

		driver.get("http://freecrm.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

	@Test
	public void internetExplorerTest() throws MalformedURLException {

		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("internet explorer");

		InternetExplorerOptions options = new InternetExplorerOptions();
		options.merge(cap);

		String hubUrl = "http://localhost:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), cap);

		driver.get("http://freecrm.com");
		System.out.println(driver.getTitle());
		// driver.findElement(By.name("username")).sendKeys("dfg");
		driver.quit();

	}

}
