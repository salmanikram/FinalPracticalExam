package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategory {
	
WebDriver driver;
	
	public AddCategory(WebDriver driver) {
		this.driver= driver;
		
	}
		
	
	@FindBy(how = How.XPATH, using= "//input[@name=\"categorydata\"]") 
	WebElement Add_Category;
	@FindBy(how = How.XPATH,using ="//*[@id=\"extra\"]/input[2]")
	WebElement Click_Button;
	
	public void addcategories(String Category) {
		Add_Category.sendKeys(Category);
	}
	
	public void clickAddcategorybutton() {
		Click_Button.click();
		
	}

}
