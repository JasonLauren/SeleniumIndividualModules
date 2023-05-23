package com.selenium.individual.com.selenium.individual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginElements 
{
	WebDriver driver;
	By username = By.xpath("//input[@name='email' and @type='text']");
	By password = By.xpath("//input[@name='password' and @type='password']");
	By button = By.xpath("//div[contains(text(),'Login') and @class='ui fluid large blue submit button']");
	
	/*******************************************  contacts*************************************************************************************************** */
	By contactsbuttonicon = By.xpath("//i[@class='users icon']");
	By newcontacts = By.xpath("//a[@href='/contacts/new']");
	By fname = By.xpath("//input[@name='first_name']");
	By lname = By.xpath("//input[@name='last_name']");
	By email = By.xpath("//input[@placeholder='Email address']");
	By twitter = By.xpath("//div[contains(text(),'Twitter')]/..");
	By tiktok = By.xpath("//span[contains(text(),'TikTok')]");
	By savebtn = By.cssSelector(".save.icon");
	/******************************************************************************************************************************************************/
	
		
	public LoginElements(WebDriver driver1)
	 
	{
		this.driver=driver1;
	}
	
	
	public void createcontacts() throws InterruptedException
	{
		driver.findElement(contactsbuttonicon).click();
		driver.findElement(newcontacts).click();
		Thread.sleep(2000);
		driver.findElement(fname).sendKeys("cook");
		driver.findElement(lname).sendKeys("Glen");
		driver.findElement(email).sendKeys("madasurishna22@gmail.com");
		WebElement dd = driver.findElement(twitter);
		dd.click();
		driver.findElement(tiktok).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(savebtn).click();
				
	}
	public void loginElements()
	{
		driver.findElement(username).sendKeys("madasurishna22@gmail.com");
		driver.findElement(password).sendKeys("password");
		driver.findElement(button).click();
	}

}
