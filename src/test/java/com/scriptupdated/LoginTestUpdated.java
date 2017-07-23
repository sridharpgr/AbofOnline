package com.scriptupdated;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.libraryupdated.BaseClassUpdated;
import com.libraryupdated.GenericClassUpdated;
import com.pagesupdated.LoginPageUpdated;

public class LoginTestUpdated extends BaseClassUpdated{
	
	public String[] Sdata=null;
	
	@Test
	public void loginToAbofApplication() throws Exception{
		
		LoginPageUpdated loginpage = new LoginPageUpdated(driver);
		
		try{
			Sdata=GenericClassUpdated.getExcelData("Login_01");
//			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			loginpage.AbofProfileListIcon.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			loginpage.AbofUserProfile.click();
			loginpage.AbofYourEmailID.click();
			loginpage.AbofUserNameTextBox.sendKeys(Sdata[1]);
			loginpage.AbofPasswordTextBox.sendKeys(Sdata[2]);
			loginpage.AbofSigninbutton.click();
			
		}catch(Exception e){
			e.printStackTrace();
		}	
	}
}
