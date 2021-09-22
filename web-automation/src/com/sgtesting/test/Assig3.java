package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig3
{
	public static WebDriver obrowser=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		deleteCustomer();
		logout();
		closeApplication();

	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","F:\\ExamplesAutomation\\Automation\\web-automation\\library\\driver\\chromedriver.exe");
			obrowser=new ChromeDriver();

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
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    static void createCustomer()
    {
    	try
    	{
    		obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[1]")).click();
    		Thread.sleep(4000);
    		obrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
    		Thread.sleep(4000);
    		obrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
    		obrowser.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys("kiran");
    		obrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div")).click();
    		
    	}
    	catch(Exception e)
		{
			e.printStackTrace();
		}
	
    }
    static void deleteCustomer()
    {
    	try
    	{
    		obrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
    		Thread.sleep(4000);
    		obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
    		Thread.sleep(4000);
    		obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
    		obrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle\r\n")).click();
    		
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
			//Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
