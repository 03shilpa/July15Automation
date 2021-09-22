package com.sgtesting.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigAssig2
{
	public static WebDriver obrowser=null;
	public static void main(String[] args)
	{
		launchBrowser();
		 navigate();
		 createOperation();
		 modifyOpertion();
		deleteOperation();
		closeApplication();
	}
	static void createOperation()
	{
		try
		{
			login("admin","manager");
			 minimizeFlyOutWindow();
			 obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			 createUser("fn","fn" ,"fn@gmail.com","Fn1","fn@1");
			 Thread.sleep(4000);
			 logout();
			 login("Fn1","fn@1");
			 handleWelcomeNote();
			 obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			 createUser("sn","sn" ,"sn@gmail.com","Sn1","sn@1");
			 Thread.sleep(4000);
			 logout();
			 login("Sn1","sn@1");
			 handleWelcomeNote();
			 obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			 createUser("tn","tn" ,"tn@gmail.com","Tn1","tn@1");
			 Thread.sleep(4000);
			 logout();
			 login("Tn1","tn@1");
			 handleWelcomeNote();
			 logout();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyOpertion()
	{
		try
		{
			login("Sn1","sn@1");
			 minimizeFlyOutWindow();  
			 obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			 obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[4]/td[1]/table")).click();
			 Thread.sleep(4000);
			 modify("tn@12");
			 Thread.sleep(4000);
			 logout();
			 login("Tn1","tn@12");
			 minimizeFlyOutWindow();
			 logout();
			 login("Fn1","fn@1");
			 minimizeFlyOutWindow();
			 obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			 obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table")).click();
			 Thread.sleep(4000);
			 modify("sn@12");
			 Thread.sleep(4000);
			 logout();
			 login("Sn1","sn@12");
			 minimizeFlyOutWindow();
			 logout();
			 login("admin","manager");
			 //Thread.sleep(4000);
			// minimizeFlyOutWindow();
			 //Thread.sleep(4000);
			 obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			 obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table")).click();
			 Thread.sleep(4000);
			 modify("fn@12"); 
			 Thread.sleep(4000);
			 logout();
			 login("Fn1","fn@12");
			 Thread.sleep(4000);
			 logout();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteOperation()
	{
		try
		{
			login("Sn1","sn@12");
			// minimizeFlyOutWindow();
			 obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();  //users xpath
			 Thread.sleep(2000);
			 obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[4]/td[1]/table")).click();
			 delete();
			 logout();
			 login("Fn1","fn@12");
			// minimizeFlyOutWindow();
			 obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();  //users xpath
			 Thread.sleep(2000);
			 obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table")).click();
			 delete();
			 logout();
			 login("admin","manager");
			// minimizeFlyOutWindow();
			 obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();  //users xpath
			 //Thread.sleep(2000);
			 obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table")).click();
			 delete();
			 logout();        
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
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
	static void login(String s1,String s2)
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys(s1);
			obrowser.findElement(By.name("pwd")).sendKeys(s2);
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
	static void createUser(String a,String b,String c,String d,String f)
	{
		try
		{
			/*obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();*/
			Thread.sleep(4000);
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div ")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(a);
			obrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(b);
			obrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys(c);
			obrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys(d);
			obrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys(f);
			obrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(f);
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			
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
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();   
			}
		}
		static void handleWelcomeNote()
		{
				try
				{
					obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
					Thread.sleep(2000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		static void modify(String s)
		{
			try
			{
				obrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys(s);
				obrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(s);
				obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
				Thread.sleep(4000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		static void delete()
		{
			try
			{
				Thread.sleep(2000);
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
		static void closeApplication()
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
		
	}
