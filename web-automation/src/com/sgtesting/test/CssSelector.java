package com.sgtesting.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector 
{
	public static WebDriver obrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		//absoluteCssSelector();
		//relativeCssWithTagName();
		//relativeCssWithTagNameAndIdAttributeValue();
		//relativeCssWithIdAttributeValue();
		//relativeCssWithTagNameAndClassAttributeValue();
		//relativeCssWithClassAttributeValue();
		//relativeCssWithTagNameAndAttributeNameAndValue();
		//relativeCssWithAttributeNameAndValue();
		//relativeCssWithTagNameAndMultipleAttributeNameAndValue();
		//relativeCssWithAndMultipleAttributeNameAndValue();
		//relativeCssWithTagNameAndAttributeName();
		//relativeCssWithPartialMatchingAttributeValue();
		//relativeCssWithParentReference();
		//relativeCssWithChildReference();
		relativeCssWithSiblingApproach();
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
			obrowser.get("file:///C:/Users/win10/Downloads/css_selector_13th_sept_2021/CSS_Selector_13th_Sept_2021/Sample.html");
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void absoluteCssSelector()
	{
		obrowser.findElement(By.cssSelector("html body div form input ")).sendKeys("demouser1");
	}
	static void relativeCssWithTagName()
	{
		obrowser.findElement(By.cssSelector("input")).sendKeys("demouser1");
	}
	static void  relativeCssWithTagNameAndIdAttributeValue()
	{
		obrowser.findElement(By.cssSelector("input#uid1user1name1")).sendKeys("demouser1");
		
	}
	static void relativeCssWithIdAttributeValue()
	{
		obrowser.findElement(By.cssSelector("#uid1user1name1")).sendKeys("demouser1");
	}
	static void relativeCssWithTagNameAndClassAttributeValue()
	{
		obrowser.findElement(By.cssSelector("input.user1name1")).sendKeys("demouser1");
	}
	static void relativeCssWithClassAttributeValue()
	{
		obrowser.findElement(By.cssSelector(".user1name1")).sendKeys("demouser1");
	}
	static void relativeCssWithTagNameAndAttributeNameAndValue()
	{
		obrowser.findElement(By.cssSelector("input[value='Submit']")).click();
	}
	static void relativeCssWithAttributeNameAndValue()
	{
		obrowser.findElement(By.cssSelector("[value='Submit']")).click();
	}
	static void relativeCssWithTagNameAndMultipleAttributeNameAndValue()
	{
		obrowser.findElement(By.cssSelector("input[value='Submit'][name='submit1btn1']")).click();
	}
	static void relativeCssWithAndMultipleAttributeNameAndValue()
	{
		obrowser.findElement(By.cssSelector("[value='Submit'][name='submit1btn1']")).click();
	}
	static void relativeCssWithTagNameAndAttributeName()
	{
		List<WebElement> olink=obrowser.findElements(By.cssSelector("a[href]"));
		System.out.println("# of links : "+olink.size());
		for(int i=0;i<olink.size();i++)
		{
			WebElement link=olink.get(i);
			System.out.println(link.getText());
		}
	}
	static void relativeCssWithPartialMatchingAttributeValue()
	{
		obrowser.findElement(By.cssSelector("input[id*='submit1']")).click();
	}
	static void relativeCssWithParentReference()
	{
		obrowser.findElement(By.cssSelector("form#frm2>input")).click();
	}
	static void relativeCssWithChildReference()
	{
		obrowser.findElement(By.cssSelector("form#frm3>:nth-child(1)")).sendKeys("demouser1");
		obrowser.findElement(By.cssSelector("form#frm3>:nth-child(5)")).sendKeys("demouser5");
	}
	static void relativeCssWithSiblingApproach()
	{
		obrowser.findElement(By.cssSelector("form#frm3>input+input+input")).sendKeys("demouser123");
	}

}
