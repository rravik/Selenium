package TestPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.baseClass;

public class googleHomePage extends baseClass{
	
	@FindBy(name="searchbox")
	WebElement search;
	
	@FindBy(name="searchbutton")
	WebElement searchbutton;
	
	
	public googleHomePage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public searchPage search(String textbox)
	{
		search.sendKeys(textbox);
		searchbutton.click();
		
		return new searchPage();
		
	}


	

}
