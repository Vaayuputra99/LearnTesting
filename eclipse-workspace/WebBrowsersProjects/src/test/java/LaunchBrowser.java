import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
		
//		 System.setProperty(
//		            "webdriver.chrome.driver",
//		            "C:\\Users\\bhuvanj\\Downloads\\chromedriver-win64\\chromedriver.exe");
//		 ChromeOptions options=new ChromeOptions();
//		 options.addArguments("--disable-dev-shm-usage"); 
//		 options.addArguments("--no-sandbox");       
//		 options.addArguments("window-size=1200x600");
		 WebDriver driver = new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(5000);
		System.out.println("Opened");
		driver.quit();
	}
}
