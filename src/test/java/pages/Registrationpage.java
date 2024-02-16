package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/header/div/div/div[3]/ul/li[2]/div/button")
	WebElement Account;
	
	@FindBy(xpath="//*[@id=\"link-to-account\"]/a[2]")
	WebElement Signup;
	
	@FindBy(xpath="//*[@id=\"spree_user_email\"]")
	WebElement Email;
	
	@FindBy(xpath="//*[@id=\"spree_user_password\"]")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"spree_user_password_confirmation\"]")
	WebElement Passwordconformation;
	
	@FindBy(xpath="//*[@id=\"new_spree_user\"]/div/div[5]/input")
	WebElement signupbutton;
	
	public Registrationpage(WebDriver driver)
	  {
	    this.driver=driver;
	    PageFactory.initElements(driver,this);
	  }
	
	public void Registration()
	{
		String email="fdghdlaas@gmail.com";
		String password="vichu123";
		
		Account.click();
		Signup.click();
		Email.sendKeys(email);
		Password.sendKeys(password);
		Passwordconformation.sendKeys(password);
		signupbutton.click();
	}
	
}
	
	
	


