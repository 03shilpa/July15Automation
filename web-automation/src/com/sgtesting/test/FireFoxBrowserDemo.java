package com.sgtesting.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserDemo
{
	public static WebDriver obrowser=null;

	public static void main(String[] args) 
	{
		launchBroser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();
	}
	static void launchBroser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver","F:\\ExamplesAutomation\\Automation\\web-automation\\library\\driver\\geckodriver.exe");
			obrowser=new FirefoxDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			obrowser.get("http://localhost:82/login.do");
			Thread.sleep(4000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyoutWindow()
	{
		try
		{
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void  createUser()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div ")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo3");
			obrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("user3");
			obrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo3@gamil.com");
			obrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("demouser3");
			obrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("welcome3");
			obrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("welcome3");
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(4000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj=obrowser.switchTo().alert();
			String  content=obj.getText();
			System.out.println(content);
			obj.accept();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			obrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeApplication()
	{
		try
		{
			obrowser.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
