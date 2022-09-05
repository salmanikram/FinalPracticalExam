package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RemoveAllItems {
	
	WebDriver driver;
	
	public RemoveAllItems(WebDriver driver) {
		this.driver= driver;
		
	}
	
	@FindBy(how = How.XPATH, using= "/html/body/div[3]/input[3]") 
	WebElement TOGGLE_ALL_CHECKBOX;
	@FindBy(how = How.XPATH, using= "/html/body/div[3]/input[1]") 
	WebElement Click_Remove_Item;
	
	public void checkmarktogglebox() {
		TOGGLE_ALL_CHECKBOX.click();
	}
	
	
	public void clickremove() {
		Click_Remove_Item.click();
	}
	

	}


