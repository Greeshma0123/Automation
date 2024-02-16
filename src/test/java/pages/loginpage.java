package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	WebDriver driver;
	  
	@FindBy(xpath="//*[@id=\"account-button\"]")
	WebElement Login;
	@FindBy(xpath="//*[@id=\"link-to-account\"]/a[2]")
	WebElement Logout;
	
	@FindBy(xpath="//*[@id=\"spree_user_email\"]")
	WebElement Email;
	
	@FindBy(xpath="//*[@id=\"spree_user_password\"]")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"new_spree_user\"]/input[2]")
	WebElement Loginbutton;
	
	public loginpage(WebDriver driver)
	  {
	    this.driver=driver;
	    PageFactory.initElements(driver,this);
	  }
	public void login()
	{
		String email="fdghdlaas@gmail.com";
		String password="vichu123";
		Login.click();
		Logout.click();
		Email.sendKeys(email);
		Password.sendKeys(password);
		Loginbutton.click();
		
	}


}
