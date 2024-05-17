package com.UCO.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.UCO.utilities.CommonHelper;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FrontPageUCO extends BaseClass_UCO {
	public static String font_Size = "decrease";
	public static String resetButton= "reset";
	public static String operations_button= "Borrow";
	public static String dropdown_option= "UCO Suryodaya Loan";
	


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://ucobank.com/");
		commonHelper = new CommonHelper();
	//	commonHelper.AssertHomePage(driver);
		
	//	commonHelper.ImageLOGO_Validation(driver);

	//	commonHelper.FontSize_Validation(driver,font_Size,resetButton);
		commonHelper.Side_PanelOperations_Validation(driver,operations_button,dropdown_option);

	}

}
