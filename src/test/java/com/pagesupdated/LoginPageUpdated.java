package com.pagesupdated;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LoginPageUpdated {
	
	AndroidDriver driver = null;
	
	public LoginPageUpdated(AndroidDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//android.widget.ImageButton[@index='0']")
	public WebElement AbofProfileListIcon;
	
	@FindBy(id="com.abof.android:id/user_profile")
	public WebElement AbofUserProfile;
	
	@FindBy(id="com.abof.android:id/email_login_btn")
	public WebElement AbofYourEmailID;
	
	@FindBy(id="com.abof.android:id/login_email_edt")
	public WebElement AbofUserNameTextBox;
	
	@FindBy(id="com.abof.android:id/login_password_edt_edt")
	public WebElement AbofPasswordTextBox;
	
	@FindBy(id="com.abof.android:id/abof_login_btn")
	public WebElement AbofSigninbutton;
	
	

}
