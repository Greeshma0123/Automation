package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocart {
	WebDriver Driver;
	
	@FindBy(xpath="/html/body/div[2]/header/div/div/div[2]/div/ul/li[2]/a")
	WebElement Men;
	
	@FindBy(xpath="/html/body/div[2]/header/div/div/div[2]/div/ul/li[2]/div/div/div/div/ul/li[1]/a")
	WebElement Shirts;
	
	@FindBy(xpath="//*[@id=\"product_1\"]/a/div/div[1]")
	WebElement Selectshirt;
	
	
	
	@FindBy(xpath="/html/body/div[4]/main/div[2]/div[1]/div[2]/div/div/form/div/div[3]/button")
	WebElement Addtocartbutton;
	
	public  addtocart (WebDriver driver)
	  {
	    this.Driver=driver;
	    PageFactory.initElements(driver,this);
	  }
	public void Addtocart()
	{
		Actions act=new Actions(Driver);

		act.moveToElement(Men).perform();
		
		Shirts.click();
		Selectshirt.click();
	
		Addtocartbutton.click();
	
	
	

}}
