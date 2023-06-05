package MannieCompany.MyMavenprojec;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AppiumBasics extends BaseClassAppium {

	@Test
	public void WifiSettingsName() throws MalformedURLException
	{
		//Actuall Automation
		//Xpath, id, accessibilityId, Classname, AndroidUIAutomator
		
		//tagName[@attribute='value'  --> //tagname 
		AppiumConfiguration();
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
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
		
		
		
		
		
		
		tearDown();
	//Xpath= tagName[@attribute='value'
		
		
		
	}
	
	
	
}
