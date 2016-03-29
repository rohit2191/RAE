
package com.textField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.baseClass.Baseclass;

/**
 * @author rohit.taralkar
 * 
 * This class contains Text-Filed code using different locators
 *
 */
public class TextField extends Baseclass
{

	private static WebElement element = null;
	
	/**
	 * @param driver
	 */
	public TextField(WebDriver driver) {
		super(driver);
	}
	
		
	/**
	 * TextField using xpath locator
	 */
	public static WebElement TextField_Xpath(String Xpath, String text) throws Exception
	{
	    	try
	    	{
		       	element = driver.findElement(By.xpath(Xpath));		       
		       	element.sendKeys(text);
		    }
	    	catch (Exception e){throw(e);}
	    	
	        return element;
	 }
	
	
	/**
	 * TextField using id locator
	 */
	public static WebElement TextField_Id(String Id, String text) throws Exception
	{
	    	try
	    	{
		       	element = driver.findElement(By.id(Id));		       
		       	element.sendKeys(text);
		    }
	    	catch (Exception e){throw(e);}
	    	
	        return element;
	 }
	
	
	/**
	 * TextField using name locator
	 */
	public static WebElement TextField_Name(String Name, String text) throws Exception
	{
	    	try
	    	{
		       	element = driver.findElement(By.name(Name));		       
		       	element.sendKeys(text);
		    }
	    	catch (Exception e){throw(e);}
	    	
	        return element;
	 }
	
	
	/**
	 * TextField using tagName locator
	 */
	public static WebElement TextField_TagName(String TagName, String text) throws Exception
	{
	    	try
	    	{
		       	element = driver.findElement(By.tagName(TagName));		       
		       	element.sendKeys(text);
		    }
	    	catch (Exception e){throw(e);}
	    	
	        return element;
	 }
	
	
	/**
	 * TextField using cssSelector locator
	 */
	public static WebElement TextField_CssSelector(String CssSelector, String text) throws Exception
	{
	    	try
	    	{
		       	element = driver.findElement(By.cssSelector(CssSelector));		       
		       	element.sendKeys(text);
		    }
	    	catch (Exception e){throw(e);}
	    	
	        return element;
	 }
	
	
	/**
	 * TextField using linkText locator
	 */
	public static WebElement TextField_LinkText(String LinkText, String text) throws Exception
	{
	    	try
	    	{
		       	element = driver.findElement(By.linkText(LinkText));		       
		       	element.sendKeys(text);
		    }
	    	catch (Exception e){throw(e);}
	    	
	        return element;
	 }
	
	
	/**
	 * TextField using partialLinkText locator
	 */
	public static WebElement TextField_PartialLinkText(String PartialLinkText, String text) throws Exception
	{
	    	try
	    	{
		       	element = driver.findElement(By.partialLinkText(PartialLinkText));		       
		       	element.sendKeys(text);
		    }
	    	catch (Exception e){throw(e);}
	    	
	        return element;
	 }
	
	
	/**
	 * TextField using className locator
	 */
	public static WebElement TextField_ClassName(String ClassName, String text) throws Exception
	{
	    	try
	    	{
		       	element = driver.findElement(By.className(ClassName));		       
		       	element.sendKeys(text);
		    }
	    	catch (Exception e){throw(e);}
	    	
	        return element;
	 }
	
	

}
