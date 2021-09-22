package com.sgtesting.practice;

import java.awt.Robot;
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
			obrowser.findElement(By.className("pwd")).sendKeys("manager");
			Robot robort=new Robot();
			robort.keyPress(KeyEvent.VK_ENTER);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
