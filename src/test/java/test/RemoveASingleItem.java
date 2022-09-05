package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.RemoveASingleCheckBox;


public class RemoveASingleItem {
	
	
		WebDriver driver;
		@Test
		public void userShouldBeABltoRemoveSIngleItem() {
			
		 driver= util.BrowserFactory.init();
		 
		 RemoveASingleCheckBox removeasinglecheckbox = PageFactory.initElements(driver, RemoveASingleCheckBox.class);
		 removeasinglecheckbox.clickSingleListItem();
		 removeasinglecheckbox.clickyes();

		}
		}
