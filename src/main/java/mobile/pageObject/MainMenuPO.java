package mobile.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainMenuPO extends BasePage {

	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Profile\"]")
	private WebElement instaProfile;

	@FindBy(id = "com.instagram.android:id/row_profile_header_textview_following_count")
	private WebElement allFolowingUsers;

	public void openFollowingUsers() {
		instaProfile.click();
		allFolowingUsers.click();
	}
}
