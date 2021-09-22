package com.sgtesting.POm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPage 
{
	public ActiPage(WebDriver obrowser)
	{
		PageFactory.initElements(obrowser,this);
	}
	
	private WebElement username;
	public WebElement getUsername()
	{
		return username;
	}
	
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	private WebElement ologin;
	public WebElement getLoginButton()
	{
		return ologin;	
	}
	
	private WebElement gettingStartedShortcutsPanelId;  
	public WebElement getFlyoutWin()
	{
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement User;
	public WebElement user()
	{
		return User;
	}
	
	@FindBy(xpath="//*[@id='createUserDiv']/div/div[2]")
	private WebElement CreateUser;
	public WebElement createUser()
	{
		return CreateUser;
	}
	
	private WebElement userDataLightBox_firstNameField;
	public WebElement fn()
	{
		return userDataLightBox_firstNameField;
	}
	
	private WebElement userDataLightBox_lastNameField;
	public WebElement ln()
	{
		return userDataLightBox_lastNameField; 
	}
	
	private WebElement userDataLightBox_emailField;
	public WebElement email()
	{
		return userDataLightBox_emailField;
	}
	public WebElement userDataLightBox_usernameField;
	public WebElement un()
	{
		return userDataLightBox_usernameField;
	}
	
	public WebElement userDataLightBox_passwordField;
	public WebElement pwd()
	{
		return userDataLightBox_passwordField;
	}
	
	public WebElement userDataLightBox_passwordCopyField;
	public WebElement retypePwd()
	{
		return userDataLightBox_passwordCopyField;
	}
	
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement CreateButton;
	public WebElement createButton()
	{
		return CreateButton;
	}
	
	@FindBy(xpath="//table[@class='userNameContainer']")
	private WebElement clickTodelete;
	public WebElement clickTodelete()
	{
		return clickTodelete;
	}
	
	@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement clickOndelete;
	public WebElement clickOndelete()
	{
		return clickOndelete; 
	}
	
	/*private WebElement userDataLightBox_deleteBtn;
	public WebElement clickOnDelete()
	{
		return userDataLightBox_deleteBtn;
	}*/
	
	private WebElement logoutLink;
	public WebElement getLogout()
	{
		return logoutLink;
	}
	
	private WebElement userDataLightBox_commitBtn;
	public WebElement commitButton()
	{
		return userDataLightBox_commitBtn; 
	}
	
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a")
	private WebElement clickOnTask;
	public WebElement clickOnTask()
	{
		return clickOnTask;
	}
	
	//@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")
	//private WebElement 

}
