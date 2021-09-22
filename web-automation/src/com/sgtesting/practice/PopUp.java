package com.sgtesting.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp
{
	public static WebDriver obrowser=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		popUpBrowser();
		handlePopUps();
	}
	static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\ExamplesAutomation\\Automation\\web-automation\\library\\driver\\chromedriver.exe");
		obrowser=new ChromeDriver();
	}
	static void navigate()
	{
		try
		{
		obrowser.get("http://localhost:82/login.do");
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void popUpBrowser()
	{
		try
		{
			System.out.println("Before click on link "+getPopUpCount());
			obrowser.findElement(By.linkText("actiTIME Inc.")).click();
			System.out.println("after click on link "+getPopUpCount());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static int getPopUpCount()
	{
		int count=0;
		try
		{
			count=obrowser.getWindowHandles().size()-1;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
	}
	static void handlePopUps()
	{
		try
		{
			String parent =obrowser.getWindowHandle();
			System.out.println("parent "+parent);
			Object[] popups=obrowser.getWindowHandles().toArray();
			for(int i=1;i<popups.length;i++)
			{
				String child=popups[i].toString();
				System.out.println("child "+child);
				Thread.sleep(2000);
				obrowser.switchTo().window(child);
				String title=obrowser.getTitle();
				System.out.println("child browser "+title);
				obrowser.findElement(By.linkText("Start Using actiTIME")).click();
				Thread.sleep(2000);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
