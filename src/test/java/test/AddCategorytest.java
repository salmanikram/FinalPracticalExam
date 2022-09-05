package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddCategory;


public class AddCategorytest {
	
	WebDriver driver;
@Test
	public void newcategory() {
		 
		driver= util.BrowserFactory.init();
		
		AddCategory addacategory = PageFactory.initElements(driver, AddCategory.class);
		addacategory.addcategories("SALMAN123");
		addacategory.clickAddcategorybutton();
		 
	}
	 
	 
	 
	}


