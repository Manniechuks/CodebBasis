package MannieCompany.MyMavenprojec;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Scrolldemo extends BaseClassAppium {

	@Test
	public void ScrollDemo() throws MalformedURLException, InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		//If u know where exactly to scroll, use this
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='WebView']")).click();
		
		//dont know exactly where to scroll to, use this
		//boolean canScrollMore;
		//do
		//{
		//canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			//    "left", 100, "top", 100, "width", 200, "height", 200,
			  //  "direction", "down",
			    //"percent", 3.0
			//));
	//	}while(canScrollMore);
		
		Thread.sleep(2000);
		
		
		
		
	
	
	
		
	}
	
}
