package parallelexecutiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver wd;
	@Parameters({"browser"})
	@BeforeTest
	public void setup(String browser){
		if(browser.equals("FIREFOX")){
			wd=new FirefoxDriver();
		}else if(browser.equals("CHROME")){
			System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\PROJECT\\TestNGTest\\browser\\chromedriver.exe");
			wd=new ChromeDriver();
		}
	}
	@Test
	public void navigateTest() throws InterruptedException{
		
		wd.manage().window().maximize();
		wd.get("http://www.bing.com/");
		WebElement input=wd.findElement(By.xpath(".//*[@id='sb_form_q']"));
		input.sendKeys("abc");
		input.submit();
		Thread.sleep(3000);
		wd.navigate().back();
		Thread.sleep(3000);
		wd.navigate().forward();
		Thread.sleep(3000);
		wd.navigate().back();
		Thread.sleep(3000);
		wd.navigate().forward();
		Thread.sleep(3000);
		wd.navigate().back();
		Thread.sleep(3000);
		wd.navigate().forward();
		
	}
	
}
