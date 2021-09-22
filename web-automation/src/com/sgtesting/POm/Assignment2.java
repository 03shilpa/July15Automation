package com.sgtesting.POm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2
{
	public static WebDriver obrowser=null;
	public static ActiPage oPage=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		//CreateUser();
		//modifyUser();
		deleteUser();
		Logout();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\ExamplesAutomation\\Automation\\web-automation\\library\\driver\\chromedriver.exe");
			obrowser=new ChromeDriver();
			oPage=new ActiPage(obrowser);
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
			oPage.getUsername().sendKeys("admin");
			Thread.sleep(4000);
			oPage.getPassword().sendKeys("manager");
			Thread.sleep(4000);
			oPage.getLoginButton().click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			Thread.sleep(4000);
			oPage.getFlyoutWin().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void CreateUser()
	{
		try
		{
			oPage.user().click();
			oPage.createUser().click();
			oPage.fn().sendKeys("sn");
			oPage.ln().sendKeys("sn");
			oPage.email().sendKeys("sn@gmail.com");
			oPage.un().sendKeys("sn1");
			oPage.pwd().sendKeys("SN");
			oPage.retypePwd().sendKeys("SN");
			oPage.createButton().click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void modifyUser()
	{
		try
		{
			Thread.sleep(4000);
			oPage.clickTodelete().click();
			Thread.sleep(4000);
			oPage.pwd().sendKeys("sss");
			oPage.retypePwd().sendKeys("sss");
			Thread.sleep(4000);
			oPage.commitButton().click();
			Thread.sleep(4000);
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
			oPage.user().click();
			oPage.clickTodelete().click();
			oPage.clickOndelete().click();
			Thread.sleep(2000);
			Alert obj=obrowser.switchTo().alert();
			Thread.sleep(2000);
			String content=obj.getText();
			Thread.sleep(2000);
			System.out.println(content);
			obj.accept();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Logout()
	{
		try
		{
			oPage.getLogout().click();
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
