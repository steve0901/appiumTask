package mobile.pageObject;

import io.appium.java_client.AppiumDriver;
import mobile.driverManager.DriverManager;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	private AppiumDriver driver;
	private WebDriverWait wait;

	public BasePage() {
		this.driver = DriverManager.getDriver();
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 20);
	}
}
