import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Veeva {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Pradeep\\Browser_Drivers\\chromedriver.exe");
		WebDriver drv = new ChromeDriver();
		drv.get("https://test.salesforce.com/");
		drv.manage().window().maximize();
        drv.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        drv.findElement(By.xpath("//input[@id='username']")).sendKeys("bpradeep@businessonetech.com.busone03");
        drv.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@2019");
        drv.findElement(By.xpath("//input[@id='Login']")).click();
        
	}

}
