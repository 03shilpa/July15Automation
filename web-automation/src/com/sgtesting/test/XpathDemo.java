package com.sgtesting.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo 
{
	public static WebDriver obrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		//absoluteXpath();
		//relativeXpathUsingTagNameAlone();
		//relativeXpathUsingTagNameAndIndex();
		//relativeXpathUsingTagNamewithAttributeNameValue();
		//relativeXpathUsingTagNamewithMultipleAttributeNameValue();
		//relativeXpathUsingTagNamewithMultipleAttributeNameValueUsingAndOperator();
		//relativeXpathUsingTagNamewithMultipleAttributeNameValueUsingOrOperator();
		//relativeXpathUsingTagNamewithAttributeNameValueCombination();
		//relativeXpathUsingAttributeValueAlone();
		//relativeXpathUsingTagNameAndAttributeNameAlone();
		//relativeXpathUsingTagNameAndAttributeNameAlone1();
		//relativeXpathUsingTagNameAndAttributeNameAlone2();
		//relativeXpathUsingTagNameAndAttributeNameAlone3();
		relativeXpathUsingPartialAttributeValue();
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
			obrowser.get("file:///F:/tests_2nd_sept_2021/tests_2nd_SEPT_2021/Sample.html");
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void absoluteXpath()
	{
		try
		{
			obrowser.findElement(By.id("uid1user1name1")).sendKeys("demouser1");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void relativeXpathUsingTagNameAlone()
	{
		try
		{
			obrowser.findElement(By.xpath("//input")).sendKeys("demouser1");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void relativeXpathUsingTagNameAndIndex()
	{
		try
		{
			obrowser.findElement(By.xpath("//input[2]")).sendKeys("pwddemo");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void relativeXpathUsingTagNamewithAttributeNameValue()
	{
		try
		{
			obrowser.findElement(By.xpath("//input[@value='Submit']")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void relativeXpathUsingTagNamewithMultipleAttributeNameValue()
	{
		try
		{
			obrowser.findElement(By.xpath("//input[@value='Submit'][@name='submit1btn1']")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void relativeXpathUsingTagNamewithMultipleAttributeNameValueUsingAndOperator()
	{
		try
		{
			obrowser.findElement(By.xpath("//input[@value='Submit' and @class='submit1btn1']")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void relativeXpathUsingTagNamewithMultipleAttributeNameValueUsingOrOperator()
	{
		try
		{
		  obrowser.findElement(By.xpath("//input[@value='Submit' or @name='submit1btn1']")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void relativeXpathUsingTagNamewithAttributeNameValueCombination()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@value='Submit']")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void relativeXpathUsingAttributeValueAlone()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@*='Submit']")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void relativeXpathUsingTagNameAndAttributeNameAlone()
	{
		try
		{
			List<WebElement> olinks=obrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("no of links:"+olinks.size());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void relativeXpathUsingTagNameAndAttributeNameAlone1()
	{
		try
		{
			List<WebElement> ol=obrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("no of list"+ol.size());
			for(WebElement link:ol)
			{
				String name=link.getText();
				System.out.println(name);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void relativeXpathUsingTagNameAndAttributeNameAlone2()
	{
		try
		{
			List<WebElement> ole=obrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("no of link"+ole.size());
			for(WebElement link:ole)
			{
				String name=link.getText();
				if(name.endsWith("Insitute"))
				{
					link.click();
					break;
				}
			}
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void relativeXpathUsingTagNameAndAttributeNameAlone3()
	{
		try
		{
			List<WebElement> ol=obrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("no of links "+ol.size());
			for(int i=0;i<ol.size();i++)
			{
				WebElement link=ol.get(i);
				String name=link.getText();
				if(name.startsWith("Sel"))
				{
					link.click();
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void relativeXpathUsingPartialAttributeValue()
	{
		try
		{
			obrowser.findElement(By.xpath("//input[starts-with(@id,'rad2')]")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
