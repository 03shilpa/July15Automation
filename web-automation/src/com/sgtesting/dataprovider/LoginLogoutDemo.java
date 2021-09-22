package com.sgtesting.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginLogoutDemo 
{
	public static WebDriver obrowser=null;
           @Test(priority=1)	
			public void launchBrowser()
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
           @Test(priority=2)	
			public void navigate()
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
           @Test(priority=3,dataProvider="getloginData")	
			public void login(String user,String pwd)
			{
				try
				{
					obrowser.findElement(By.id("username")).sendKeys(user);
					obrowser.findElement(By.name("pwd")).sendKeys(pwd);
					obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
					Thread.sleep(4000);
					obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
					Thread.sleep(2000);
					obrowser.findElement(By.linkText("Logout")).click();
					Thread.sleep(4000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
          
           @Test(priority=4)
			public void closeApplication()
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
           
           @DataProvider
           public Object[][] getLoginData()
           {
        	   return new Object[][] {{"admin","manager"},
        			   {"admin","manager"},{"admin","manager"}};
           }
		}

