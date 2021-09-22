package com.jscript.javaedt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEd 
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
			launchBrowser();
			navigate();
			displayTitle();
			displayURL();
			displayLinksCount();
		//	enterTextInTextField();
		//	enterTextInTextField1();
		//	clickOnButton1();
		//	clickOnButton2();
		//	clickOnCheckBox1();
		//	clickOnCheckBox2();
			selectItemFromDropDown();
		}
		static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void navigate()
		{
			try
			{
				oBrowser.get("file:///G:/HTML/Sample.html");
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void displayTitle()
		{
			try
			{
				JavascriptExecutor js=(JavascriptExecutor) oBrowser;
				String title=(String) js.executeScript("var kk=document.title;return kk;");
				System.out.println("Title :"+title);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void displayURL()
		{
			try
			{
				JavascriptExecutor js=(JavascriptExecutor) oBrowser;
				String url=(String) js.executeScript("var kk=document.URL;return kk;");
				System.out.println("URL :"+url);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void displayLinksCount()
		{
			try
			{
				JavascriptExecutor js=(JavascriptExecutor) oBrowser;
				long lcount=(long) js.executeScript("var kk=document.getElementsByTagName('A');return kk.length;");
				System.out.println("# of Links :"+lcount);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void enterTextInTextField()
		{
			try
			{
				JavascriptExecutor js=(JavascriptExecutor) oBrowser;
				js.executeScript("document.getElementById('uid1user1name1').value='DemoUser1';");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void enterTextInTextField1()
		{
			try
			{
				JavascriptExecutor js=(JavascriptExecutor) oBrowser;
				WebElement oEle=oBrowser.findElement(By.id("uid1user1name1"));
				js.executeScript("arguments[0].value='DemoUser1'",oEle);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void clickOnButton1()
		{
			try
			{
				JavascriptExecutor js=(JavascriptExecutor) oBrowser;
				js.executeScript("document.getElementById('btn1submit1button1').click();");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		static void clickOnButton2()
		{
			try
			{
				JavascriptExecutor js=(JavascriptExecutor) oBrowser;
				WebElement oEle=oBrowser.findElement(By.id("btn1submit1button1"));
				js.executeScript("arguments[0].click();",oEle);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void clickOnCheckBox1()
		{
			try
			{
				JavascriptExecutor js=(JavascriptExecutor) oBrowser;
				js.executeScript("document.getElementById('chk1windows').click();");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void clickOnCheckBox2()
		{
			try
			{
				JavascriptExecutor js=(JavascriptExecutor) oBrowser;
				WebElement oEle=oBrowser.findElement(By.id("chk1windows"));
				js.executeScript("arguments[0].click();",oEle);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void selectItemFromDropDown()
		{
			try
			{
				JavascriptExecutor js=(JavascriptExecutor) oBrowser;
				String str="var items=document.getElementById('tools');";
				str+="for(var i=0;i<items.length;i++)";
				str+="{";
				str+="if(items.options[i].text='Selenium WebDriver')";
				str+="{";
				str+="items.options[i].selected='1';";
				str+="}";
				str+="}";
				js.executeScript(str);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		

	}

