package com.PageObjectModel;

import com.BaseClass.BaseClass1;
import com.POMClass.LoginPagePOM;


public class PageObjectManager extends BaseClass1 {
private LoginPagePOM lp;
	
	public LoginPagePOM getLp() {
		if(lp==null) {
			lp=new LoginPagePOM(driver);
		}
		return lp;
		
	}
}



