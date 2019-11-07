import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneVision_Login {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Pradeep\\Browser_Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://onevision-uat.businessonetech.net/rdLogon.aspx");
        driver.findElement(By.xpath("//input[@id='rdUsername']")).sendKeys("bpradeep@businessonetech.com");
        driver.findElement(By.xpath("//input[@id='rdPassword']")).sendKeys("Password@1");
        driver.findElement(By.id("Submit1")).click();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='divLogoHeader']//a[3]//img[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'Log Off')]")).click();

	}

}
