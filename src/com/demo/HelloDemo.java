/*package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseClass.Baseclass;

public class HelloDemo extends Baseclass {
	
	private static WebElement element = null;
	
	public HelloDemo(WebDriver driver) {
		super(driver);
		
	}

	public void Hello(String msg)
	{
		System.out.println("Hello"+msg);
	}
	
	 public static WebElement Dropdown_Using_XPATH(String option, String xpath) throws Exception
	 {
	    	try
	    	{
		       	Select element = new Select(driver.findElement(By.xpath(xpath)));
		       
		       	element.selectByVisibleText(option);
		    }
	    	catch (Exception e){throw(e);}
	    	
	        return element;
	 }
	 


}
*/