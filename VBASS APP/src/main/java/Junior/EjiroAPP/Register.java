package Junior.EjiroAPP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Register extends ActualTest{
	
	@Test
	public void RegisterAccount() throws InterruptedException {
		
		driver.findElement(By.xpath("//android.view.ViewGroup[3]/android.widget.TextView")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='I don’t have a Vbank account']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='I want to register a business']")).click();
		driver.findElement(By.xpath("//android.view.ViewGroup[3]/android.widget.TextView")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter BVN']")).click();
		Thread.sleep(5000);
		String Title = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter BVN']")).getText();
		Assert.assertEquals(Title, "Enter BVN");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter BVN']")).sendKeys("22347809567");
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter NIN']")).click();
		String name = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter NIN']")).getText();
		Assert.assertEquals(name, "Enter NIN");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter NIN']")).sendKeys("30274839284");
		
		//DateofBirth
		driver.findElement(By.xpath("//android.widget.TextView[@text='DD/MM/YY']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//android.widget.TextView[@text='']")).click();
		
		//driver.findElement(By.xpath("//android.widget.EditText[@text='2023']")).click();
		 //driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.NumberPicker[3]")).click();
		
		//WebElement element = driver.findElement(By.xpath("//android.widget.EditText[@text='2023']"));
		//LongClick (element);
		//String abc = driver.findElement(By.xpath("//android.widget.EditText[@text='2023']")).getText();
		//Assert.assertEquals(abc, "2023");
		//driver.findElement(By.xpath("//android.widget.EditText[@text='2023']")).sendKeys("1995");
		
		
	
		
		
		
		 
		
		
		
		//driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.NumberPicker[1]")).sendKeys("Jan");
		//driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.NumberPicker[2]")).sendKeys("23");
		//driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.NumberPicker[3]")).sendKeys("1995");
		//Thread.sleep(3000);
		
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		
		
		//driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.NumberPicker[3]")).click();
		
		//driver.findElement(new AppiumBy.ByAndroidUIAutomator(
				//"new UiScrollable(new Uiselector().scrollable(true).instance(0))"
		//+".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "Sep" + "\").instance(0))"));	
		//driver.findElement(By.xpath("//android.widget.EditText[@text='1995']")).click();
		
		
		//WebElement element = driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.NumberPicker[3]"));
		//LongClick (element);
		
		//WebElement element = driver.findElement(By.xpath("//android.widget.Button[@text='2022']"));
		//LongClick (element);
		
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new Uiselector().text(\'1995\'))"));
				
		//driver.findElement(By.xpath("//android.widget.EditText[@text='1995']")).click();
		
		
		
		
		
		
		
		//driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.NumberPicker[1]")).click();
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\'Jan\'));"));
		//driver.findElement(By.xpath("//android.widget.EditText[@text='Jan']")).click();
		
		
		
		
		
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\'Jun\'));"));
		//driver.findElement(By.xpath("//android.widget.EditText[@text='Jun']")).click();
		
		
		//otherEnd
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter email address']")).click();
		String Email = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter email address']")).getText();
		Assert.assertEquals(Email, "Enter email address");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter email address']")).sendKeys("Emmanuel@gmail.com");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Email address']")).click();
		
		
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter phone number']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.findElement(By.xpath("//android.view.ViewGroup[11]/android.view.ViewGroup")).click();
		String Number = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter phone number']")).getText();
		Assert.assertEquals(Number, "Enter phone number");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter phone number']")).sendKeys("09027475272");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Phone number']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='CONTINUE']")).click();
		
		
		
		
		
		
		
	}

}
