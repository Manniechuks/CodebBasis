package Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumBasics {
	@Test
	public void AppiumTest() throws MalformedURLException
	{
		
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("MyPhone");
		options.setApp("C:\\Users\\user\\eclipse-workspace\\MyMavenprojec\\src\\test\\java\\Resources\\ApiDemos-debug.apk");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		//driver .findElement(AppiumBy.accessibilityId("Preference")).click();
		//driver.quit();
		
	}


	


}
