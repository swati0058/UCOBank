package com.UCO.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CommonHelper {

	public void AssertHomePage(WebDriver driver) throws InterruptedException {

		Thread.sleep(30);
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		String exceptedURL = "https://ucobank.com/en/";
		Assert.assertEquals(actualurl, exceptedURL, "Page title doesn't match");

		// TODO Auto-generated method stub

	}
	
	public void ImageLOGO_Validation(WebDriver driver) throws InterruptedException {

		driver.findElement(By.xpath("//div[@class='logo']//a[@href='/en/home']//img")).click();
	//	Assert.assertTrue(image.isDisplayed(), "Image is not displayed");

	}
	
	public void FontSize_Validation(WebDriver driver, String size_font,String resetOption) throws InterruptedException {

	if(size_font.equalsIgnoreCase("Increase")) {
	WebElement bigfontsize=	driver.findElement(By.id("btn-increase"));
    bigfontsize.click();
	System.out.println("clicked on Zoom");
	}
	else if(size_font.equalsIgnoreCase("decrease")) {
		WebElement smallfontsize=	driver.findElement(By.id("btn-decrease"));
		smallfontsize.click();
		System.out.println("clicked on decrease button");
		}
	
	 if(resetOption.equalsIgnoreCase("reset")) {
		WebElement resetfontsize=	driver.findElement(By.id("btn-orig"));
		resetfontsize.click();
		System.out.println("clicked on reset ");
	}
	
	
	
	//	Assert.assertTrue(image.isDisplayed(), "Image is not displayed");

	}

	public void Side_PanelOperations_Validation(WebDriver driver, String Button,String dropdown_option) throws InterruptedException {

	//	Thread.sleep(50);
//	driver.findElement(By.xpath("//div[@id='fragment-6126cc81-cc14-20b3-4cee-12b491e6b56a']//a//span[text()='"+Button+"']"));
	//	Assert.assertTrue(image.isDisplayed(), "Image is not displayed");
	WebElement button=	driver.findElement(By.xpath("//span[normalize-space()='"+Button+"']"));
	
	Actions action= new Actions(driver);
	action.moveToElement(button).build().perform();

	WebElement element=driver.findElement(By.xpath("//div[@class='megaTxt']//h5[text()='" + dropdown_option + "']"));	
	  JavascriptExecutor js = (JavascriptExecutor) driver;

      // Execute JavaScript to scroll the element into view
      js.executeScript("arguments[0].scrollIntoView(true);", element);
      Thread.sleep(50);
      
      WebElement clickbutton= driver.findElement(By.xpath("//div[@class='megaTxt']//h5[text()='UCO Suryodaya Loan']//parent::div//a"));
      clickbutton.click();
      
    Thread.sleep(80);
	
      
     // String actualtitle=driver.findElement(By.xpath("//div[@class='main-content container']//h1")).getText();
     // System.out.println("----------"+actualtitle);
      
    //  String expectedTitle=dropdown_option;
      
  //	Assert.assertEquals(actualtitle, expectedTitle, "Title doesnt match");

      
	System.out.println("Button "+Button+ "has been clicked");
	System.out.println("---------------dropdown_option "+dropdown_option+ "has been clicked");
	
	
	
	
	}

}
