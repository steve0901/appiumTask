package mobile;

import mobile.driverManager.DriverManager;
import mobile.pageObject.FollowersPO;
import mobile.pageObject.LoginPO;
import mobile.pageObject.MainMenuPO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Test;

public class TestInstagram {
	private Logger logger = LogManager.getLogger(TestInstagram.class);

	@Test
	public void enterInstagramProfile() {
		String userName = "myFBprofile";
		String password = "myFBpassword";
		String follower = "ukrainer";

		LoginPO loginPO = new LoginPO();
		logger.info("open instagram ");
		loginPO.enterInstagram();
		logger.info("enter login and password ");
		loginPO.enterProfileData(userName, password);

		MainMenuPO mainMenuPO = new MainMenuPO();
		logger.info("find some following user");
		mainMenuPO.openFollowingUsers();

		FollowersPO followersPO = new FollowersPO();
		followersPO.findSomeFollowingUser(follower);
		logger.info("user was found");
	}

	@After
	public void teardown() {
		DriverManager.quit();
	}
}
