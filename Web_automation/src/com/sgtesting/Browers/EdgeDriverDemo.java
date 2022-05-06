package com.sgtesting.Browers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		launchBrowser1();
		navigate();
		closeApplication();
	}
	private static void launchBrowser1()
	{
		try
		{
			System.setProperty("webdriver.edge.driver", "E:\\ExampleAutomation\\Web_automation\\Library\\Driver\\msedgedriver.exe");
			oBrowser=new EdgeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

