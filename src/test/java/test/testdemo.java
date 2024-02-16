package test;

import org.testng.annotations.Test;

import basepkg.baseclass;
import pages.Registrationpage;
import pages.addtocart;
import pages.checkoutpage;
import pages.loginpage;

public class testdemo extends baseclass{
	@Test
	public void test() throws Exception
	{
		Registrationpage ob=new Registrationpage(driver);
		ob.Registration();
		loginpage ob1=new loginpage(driver);
		ob1.login();
	addtocart ob2=new addtocart(driver);
	ob2.Addtocart();
	checkoutpage ob3=new checkoutpage(driver);
	ob3.checkout();
	ob3.orderscreenshot();
	
	
	
		
		
	}

}
