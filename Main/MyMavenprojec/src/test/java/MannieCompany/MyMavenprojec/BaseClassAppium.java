package MannieCompany.MyMavenprojec;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClassAppium {

	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void AppiumConfiguration() throws MalformedURLException
	{
		//AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("\\Users\\user\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib"))
				//.withIPAddress("127.0.0.1").usingPort(4723).build();
		//service.start(); 
		//192.168.43.135
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("My Tab");
		options.setApp("C:\\Users\\user\\eclipse-workspace\\MyMavenprojec\\src\\test\\java\\Resources\\ApiDemos-debug.apk");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void LongPressAction(WebElement element)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", 
				ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),
						"duration",2000));
	}
	
	public void SwipeAction(WebElement element,String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				   "elementId", ((RemoteWebElement)element).getId(),
				    "direction", direction,
				    "percent", 0.75
				));
	}
	
	public void DragandDropAction(WebElement source) {
		
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) source).getId(),
			    "endX", 100,
			    "endY", 100
			));
		
	}
	
	@AfterClass
		public void tearDown()
		{
			
			driver.quit();
			//service.stop();
		}
		
		
		
		
		
		
	
}
