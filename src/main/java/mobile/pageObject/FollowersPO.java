package mobile.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FollowersPO extends BasePage {

	@FindBy(id = "com.instagram.android:id/row_search_edit_text")
	private WebElement searchFollowersBar;

	public void findSomeFollowingUser(String followerName) {
		searchFollowersBar.sendKeys(followerName);
	}
}
