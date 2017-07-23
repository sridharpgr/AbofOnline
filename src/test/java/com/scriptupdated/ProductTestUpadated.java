package com.scriptupdated;

import org.testng.annotations.Test;

import com.libraryupdated.BaseClassUpdated;
import com.libraryupdated.GenericClassUpdated;
import com.pagesupdated.HomePageUpdated;
import com.pagesupdated.LoginPageUpdated;
import com.pagesupdated.ProductPageUpdated;

public class ProductTestUpadated extends BaseClassUpdated{
	
	@Test
	public void clickOnNewInOption() throws Exception{
		
		LoginPageUpdated loginpage = new LoginPageUpdated(driver);
		HomePageUpdated homepage = new HomePageUpdated(driver);
		ProductPageUpdated productpage = new ProductPageUpdated(driver);
		
		try{
			Thread.sleep(5000);
			homepage.AbofMenTab.click();
			homepage.AbofNewInOption.get(1).click();
			homepage.AbofClothingOption.click();
			Thread.sleep(3000);
			productpage.AbofFavIcon.click();
			String text=GenericClassUpdated.verifyToastMessage(driver);
//			if(text.contains(arg0))
			System.out.println(text);
			Thread.sleep(4000);
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
