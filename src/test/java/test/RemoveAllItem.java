package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.RemoveAllItems;


public class RemoveAllItem {

WebDriver driver;

@Test
public void removeallitemswhentogglecheck() {
	
 driver= util.BrowserFactory.init();
 

 RemoveAllItems removeallitems = PageFactory.initElements(driver, RemoveAllItems.class);
 removeallitems.checkmarktogglebox();
 removeallitems.clickremove();
 
 
}
		
	
	
	
	
	}
	
	


