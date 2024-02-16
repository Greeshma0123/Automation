package pages;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutpage {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[4]/main/div[4]/div/div/div[3]/div/div[1]/div/a")
	WebElement checkoutbutton;
	
	@FindBy(xpath="//*[@id=\"order_bill_address_attributes_firstname\"]")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"order_bill_address_attributes_lastname\"]")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"order_bill_address_attributes_address1\"]")
	WebElement address;
	
	@FindBy(xpath="//*[@id=\"order_bill_address_attributes_address2\"]")
	WebElement addresscontd;
	
	@FindBy(xpath="//*[@id=\"order_bill_address_attributes_city\"]")
	WebElement city;
	
	@FindBy(xpath="//*[@id=\"order_bill_address_attributes_state_id\"]")
	WebElement state;
	
	@FindBy(xpath="//*[@id=\"order_bill_address_attributes_zipcode\"]")
	WebElement zipcode;
	
	@FindBy(xpath="//*[@id=\"order_bill_address_attributes_country_id\"]")
	WebElement country;
	
	@FindBy(xpath="//*[@id=\"order_bill_address_attributes_phone\"]")
	WebElement phone;
	
	@FindBy(xpath="//*[@id=\"checkout-summary\"]/div/div[2]/input")
	WebElement saveandcontinue;
	
	@FindBy(xpath="/html/body/div[3]/main/div/div[2]/form/div[1]/div/div/div/div/ul/li[2]/label/span[1]")
	WebElement Deliverymtd;
	
	@FindBy(xpath="//*[@id=\"checkout-summary\"]/div/div[2]/input")
	WebElement saveandcontinue2;
	
	@FindBy(xpath="/html/body/div[3]/main/div/div[2]/form/div[1]/div/div/ul/li[2]/label")
	WebElement Cheque;
	
	
	
	@FindBy(xpath="/html/body/div[3]/main/div/div[2]/form/div[2]/div/div[2]/input")
	WebElement Saveaandcontinue3;
	
	
	
	
	
	public  checkoutpage (WebDriver driver)
	  {
	    this.driver=driver;
	    PageFactory.initElements(driver,this);
	  }
	public void checkout()
	
	
	
	{
		checkoutbutton.click();
		firstname.sendKeys("greeshma");
		lastname.sendKeys("greeshu");
		address.sendKeys("gopu nivas venoly pudussery palakkad");
		addresscontd.sendKeys("palakkad");
		city.sendKeys("palakkad");
		state.sendKeys("kerala");
		zipcode.sendKeys("C1E 9Z9");
		country.sendKeys("canada");
		phone.sendKeys("9876543210");
		saveandcontinue.click();
	Deliverymtd.click();
	saveandcontinue2.click();
	Cheque.click();
	Saveaandcontinue3.click();
	
	
	
		
	}
	public void orderscreenshot() throws Exception
	{
		
		File orderscr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(orderscr, new File("./Screenshot/OrderConfirmation.png"));
		
	}
	
	
	
	
	
	
	
	

}
