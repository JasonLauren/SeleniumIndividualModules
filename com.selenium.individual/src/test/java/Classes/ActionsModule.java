package Classes;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.messages.types.Scenario;

public class ActionsModule 
{
	public WebDriver driver;
	LoginElements pom;
	@Test(priority=1)
	public void open_chrome() throws InterruptedException
	{

		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2137138\\eclipse-workspace\\chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("chrome opened");
		driver.get("https://ui.cogmento.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector(".btn.btn-primary.btn-xs-2")).click();

	}
	@Test(priority=3)
	public void login() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		pom = new LoginElements(driver);
		pom.loginElements();		
		String title = driver.getTitle();
		Thread.sleep(3000);
		screenshot();
		System.out.println("Home Page :  "+ title);

	}
	@Test(priority=2)
	public void screenshot() throws IOException
	{
		// WebDriver driver2 = new ChromeDriver();
		Date d = new Date();
		String fname = d.toString().replace(":", "_").replace(" ","_")+".png";

		System.out.println(fname);
		File dest = new File("C:\\Users\\2137138\\OneDrive - Cognizant\\Documents\\image\\"+fname);
		//FileUtils.copyFile(src, dest);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,dest);

	}
	@Test(priority=4)
	public void mouse_over_contacts()
	{

		WebElement we = driver.findElement(By.cssSelector("a[href='/contacts']"));
		Actions ac= new Actions(driver);
		ac.moveToElement(we).build().perform();
		System.out.println("User clicked on contacts: ");
		we.click();

	}
	@Test(priority=5)
	public void contacts() throws InterruptedException
	{
		pom = new LoginElements(driver);
		pom.createcontacts();
		

	}
		@Test(priority=6)
		public void logout() throws InterruptedException
		{
			driver.findElement(By.xpath("//i[@class='settings icon']//..//..//div[@role='listbox']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
			System.out.println("Logged out successfully: ");
		}
		
		@AfterClass
		public void teardown() throws InterruptedException
		{
			Thread.sleep(1000);
			System.out.println("browser closed");
			driver.close();
			driver.quit();
		} 


}
