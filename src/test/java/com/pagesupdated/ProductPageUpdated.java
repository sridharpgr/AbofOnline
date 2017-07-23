package com.pagesupdated;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ProductPageUpdated {
	
AndroidDriver driver = null;
	
	public ProductPageUpdated(AndroidDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="com.abof.android:id/fave_img_view")
	public WebElement AbofFavIcon;

}
