package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpDemo 
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
	
	static void popUpBrowser()
	{
		try
		{
			System.out.println("before click on the link:"+getPopUpCount());
			obrowser.findElement(By.xpath("//*[@id=\'copyRight\']/nobr/a")).click();
			System.out.println("after click on the link : "+getPopUpCount());
			if(getPopUpCount()>0)
			{
				handlePopUps();
			}
			
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
			String parentbrowser=obrowser.getWindowHandle();
			System.out.println("parent browser"+parentbrowser);
			Object[] popups=obrowser.getWindowHandles().toArray();
			for(int i=1;i<popups.length;i++)
			{
				String childbrowser=popups[i].toString();
				System.out.println("childbrowser "+childbrowser);
				Thread.sleep(2000);
				obrowser.switchTo().window(childbrowser);
				String title=obrowser.getTitle();
				System.out.println("childbrowser title "+title);
				obrowser.findElement(By.linkText("Start Using actiTIME")).click();
				Thread.sleep(2000);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
