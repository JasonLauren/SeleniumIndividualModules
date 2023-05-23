package Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ScrollDownPage 
{
	WebDriver driver;
	@Test(priority=1)
	public void open_chrome() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\2137138\\eclipse-workspace\\chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("chrome opened");
		driver.get("https://phptravels.net/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector(".btn.btn-primary.btn-xs-2")).click();

	}
	@Test(priority=2)
	public void selectOffers() throws InterruptedException
	{
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/button")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement bt= driver.findElement(By.xpath("/html/body/section[5]/div[2]/div/div/div/div/div/a"));
		WebElement sd= driver.findElement(By.xpath("/html/body/section[6]/div/div[3]/div/div/a"));
		///html/body/section[6]/div/div[3]/div/div/a
		js.executeScript("arguments[0].scrollIntoView(true);", bt);
		js.executeScript("arguments[0].click()",bt);
		Thread.sleep(2000);
		//js.executeScript(document.getElementsByName("View Offers").click());
		//bt.click();
				
	}
	@AfterClass
	public void teardown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		driver.quit();driver.quit();driver.quit();driver.quit();
		
	}


}
