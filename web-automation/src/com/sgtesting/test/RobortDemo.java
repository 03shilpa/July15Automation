package com.sgtesting.test;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobortDemo
{
	public static WebDriver obrowser=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		importTasks();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\ExamplesAutomation\\Automation\\web-automation\\library\\driver\\chromedriver.exe");
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
			Robot robort=new Robot();
			robort.keyPress(KeyEvent.VK_ENTER);
			robort.keyRelease(KeyEvent.VK_ENTER);
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
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void importTasks()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[3]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("/html/body/div[13]/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("dropzoneClickableArea")).click();
			Thread.sleep(2000);
			String filename="F:\\Sample.csv";
			CopyFile(filename);
			Thread.sleep(2000);
			Robot robort=new Robot();
	    	robort.keyPress(KeyEvent.VK_CONTROL);
			robort.keyPress(KeyEvent.VK_V);
			Thread.sleep(2000);
			robort.keyRelease(KeyEvent.VK_CONTROL);
			robort.keyRelease(KeyEvent.VK_V);
			Thread.sleep(2000);
			robort.keyPress(KeyEvent.VK_ENTER);
			robort.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void CopyFile(String filename)
	{
		StringSelection selection=new StringSelection(filename);
		Toolkit obj=Toolkit.getDefaultToolkit();
		Clipboard cb=obj.getSystemClipboard();
		cb.setContents(selection, null);
	}

}
