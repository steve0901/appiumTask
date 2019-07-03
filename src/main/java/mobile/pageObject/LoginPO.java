package mobile.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePage {

	@FindBy(id = "com.instagram.android:id/log_in_button")
	private WebElement logInbutton;

	@FindBy(id = "m_login_email")
	private WebElement facebookLoginUserName;

	@FindBy(id = "m_login_password")
	private WebElement facebookPassword;

	@FindBy(id = "u_0_5")
	private WebElement enterProfile;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/" +
			"android.widget.LinearLayout/android.widget.FrameLayout/" +
			"android.widget.FrameLayout/android.widget.LinearLayout/" +
			"android.webkit.WebView/android.webkit.WebView/android.view.View[1]/" +
			"android.view.View[2]/android.view.View[3]/android.view.View[1]/android.widget.Image")
	private WebElement instagramIcon;

	@FindBy(xpath = "hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
			"android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/" +
			"android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/" +
			"android.widget.Button[1]")
	private WebElement contunieAsClient;

	@FindBy(id = "com.instagram.android:id/login_facebook")
	private WebElement loginWithFacebook;

	public void enterInstagram() {
		logInbutton.click();
		loginWithFacebook.click();
	}

	public void enterProfileData(String userName, String password) {
		facebookLoginUserName.sendKeys(userName);
		facebookPassword.sendKeys(password);
		instagramIcon.click();
		enterProfile.click();
		contunieAsClient.click();
	}
}
