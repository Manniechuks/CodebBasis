package Junior.EjiroAPP;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class ActualTest {
public AndroidDriver driver;
	
	@BeforeClass
	public void Confirguration() throws MalformedURLException {
		
		//UiAutomator2Options options = new UiAutomator2Options();
		//options.setDeviceName("Mannie");
		//options.setApp("C:\\Users\\user\\eclipse-workspace\\EjiroAPP\\src\\main\\java\\Resources\\app-release-v13-qa (1).apk");
		 
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Mannie");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\user\\eclipse-workspace\\EjiroAPP\\src\\main\\java\\Resources\\app-release.apk");
		 
		//cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
		//driver.quit();
	}
     public void LongClick(WebElement element) {
	

	((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", 
			ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),
					"duration",2000));
}

     public void ScrollToEnd(WebElement scroll) {
    	 boolean canScrollMore;
 		do
 		{
 		canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
 			    "left", 100, "top", 100, "width", 200, "height", 200,
 			    "direction", "up",
 			    "percent", 3.0
 			));
 		}while(canScrollMore);
 		
    	 
     }
	
}