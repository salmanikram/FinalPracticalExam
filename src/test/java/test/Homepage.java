package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import pages.ToggleAllCheckBox;

public class Homepage {
	WebDriver driver;
	
	@Test
	public void userShouldBeOnHomePage() {
		
	 driver= util.BrowserFactory.init();
	 
	 ToggleAllCheckBox toggleallcheckBox = PageFactory.initElements(driver, ToggleAllCheckBox.class);
	 toggleallcheckBox.checkmarktogglebox();
	 

	}
	
	
	

}
