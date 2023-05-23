package Classes;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.cucumber.java.After;

public class DatePicker
{
	public class ActionsModule 
	{
		public WebDriver driver;
		String CheckIn_month_Year = "June 2023";
		//int date = 25;
		String CheckOut_month_Year = "July 2023";
		//@Test(enabled=false)
		@Test(priority=1)
		public void open_chrome() throws InterruptedException
		{

			System.out.println("Hello");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\2137138\\eclipse-workspace\\chromedriver.exe");
			driver= new ChromeDriver();
			System.out.println("chrome opened");
			driver.get("https://phptravels.net/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			//driver.findElement(By.cssSelector(".btn.btn-primary.btn-xs-2")).click();

		}
		@Test(enabled=false)
		//@Test(priority=2)
		
		public void checkInDate() throws InterruptedException
		{
			driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div[2]/div[1]/form/div/div/div[2]/div/div[1]/div/input")).click();
			Thread.sleep(2000);


			while(true)
			{

				String Current_Date = driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/thead/tr[1]/th[2]")).getText();

				if(Current_Date.equals(CheckIn_month_Year))
				{
					System.out.println(CheckIn_month_Year+" " +" "+ Current_Date);
					break;
				}
				else
				{
					driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/thead/tr[1]/th[3]/i")).click();
				}
			}
			driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/tbody/tr[4]/td[5]")).click();
		}
		@Test(enabled=false)
		//@Test(priority=3)
		public void checkOutDate() throws InterruptedException
		{
//			driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div[2]/div[1]/form/div/div/div[2]/div/div[2]/div/input")).click();
//			Thread.sleep(2000);


			while(true)
			{

				String CurrentDate = driver.findElement(By.xpath("/html/body/div[9]/div[1]/table/thead/tr[1]/th[2]")).getText();

				if(CurrentDate.equals(CheckOut_month_Year))
				{
					System.out.println(CheckOut_month_Year+" " +" "+ CurrentDate);
					break;
				}
				else
				{
					driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/thead/tr[1]/th[3]/i")).click();
				}
			}
			driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/tbody/tr[4]/td[3]")).click();
		}
		
		
		
		@AfterClass
		public void teardown() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.close();driver.quit();
		}
		
	}
}

