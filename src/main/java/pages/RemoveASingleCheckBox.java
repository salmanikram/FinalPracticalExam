package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveASingleCheckBox {
	
	
		WebDriver driver;
		
		public RemoveASingleCheckBox(WebDriver driver) {
			this.driver= driver;
			
		}
			
		
		@FindBy(how = How.XPATH, using= "/html/body/div[3]/a[2]/span") 
		WebElement Click_Single_Listitem;
		@FindBy(how = How.XPATH, using= "/html/body/a[1]")
		WebElement Click_Yes;
		
		public void clickSingleListItem() {
			Click_Single_Listitem.click();
		}
		
		public void clickyes() {
			Click_Yes.click();
			
		}

}
	
