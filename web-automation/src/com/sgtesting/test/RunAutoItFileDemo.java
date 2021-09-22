package com.sgtesting.test;

public class RunAutoItFileDemo
{
	public static void main(String[] args) 
	{
		try
		{
			Runtime obj=Runtime.getRuntime();
			obj.exec("F:\\sd2.exe");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
