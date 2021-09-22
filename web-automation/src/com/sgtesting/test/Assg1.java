package com.sgtesting.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg1
{
	public static WebDriver obrowser=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();
		
		
	}
		static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver","F:\\DemoWorkSpace\\web-automation\\library\\driver\\chromedriver.exe");
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
				obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void minimizeFlyOutWindow()
		{
			try
			{
				obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		static void  createUser()
		{
			try
			{
				obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
				Thread.sleep(2000);
				obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div ")).click();
				Thread.sleep(2000);
				obrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo7");
				obrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("user7");
				obrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo3@gamil.com");
				obrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("demouser7");
				obrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("welcome7");
				obrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("welcome7");
				obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void deleteUser()
		{
			try
			{
				obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
				Thread.sleep(4000);
				obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				Alert obj=obrowser.switchTo().alert();
				String  content=obj.getText();
				System.out.println(content);
				obj.accept();
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void logout()
		{
			try
			{
				obrowser.findElement(By.linkText("Logout")).click();
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
				//Thread.sleep(4000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
