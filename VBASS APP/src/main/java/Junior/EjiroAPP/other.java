package Junior.EjiroAPP;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class other {
public AndroidDriver driver;

	@Test
	public void Facebook() throws MalformedURLException, InterruptedException {
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Mannie");
		options.setApp("C:\\Users\\user\\eclipse-workspace\\EjiroAPP\\src\\main\\java\\Resources\\app-release.apk");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='LOGIN']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter email address']")).sendKeys("mobolajikupoluyi@yahoo.com");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter password']")).sendKeys("Admin@123@");
		//driver.hideKeyboard();
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Email address']")).click();
		
		driver.findElement(By.xpath("//android.view.ViewGroup[2]/android.view.ViewGroup[6]")).click();
		
		
		Thread.sleep(4000);
		
		driver.quit();
	}
	
	
	
	
	//List<WebElement> values= driver.findElements(By.xpath("//android.widget.NumberPicker"));
	
	//for(int i=0;i<=values.size();i++)
	//{
	//System.out.println(values.get(i).getText());
}
