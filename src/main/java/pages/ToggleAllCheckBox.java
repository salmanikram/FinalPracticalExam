package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ToggleAllCheckBox  {
	WebDriver driver;
	
	public ToggleAllCheckBox (WebDriver driver) {
		this.driver= driver;
		
	}
		
	
	@FindBy(how = How.XPATH, using= "/html/body/div[3]/input[3]") 
	WebElement TOGGLE_ALL_CHECKBOX;
	
	public void checkmarktogglebox() {
		TOGGLE_ALL_CHECKBOX.click();
	}
	
	
		
	}


