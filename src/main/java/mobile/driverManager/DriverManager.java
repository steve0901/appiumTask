package mobile.driverManager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager {

	public static AppiumDriver driver = null;

	public static AppiumDriver getDriver() {
		if (driver == null) {
			try {
				driver = setUp();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		return driver;
	}

	public static AppiumDriver setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app",
				"C://Users//Stepan Synoviat//Desktop//androidApps//instagram.apk");
		capabilities.setCapability("appPackage", "com.instagram.android");
		capabilities.setCapability("appActivity",
				"com.instagram.mainactivity.MainActivity");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "58ebb987d140");
		capabilities.setCapability("platformVersion", "7.1.2");
		capabilities.setCapability("fullReset", false);
		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	public static void quit() {
		driver.quit();
	}
}
