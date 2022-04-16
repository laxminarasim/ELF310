package MavenScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleScript {
	@Test
	public void Launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/java/Driverss/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		LoginPage lp=new LoginPage(driver);
		lp.getUsername().sendKeys("admin");
		lp.getPassword().sendKeys("manager");
		lp.getLogin().click();
		Thread.sleep(3000);
		driver.close();
	}
	

}
