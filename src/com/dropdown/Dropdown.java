package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.baseClass.Baseclass;

/**
 * @author rohit.taralkar
 * 
 * This class contains Dropdown code for by different locators.
 *
 */
public class Dropdown extends Baseclass
{

	private static WebElement element = null;
	
	
	public Dropdown(WebDriver driver) {
		super(driver);
	}
	
	
	/**
	* Dropdown using xpath locator
	*/
	public static WebElement Dropdown_Xpath(String xpath, String option) throws Exception
	 {
	    	try
	    	{
		       	Select element = new Select(driver.findElement(By.xpath(xpath)));		       
		       	element.selectByVisibleText(option);
		    }
	    	catch (Exception e){throw(e);}
	    	
	        return element;
	 }
	
	
	/**
	 * Dropdown using id locator
	 */
	 public static WebElement Dropdown_Id(String Id, String option) throws Exception
	 {
	    	try
	    	{
		       	Select element = new Select(driver.findElement(By.id(Id)));		       
		       	element.selectByVisibleText(option);
		    }
	    	catch (Exception e){throw(e);}
	    	
	        return element;
	 }
	
	 
	 /**
	 * Dropdown using name locator
	 */
	public static WebElement Dropdown_Name(String Name, String option) throws Exception
	 {
	    	try
	    	{
		       	Select element = new Select(driver.findElement(By.name(Name)));		       
		       	element.selectByVisibleText(option);
		    }
	    	catch (Exception e){throw(e);}
	    	
	        return element;
	 }
	 
	
	 /**
	 * Dropdown using tagName locator
	 */
	public static WebElement Dropdown_TagName(String TagName, String option) throws Exception
	 {
	    	try
	    	{
		       	Select element = new Select(driver.findElement(By.tagName(TagName)));		       
		       	element.selectByVisibleText(option);
		    }
	    	catch (Exception e){throw(e);}
	    	
	        return element;
	 }
	 
	
	 /**
	 * Dropdown using cssSelector locator
	 */
	public static WebElement Dropdown_CssSelector(String CssSelector, String option) throws Exception
	 {
	    	try
	    	{
		       	Select element = new Select(driver.findElement(By.cssSelector(CssSelector)));		       
		       	element.selectByVisibleText(option);
		    }
	    	catch (Exception e){throw(e);}
	    	
	        return element;
	 }
	 
	 
	/**
	 *Dropdown using linkText locator 
	 */
	public static WebElement Dropdown_LinkText(String LinkText, String option) throws Exception
	 {
	    	try
	    	{
		       	Select element = new Select(driver.findElement(By.linkText(LinkText)));		       
		       	element.selectByVisibleText(option);
		    }
	    	catch (Exception e){throw(e);}
	    	
	        return element;
	 }
	 
	
	/**
	 *Dropdown using partialLinkText locator 
	 */
	public static WebElement Dropdown_PartialLinkText(String PartialLinkText, String option) throws Exception
	 {
	    	try
	    	{
		       	Select element = new Select(driver.findElement(By.partialLinkText(PartialLinkText)));		       
		       	element.selectByVisibleText(option);
		    }
	    	catch (Exception e){throw(e);}
	    	
	        return element;
	 }
	
	
	/**
	 *Dropdown using className locator 
	 */
	public static WebElement Dropdown_ClassName(String ClassName, String option) throws Exception
	 {
	    	try
	    	{
		       	Select element = new Select(driver.findElement(By.className(ClassName)));		       
		       	element.selectByVisibleText(option);
		    }
	    	catch (Exception e){throw(e);}
	    	
	        return element;
	 }
	
	
}
