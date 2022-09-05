package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.ValidateToggleCheckBoxes;
import util.BrowserFactory;

public class ValidateToggleCheckBoxesTest {

	WebDriver driver;

	@Test
	public void validatetogllebuttonworking() throws InterruptedException {
		driver = BrowserFactory.init();
		Thread.sleep(2000);

		ValidateToggleCheckBoxes validatetogglecheckboxes = PageFactory.initElements(driver,
				ValidateToggleCheckBoxes.class);
		validatetogglecheckboxes.toggleAll();

		if (validatetogglecheckboxes.CheckAllElementsSelected() == true) {
			System.out.println("All items are checked)");

		}

	}
@Test
	public void checkifitemisremoved() throws InterruptedException {
		driver = BrowserFactory.init();

		ValidateToggleCheckBoxes validateifitemisremoved = PageFactory.initElements(driver,
				ValidateToggleCheckBoxes.class);
		
		validateifitemisremoved.removesingleitem();
		validateifitemisremoved.CheckIfItemIsRemoved();
		if (validateifitemisremoved.CheckIfItemIsRemoved()==true) 
			Thread.sleep(2000);
		{System.out.println("Single Item is Removed");
		}
		}
		
		public void checkifallitemsremoved() throws InterruptedException {
			driver = BrowserFactory.init();

			ValidateToggleCheckBoxes validateifallitemsremoved = PageFactory.initElements(driver,
					ValidateToggleCheckBoxes.class);
			validateifallitemsremoved.toggleAll();
			validateifallitemsremoved.removeall();
			if (validateifallitemsremoved.ifAllItemIsRemoved()==true)
				Thread.sleep(2000);
			{System.out.println("All Item is Removed");
			
			}
		}
			public void categoryadded() throws InterruptedException {
				driver = BrowserFactory.init();
				Thread.sleep(2000);

				ValidateToggleCheckBoxes categoryadded = PageFactory.initElements(driver,
						ValidateToggleCheckBoxes.class);
				categoryadded.addcategory();

				if (categoryadded.addcategroy()==true) {
					System.out.println("Category Added)");

				}
}


}