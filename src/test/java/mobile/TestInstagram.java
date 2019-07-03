package mobile;

import mobile.driverManager.DriverManager;
import mobile.pageObject.FollowersPO;
import mobile.pageObject.LoginPO;
import mobile.pageObject.MainMenuPO;
import org.junit.After;
import org.junit.Test;

public class TestInstagram {

	@Test
	public void enterInstagramProfile() {
		LoginPO loginPO = new LoginPO();
		loginPO.enterInstagram();
		String userName = "myFBprofile";
		String password = "myFBpassword";

		loginPO.enterProfileData(userName, password);

		MainMenuPO mainMenuPO = new MainMenuPO();
		mainMenuPO.openFollowingUsers();

		FollowersPO followersPO = new FollowersPO();
		String follower = "ukrainer";
		followersPO.findSomeFollowingUser(follower);
	}

	@After
	public void teardown() {
		DriverManager.quit();
	}
}
