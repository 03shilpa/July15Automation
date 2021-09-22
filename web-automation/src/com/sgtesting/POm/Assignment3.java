package com.sgtesting.POm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3
{

		public static WebDriver obrowser=null;
		public static ActiPage oPage=null;
		public static void main(String[] args)
		{
			launchBrowser();
			navigate();
			login();
			minimizeFlyOutWindow();
			CreateCustomer();
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
		static void CreateCustomer()
		{
			try
			{
				oPage.clickOnTask().click();
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
