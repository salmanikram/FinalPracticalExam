package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundColors {
	
WebDriver driver;
	
	public BackgroundColors(WebDriver driver) {
		this.driver= driver;
		
	}
		
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"extra\"]/button[1]") 
	WebElement SKY_Blue_Color;
	@FindBy(how = How.XPATH,using ="//*[@id=\"extra\"]/button[2]")
	WebElement White_Color;
	
	public void skybluecolor() {
		SKY_Blue_Color.click();
	}
	
	public void whitecolor() {
		White_Color.click();
		
	} 

}
