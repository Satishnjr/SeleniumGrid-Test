package GridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class InternetExplorerTest {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setPlatform(Platform.WINDOWS);
		

		String hubUrl = "http://localhost:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), cap);
		
		driver.get("http://freecrm.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
