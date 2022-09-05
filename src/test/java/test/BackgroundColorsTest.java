package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import pages.BackgroundColors;

public class BackgroundColorsTest {
	
	WebDriver driver;
	@Test
		public void changebackgroundcolors() {
			 
			driver= util.BrowserFactory.init();
			
			BackgroundColors backgroundcolor = PageFactory.initElements(driver, BackgroundColors.class);
			backgroundcolor.skybluecolor();
			backgroundcolor.whitecolor();

}
}
