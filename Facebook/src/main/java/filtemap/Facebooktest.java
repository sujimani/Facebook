package filtemap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebooktest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manikandan\\Downloads\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
        
        // Set the notification setting it will override the default setting
prefs.put("profile.default_content_setting_values.notifications", 2);

        // Create object of ChromeOption class
ChromeOptions options = new ChromeOptions();

        // Set the experimental option
options.setExperimentalOption("prefs", prefs);

		
	 driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");
		
		String Admincredentials=Data.gertuserinfo().get("customer");
		String Admininfo[]=Admincredentials.split("_");
		
		driver.findElement(By.id("email")).sendKeys(Admininfo[0]);
		driver.findElement(By.id("pass")).sendKeys(Admininfo[1]);
	WebElement lgnbttn=driver.findElement(By.xpath("//input[@type='submit']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", lgnbttn);
	Thread.sleep(1000);

	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("monika padmanathan");
	
	/*Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();*/
	}
	
	

}
