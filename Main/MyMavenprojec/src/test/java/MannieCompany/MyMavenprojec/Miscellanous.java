package MannieCompany.MyMavenprojec;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Miscellanous extends BaseClassAppium{

	@Test
	public void MiscellanousTesting() {
		
		//To go straight to a page you want to run a test on, you use this format below
		
		//adb shell dumpsys window | grep -E 'mCurrentFocus'  -for Mac
		//adb shell dumpsys window | find "mCurrentFocus"  -for Windows
		
	
		//App package & app activity
		Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
		driver.startActivity(activity);
		//driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		
		driver.findElement(By.id("android:id/checkbox")).click();
		//to rotate screen
		//DeviceRotation landscape = new DeviceRotation(0, 0, 90);
		//driver.rotate(landscape);
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("Uche wifi");
		//To press enter or home or back key
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
		
		
		
		
	}
}
