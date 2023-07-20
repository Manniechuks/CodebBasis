package Junior.EjiroAPP;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class SignUp extends ActualTest{

	@Test
	public void SignUppage() throws InterruptedException, MalformedURLException {
		
		driver.findElement(By.xpath("//android.view.ViewGroup[3]/android.widget.TextView")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='I have a corporate Vbank account']")).click();
		 
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter account']")).click();
		String EditText = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter account']")).getText();
		Assert.assertEquals(EditText, "Enter account");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter account']")).sendKeys("1001571770");
		driver.findElement(By.xpath("//android.view.ViewGroup[3]")).click();
		
		Thread.sleep(3000);
		
		
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("My Tab");
		options.setApp("C:\\Users\\user\\eclipse-workspace\\Facebook\\src\\main\\java\\Resource\\facebook-412-0-0-0-5.apk");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
}
