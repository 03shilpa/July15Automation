package com.sgtesting.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo1 
{
	public static WebDriver obrowser=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		identifyElements();

	}
	static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\DemoWorkSpace\\web-automation\\library\\driver\\chromedriver.exe");
		obrowser=new ChromeDriver();
	}
	static void navigate()
	{
		try
		{
		obrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void identifyElements()
	{
		try
		{
			obrowser.switchTo().frame(0);
			obrowser.findElement(By.xpath("//a[text()='org.openqa.selenium'and@target='packageFrame']")).click();
			Thread.sleep(2000);
			obrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			obrowser.switchTo().frame("packageFrame");
			obrowser.findElement(By.xpath("//span[text()='WebDriver']")).click();
			Thread.sleep(2000);
			obrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			WebElement ele=obrowser.findElement(By.xpath("//iframe[@title='Package, class and interface descriptions']"));
			obrowser.switchTo().frame(ele);
			String content=obrowser.findElement(By.xpath("/html/body/main/div[2]")).getText();
			System.out.println(content);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
