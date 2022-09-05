package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidateToggleCheckBoxes {
	
	WebDriver driver;

	public  ValidateToggleCheckBoxes (WebDriver driver) {
		this.driver= driver;	
	}
		
	@FindBy(how= How.XPATH,using= "//input[@name='allbox']") 
	WebElement Toggle_All;
	@FindBy(how = How.XPATH,using="/html/body/div[3]/a[110]/span") 
	WebElement Remove_Single_Item;
	@FindBy(how = How.XPATH,using="/html/body/a[1]") 
	WebElement Click_Yes;	
	@FindBy(how = How.XPATH,using="/html/body/div[3]/input[1]") 
	WebElement RemoveAll;
	@FindBy(how=How.XPATH,using="//input[@value='Add category']")
	WebElement ADD_CATEGORY;
	
	public void toggleAll() {
		Toggle_All.click();
	}
	public boolean CheckAllElementsSelected() {
		return Toggle_All.isSelected();
		
	}
	
	public void removesingleitem() {
		Remove_Single_Item.click();
		Click_Yes.click();
	}
	public boolean CheckIfItemIsRemoved() {
		return Click_Yes.isSelected();
		
	}
	
	public void removeall() throws InterruptedException {
		Toggle_All.click();
		Thread.sleep(2000);
		RemoveAll.click();
	}
	public boolean ifAllisChecked()
	{
	return Toggle_All.isSelected();
	}

	public boolean ifAllItemIsRemoved()
	{
	return RemoveAll.isSelected();
	}
	
	public void addcategory() {
		ADD_CATEGORY.sendKeys("ABCD");
		ADD_CATEGORY.click();
		
	}public boolean addcategroy()
	{
	return ADD_CATEGORY.isSelected();
}
}
