package Group001.Adayroi.com;

import Utility.Log;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Constant;

public class HomePage {

	public static void NavigateHomePage() throws Exception {

		Constant.driver = new ChromeDriver();
		Constant.driver.get("https://adayroi.com");
		
		// Constant.driver.navigate();
		Constant.driver.manage().window().maximize();
		// print log in message to the screen
		System.out.println("open web");
		Log.info("open web");
		Thread.sleep(5000);
	}

}